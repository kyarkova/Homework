package lesson170817.homework;

public class QuickSort {

    public static void main(String[] args) {
        Integer[] arr = {2, 3, 8, 6, 1, 5, 4, 9, 0, 7};

        quickSort(arr);

        for (Integer i : arr) {
            System.out.print(i + " ");
        }

    }

    private static Comparable[] quickSort(Comparable[] arr) {
        //shuffle(arr);
        sort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void sort(Comparable[] arr, int lo, int hi) {
        if (hi <= lo) {
            return;
        }
        int j = partition(arr, lo, hi);
        sort(arr, lo, j - 1);
        sort(arr, j + 1, hi);
    }

    private static int partition(Comparable[] arr, int lo, int hi) {
        int i = lo;
        int j = hi + 1;
        Comparable v = arr[lo];
        while (true) {
            while (less(arr[++i], v)) {
                if (i == hi) {
                    break;
                }
            }
            while (less(v, arr[--j])) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            exch(arr, i, j);
        }
        exch(arr, lo, j);
        return j;
    }

    private static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) < 0;
    }

    private static void exch(Comparable[] arr, int i, int j) {
        Comparable tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
