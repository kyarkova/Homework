package lesson170624.classwork;

/**
 * Created by kseni on 24.06.2017.
 */
public class MathUtils {

    public static int max(int i, int j) {
        return (i > j) ? i : j;
    }

    public static int min(int i, int j) {
        return i > j ? j : i;
    }

    public static int sign(int i) {
        if (i < 0) return -1;
        else if (i > 0) return 1;
        else return 0;
    }
}
