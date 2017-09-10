package lesson170817.homework;


import java.util.Arrays;
import java.util.Random;

public class CountingSortInt {
    public static void main(String[] args) {
        Random r = new Random();
        int [] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = r.nextInt(2000)-1000;
        }
        sortCountingByte(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortCountingByte(int[] arr) {
        final int W = 4;
        int N = arr.length;
        int R = 256;
        int[] aux = new int[N];

        for (int d = 0; d < W; d++) {
            int[] count = new int[R + 1];
            for (int i = 0; i < N; i++) {
                int c = computeByte(arr[i], d);
                count[c + 1]++;
            }

            for (int r = 0; r < R; r++) {
                count[r + 1] += count[r];
            }

            if (d == W - 1) {
                int shift1 = count[R] - count[R / 2];
                int shift2 = count[R / 2];
                for (int r = 0; r < R / 2; r++) {
                    count[r] += shift1;
                }
                for (int r = R / 2; r < R; r++) {
                    count[r] -= shift2;
                }
            }

            for (int i = 0; i < N; i++) {
                int c = computeByte(arr[i], d);
                aux[count[c]++] = arr[i];
            }

            for (int i = 0; i < N; i++) {
                arr[i] = aux[i];
            }
        }
    }

    private static int computeByte(int value, int cur) {
        return (value >> 8 * cur) & 255;
    }
}



