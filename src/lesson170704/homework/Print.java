package lesson170704.homework;

/**
 * Created by kseni on 05.07.2017.
 */

/*
* Написать метод, печатающий элементы массива в одну строку, как в Arrays.toString, но без использования StringBuilder/StringBuffer.
* просто циклы (while или for) и System.out.print/println
*/
public class Print {

    public static void arrayToString(int[] arr) {

        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.print(arr[arr.length - 1]);
        System.out.println("]");

    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        arrayToString(arr);
    }


}
