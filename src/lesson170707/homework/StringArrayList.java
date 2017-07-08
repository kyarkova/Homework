package lesson170707.homework;

import java.util.Arrays;

/**
 * Created by admin4 on 08.07.2017.
 */


public class StringArrayList {
    static final int DEFAULT_SIZE = 2;

    String[] elements = new String[DEFAULT_SIZE];

    //  [a,b,c,d,e,f]
    //   0 1 2 3 4 5

    int size = 0;

    public void add(String string) {

        if (size == elements.length) {
            elements = Arrays.copyOf(elements, elements.length * 2);
        }

        elements[size++] = string;
//		size = size + 1;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";
        StringBuilder res = new StringBuilder("[" + elements[0]);

        for (int i = 1; i < elements.length; i++) {
            String s = elements[i];
            if (s != null) res.append(", ").append(s);
        }
        return res.append("]").toString();
    }

    //  [a,b,c,d,e,_]
    //   0 1 2 3 4 5
    //  [a,b,d,e,_,_]
    //   0 1 2 3 4

    public void remove(int i) {
        if (i >= size || i < 0) {
            return;
        }
        System.arraycopy(elements, i + 1, elements, i, --size - i);
        elements[size] = null;
    }


    public void remove(String elem) {
        if (elem == null) {
            for (int index = 0; index < elements.length; index++) {
                if (elements[index] == null) {
                    System.arraycopy(elements, index + 1, elements, index, --size - index);
                    elements[size] = null;
                }
            }
        } else {
            for (int i = 0; i < elements.length; i++) {
                if (elem.equals(elements[i])) {
                    System.arraycopy(elements, i + 1, elements, i, --size - i);
                    elements[size] = null;
                }
            }
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public String get(int index) {
        if (index >= size)
            return "Слишком большой индекс: " + index;//throw new IndexOutOfBoundsException("Слишком большой индекс: " +  index);
        return elements[index];
    }

    public boolean set(int index, String newEl) {
        if (index >= size) return false;//throw new IndexOutOfBoundsException("Слишком большой индекс: " +  index);
        elements[index] = newEl;
        return true;
    }
}
