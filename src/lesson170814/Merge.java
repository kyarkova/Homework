package lesson170814;

import java.util.Arrays;

/**
 * Created by kseni on 14.08.2017.
 */
public class Merge {
    public static void main(String[] args) {
        Integer[] a= {10,20,30,40,15,25,30,35,45};
        Integer[] a2= {10,10,10,10,10,10,10,10,10};

        Integer[] aux = new Integer[a.length];
        merge(a,aux,0,a.length-1,3);
        System.out.println(Arrays.toString(a));

        Integer[] aux2 = new Integer[a.length];
        merge(a2,aux2,0,a2.length-1,3);
        System.out.println(Arrays.toString(a2));
    }

    static public void merge(Comparable[] a, Comparable[] aux, int lo, int hi, int mid) {
        for (int i = 0; i <= hi; i++) {
            aux[i] = a[i];
        }
        int i = lo;
        int j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = aux[j++];
            } else if (j > hi) {
                a[k] = aux[i++];
            } else if (aux[j].compareTo(aux[i]) < 0) {
                a[k] = aux[j++];
            } else {
                a[k] = aux[i++];
            }
        }
    }
}
