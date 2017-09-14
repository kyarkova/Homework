package lesson170830;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BlockingQueue<T> {

    private Queue<T> items = new LinkedList<>();

    public void put(T item) {
        synchronized (items) {
            items.offer(item);
            items.notify();
        }
    }

    public T take() {
        synchronized (items) {
            while (items.isEmpty()) { // to prevent spurious wake-up
                try {
                    items.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return items.poll();
        }
    }

    public boolean contains(T item) {
        return items.contains(item);
    }


    public List<T> getItemsList() {
        return new LinkedList<T>(items);
    }
}
