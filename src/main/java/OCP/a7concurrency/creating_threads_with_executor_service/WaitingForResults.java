package OCP.a7concurrency.creating_threads_with_executor_service;

/*

    Future<?> future = service.submit(() -> System.out.println("Hello Zoo"));

    Asa asignam la future rezultatul executarii tascului.

    boolena isDone() - Returneaza true daca taskul a fost completat, a aruncat o exceptie ori a fost intrerupt.

    boolean isCancelled() - returneaza true daca taskul a fost intrerupt inainte ca sa fie completat normal.

    boolean cancel() - incercare de a intrerupe executia unui task.

    V get() - returneaza rezultatul unui task, il asteapta pina cind nu este disponibil (rezultatul).

    V get(long timeout, TimeUnit unit) - returneaza rezultatul unui task, asteapta odurata timp specificata.
    Daca rezultatul nu este completat pina la expirarea timpului va fi aruncata o exceptie verificata (checked) TimeoutException.
     */

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class WaitingForResults {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService service = null;

        try{
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(() -> {
                for (int i = 0; i < 500; i++) {
                    WaitingForResults.counter++;
                }
            });
            result.get(10, TimeUnit.SECONDS);
            System.out.println("Reached!");
        } catch (TimeoutException e){
            System.out.println("Not reached in time");
        }finally {
            if(service != null){
                service.shutdown();
            }
        }

        service.awaitTermination(1, TimeUnit.MINUTES);
        // verifica daca toate taskurile au fost executate
        if (service.isTerminated()) {
            System.out.println("All tasks finished.");
        }else {
            System.out.println("At least one task is still running");
        }
    }

}
