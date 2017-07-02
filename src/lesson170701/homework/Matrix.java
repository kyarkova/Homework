package lesson170701.homework;

import java.util.Random;

/**
 * Created by kseni on 01.07.2017.
 */
public class Matrix {
    static Random random = new Random();

    public static void main(String[] args) {

        int[][] nums = {
                {genEl(), genEl(), genEl(), genEl(),},
                {genEl(), genEl(), genEl(), genEl(),},
                {genEl(), genEl(), genEl(), genEl(),},
                {genEl(), genEl(), genEl(), genEl(),},
                {genEl(), genEl(), genEl(), genEl(),},
                {genEl(), genEl(), genEl(), genEl(),},
                {genEl(), genEl(), genEl(), genEl(),},
        };

        sumPos(nums);
    }

    private static void sumPos(int[][] nums) {
        for (int[] raw : nums) {
            for (int elem : raw) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        int sum = 0;

        OUTER:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] < 0) {
                    sum = 0;
                    continue OUTER;
                }
                sum += nums[i][j];
            }
            System.out.println("Сумма элементов строки " + i + " : " + sum);
            sum = 0;
        }
    }

    // Возвращает число от -50 до 50
    private static int genEl() {
        return random.nextInt(101) - 50;
    }
}
