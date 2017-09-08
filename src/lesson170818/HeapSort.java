package lesson170818;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class HeapSort {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("two");
        list.add("three");
        list.add("one");
        List<String> sorted = heapSort(list);
        System.out.println(sorted);
    }

    private static List<String> heapSort(List<String> list) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        for (String string : list) {
            pq.add(string);
        }

        List<String> result = new ArrayList<>();
        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }
        return result;
    }
}
