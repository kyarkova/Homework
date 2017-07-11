package lesson170624.classwork;

/**
 * Created by kseni on 24.06.2017.
 */
public class MathUtils {

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a > b) ? b : a;
    }

    //- sign(int a) - высисление знака числа: -1 если отрицательно, 1 если положительное, 0 если 0
    public static int sign(int a) {
        if (a < 0) {
            return -1;
        } else if (a > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    //- mod(int a, int b) - вычисление отстатка от деления нацело, не используя оператор %
    public static int mod(int a, int b) {
        return a - a / b * b;
    }

    //- isPrime(int a) - если число простое, вернуть true, иначе false
    public static boolean isPrime(int a) {
        if (a <= 1) {
            return false; //простые числа - числа больше единицы
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    //- isFibonacci(int a) - если это число из ряда Фибоначчи - вернуть true, иначе false
    public static boolean isFibonacci(int a) {
        if (a < 0 | a == Integer.MAX_VALUE) {
            return false;
        }
        if (a == 0 | a == 1) {
            return true;
        }

        int temp1 = 1;
        int temp2 = 1;
        int sum = 0;
        while (sum < a) {
            sum = temp1 + temp2;
            temp1 = temp2;
            temp2 = sum;
        }
        return sum == a;
    }
}
