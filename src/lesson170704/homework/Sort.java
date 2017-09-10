package lesson170704.homework;

import java.util.Arrays;
import java.util.Random;

// отсортировать миллион целых чисел. сравнить стандартный Arrays.sortCountingByte и Radix
public class Sort {


    public static void main(String[] args) {
        Random random = new Random();

        int[] arr = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            arr[i] = random.nextInt(1_000_000);
        }

        long start = System.currentTimeMillis();

        Arrays.sort(arr);

        long end = System.currentTimeMillis();
        System.out.println(end - start);

        start = System.currentTimeMillis();

        end = System.currentTimeMillis();
    }
}
