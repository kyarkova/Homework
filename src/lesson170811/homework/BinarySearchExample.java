package lesson170811.homework;

import java.util.*;

public class BinarySearchExample {
    final static int MAX = 1_000_000;
    static Random rand;

    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> treeSet = new TreeSet<>();
        rand = new Random(1);
        Integer key = rand.nextInt(MAX);
        System.out.println("Search for : " + key);

        testLinkedList(linkedList, key);
        testLinkedList(arrayList, key);
        testSet(treeSet, key);
    }

    private static void testLinkedList(List<Integer> list, Integer key) {
        String clazz = list.getClass().getSimpleName();
        rand = new Random(1);
        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX; i++) {
            list.add(rand.nextInt(MAX));
        }
//        System.out.println(list);
        long addTime = System.currentTimeMillis();
        System.out.println(clazz + " add : " + (addTime - start));
        Collections.sort(list);
        long sortTime = System.currentTimeMillis();
        System.out.println(clazz + " sortCountingByte : " + (sortTime - addTime));
//        System.out.println(list);
        int index = Collections.binarySearch(list, key);
        System.out.println(clazz + " result : " + index);
        long searchTime = System.currentTimeMillis();
        System.out.println(clazz + " search : " + (searchTime - sortTime));
        System.out.println();
    }

    private static void testSet(Set<Integer> set, Integer key) {
        String clazz = set.getClass().getSimpleName();
        rand = new Random(1);
        long start = System.currentTimeMillis();
        for (int i = 0; i < MAX; i++) {
            set.add(rand.nextInt(MAX));
        }
//        System.out.println(set);
        long addSortTime = System.currentTimeMillis();
        System.out.println(clazz + " add & sortCountingByte: " + (addSortTime - start));

//        System.out.println(set);

        boolean b = set.contains(key);
        System.out.println("Result : " + b);
        long searchTime = System.currentTimeMillis();
        System.out.println(clazz + " search : " + (searchTime - addSortTime));
        System.out.println();
    }


}