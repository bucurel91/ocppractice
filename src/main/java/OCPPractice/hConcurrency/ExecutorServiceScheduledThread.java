package OCPPractice.hConcurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceScheduledThread {

    public static void main(String[] args) {

        Runnable task1 = ()-> System.out.println("Prima sarcina");

        Callable task2 = ()->"Sarcina 2";

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        Future<?> result1 = service.schedule(task1, 10, TimeUnit.SECONDS);
        Future<?> result2 = service.schedule(task2, 8, TimeUnit.MINUTES);

    }
}
