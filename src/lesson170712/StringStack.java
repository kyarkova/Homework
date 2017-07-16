package lesson170712;

/**
 * Created by kseni on 16.07.2017.
 */
public class StringStack {

    private static final int DEFAULT_SIZE = 3;
    private String[] values;
    private int size;


    StringStack() {
        this(DEFAULT_SIZE);
    }

    StringStack(int size) {
        values = new String[size];
    }

    boolean push(String str) {
        if (size < values.length) {
            values[size++] = str;
            return true;
        }
        return false;
    }

    String pop() {
        if (size > 0) {
            String res = values[--size];
            values[size] = null;
            return res;
        }
        return null;
    }

    String tos() {
        return size > 0 ? values[size - 1] : null;
    }

    int size() {
        return size;
    }

}
