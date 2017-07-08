package lesson170704.homework;

/**
 * Created by kseni on 05.07.2017.
 */

/*
* Написать метод, печатающий элементы массива в одну строку, как в Arrays.toString, но без использования StringBuilder/StringBuffer.
* просто циклы (while или for) и System.out.print/println
*/
public class Print {

    public static String arrayToString(int[] arr) {
        String res = "[";
        if (arr.length > 0) {
            for (int i = 0; i < arr.length - 1; i++) {
                res += arr[i] + ", ";
            }
            res += arr[arr.length - 1];
        }
        res += "]";
        return res;
    }

    public static void main(String[] args) {
        System.out.println(arrayToString(new int[]{}));
        System.out.println(arrayToString(new int[]{1}));
        System.out.println(arrayToString(new int[]{1, 2, 3, 4, 5}));
    }


}
