package lesson170627;

/**
 * Created by kseni on 27.06.2017.
 */
public class HomeWork {
    public static String toBinaryString(int i) {
        if (i == 0) return "0";
        String s = Integer.toString(i);
        String res = "";
        int temp = 0;
         while (i != 0) {
             temp = i%2;
             res =  temp + res;
             i/=2;
         }
        return res;
    }

    public static String toHexString(int i) {
        return Integer.toHexString(i);
    }

    public static String toOctalString(int i) {
        return Integer.toOctalString(i);
    }

    public static String toStringUnivers(int i, int system) {
        return Integer.toString(i, system);
    }
}
