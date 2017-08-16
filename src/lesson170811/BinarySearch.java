package lesson170811;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {0,  2, 3, 5, 6, 7, 8};

        System.out.println(binarySearch(arr, 1));
    }


    public static int binarySearch(int[] a, int key) {
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -(lo+1);
    }

}
