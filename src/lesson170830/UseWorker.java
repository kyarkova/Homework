package lesson170830;

import java.util.List;

public class UseWorker {

    public static void main(String[] args) throws InterruptedException {

        Worker worker = new Worker();
        try {
            worker.execute(() -> {
                System.out.print("hello, ");
            });
        } catch (IllegalThreadStateException e) {
            e.printStackTrace();
        }

        try {
            worker.execute(() -> {
                System.out.println("world!");
            });
        } catch (IllegalThreadStateException e) {
            e.printStackTrace();
        }

        Thread.currentThread().sleep(15);

        List<Runnable> runnables = worker.shutdownNow();
        System.out.println(runnables);

//        worker.shutdown();

//        try {
//            worker.execute(() -> {
//                System.out.println("world!");
//            });
//        } catch (IllegalThreadStateException e) {
//            e.printStackTrace();
//        }
    }

}