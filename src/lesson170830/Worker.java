package lesson170830;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.Executor;

public class Worker implements Executor {

    static final Runnable POISON_PILL = () -> {
    };

    BlockingQueue<Runnable> tasks = new BlockingQueue<>();
    Thread worker;

    public Worker() {
        worker = new Thread(this::processTasks);
        worker.start();
    }

    @Override
    public void execute(Runnable command) throws IllegalThreadStateException {
        if (worker.isAlive()&& !tasks.contains(POISON_PILL)) {
            tasks.put(command);
        } else {
            throw new IllegalThreadStateException();
        }
    }

    private void processTasks() {
        while (worker.isAlive()) {
            Runnable task = tasks.take();
            if (task == POISON_PILL)
                return;
            Optional.ofNullable(task).ifPresent(r -> r.run());
        }
    }

    public void shutdown() {
        if (worker.isAlive()) {
            tasks.put(POISON_PILL);
        }
    }

    public List<Runnable> shutdownNow() {
        if (worker.isAlive()) {
            worker.stop();
        }
        return tasks.getItemsList();
    }


}
