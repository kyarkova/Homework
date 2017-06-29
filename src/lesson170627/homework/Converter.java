package lesson170627.homework;

/**
 * Created by kseni on 27.06.2017.
 */
public class Converter {
    /**
     * Перевод чисел десятичной системы исчисления в двоичную
     * @param i     - число в десятичной системе исчисления
     * @param radix - основание системы исчисления, в которую нужно перевести число
     * @return строку, содержащую результирующее число
     */
    public static String toStringUnivers(int i, int radix) {
        // общее число цифр и букв англ. алфавита, позволяет переводить числа до основания 35
        if (radix > 36 || radix < 2) return "Error! Введите основание системы исчисления от 2 до 35!";
        if (i >= -radix & i <= radix)
            return "" + i;  // если число меньше, чем основание системы исчисления, то оно и является ответом
        char chars[] = { // вспомогательный массив для хранения символов итогового числа
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
                'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z'};
        String res = "";  // результурующая строка
        long temp = 0; //вспомогательная переменная
        long l = i; // long - защищает от переполенния
        boolean neg = (i < 0);
        while (Math.abs(l) >= radix) { //пока есть возщможность делить на radix
            temp = l % radix; // сохраняем осток от деления
            res = chars[Math.abs((int) temp)] + res; // присоединяем соответствующий сумме остатка символ из массива символов
            l /= radix; // делим число на основание
        }
        res = chars[Math.abs((int) l)] + res;
        return neg ? "-" + res : res; //если число было отрицательным - добавляем минус
    }

    /**
     * Перевод чисел десятичной системы исчисления в двоичную
     *
     * @param i - число в десятичной системе исчисления
     * @return строку, содержащую результирующее число
     */
    public static String toBinaryString(int i) {
        if (i == 0) return "0";
        String res = "";
        boolean neg = (i < 0);
        int temp = 0;
        while (i != 0) {
            temp = i % 2;
            res = Math.abs(temp) + res;
            i /= 2;
        }
        return neg ? "-" + res : res;
    }

    /**
     * Перевод чисел десятичной системы исчисления в шестнадцатиричную
     *
     * @param i - число в десятичной системе исчисления
     * @return строку, содержащую результирующее число
     */
    public static String toHexString(int i) {
        if (i >= -16 & i <= 16) return "" + i;
        // вспомогательный массив для хранения символов итогового числа
        char chars[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        String res = "";
        long temp = 0;
        long l = i;
        boolean neg = (i < 0);
        while (Math.abs(l) > 16) {
            temp = l % 16;
            res = chars[Math.abs((int) temp)] + res;
            l /= 16;
        }
        res = chars[Math.abs((int) l)] + res;
        return neg ? "-" + res : res;
    }

    /**
     * Перевод чисел десятичной системы исчисления в восьмиричную
     *
     * @param i - число в десятичной системе исчисления
     * @return строку, содержащую результирующее число
     */
    public static String toOctalString(int i) {
        if (i >= -8 & i <= 8) return "" + i;
        String res = "";
        long temp = 0;
        long l = i;
        while (Math.abs(l) > 8) {
            temp = l % 8;
            res = Math.abs(temp) + res;
            l /= 8;
        }
        res = l + res;
        return res;
    }
}
