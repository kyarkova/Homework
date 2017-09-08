package lesson170809.homework;

import lesson170809.homework.Dictionary.Pair;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Dictionary<K, V> implements Iterable<Pair> {
    private static int count = 0;
    private static final int MAX = 3;
    int curIndex;

    public static class Pair<K, V> {
        K key;
        V value;

        public Pair(K key2, V value2) {
            key = key2;
            value = value2;
        }
    }

    List<Pair>[] data = new List[MAX];

    public void put(K key, V value) {
        curIndex = hash(key);
        if (data[curIndex] == null) {
            data[curIndex] = new ArrayList<>();
        }
        Pair pair = getPair(key);

        if (pair == null) {
            data[curIndex].add(new Pair(key, value));
            count++;
            if (count >= data.length * 10) {
                rehash();
            }
            return;
        }
        pair.value = value;
    }

    private void rehash() {
        int oldCapacity = data.length;
        int newCapacity = (int) (oldCapacity * 1.75);
        List<Pair>[] newData = new List[newCapacity];

        for (int i = 0; i < data.length; i++) {
            if (data[i] != null) {
                for (Pair pair : data[i]) {
                    int index = (pair.key.hashCode() & 0x7FFFFFFF) % newData.length;
                    if (newData[index] == null) {
                        newData[index] = new ArrayList<>();
                    }
                    newData[index].add(pair);
                }
            }
        }
        data = newData;
    }

    private int hash(K key) {
        return (key.hashCode() & 0x7FFFFFFF) % data.length;
    }

    public V get(K key) {
        Pair pair = getPair(key);
        return pair == null ? null : (V) pair.value;
    }

    private Pair getPair(K key) {
        List<Pair> list = data[curIndex];
        if (list == null) { // guard condition
            return null;
        }
        for (Pair pair : list) {
            if (pair.key.equals(key)) {
                return pair;
            }
        }
        return null;
    }

    public void remove(K key) {
        int index = hash(key);
        List<Pair> list = data[index];
        if (list == null) { // guard condition
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Pair pair = list.get(i);
            if (pair.key.equals(key)) {
                count--;
                list.remove(i);
            }
        }
    }

    @Override
    public Iterator<Pair> iterator() {
        return new Iterator<Dictionary.Pair>() {
            int currentElement = -1;
            Iterator<Pair> listIterator = null;

            @Override
            public boolean hasNext() {
                if (listIterator != null && listIterator.hasNext()) {
                    return true;
                }

                listIterator = null;

                for (++currentElement; listIterator == null
                        && currentElement < data.length; currentElement++) {
                    List<Pair> list = data[currentElement];
                    if (list == null) {
                        continue;
                    }
                    listIterator = list.iterator();
                    if (!listIterator.hasNext()) {
                        continue;
                    }
                    return listIterator.hasNext();
                }
                return false;
            }

            @Override
            public Pair next() {
                if (!hasNext()) {
                    throw new IllegalArgumentException();
                }
                return listIterator.next();
            }
        };
    }

}
