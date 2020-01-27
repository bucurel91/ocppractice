package OCPPractice.hConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IncrementMethodSyncronized {

    private int counter = 0;


    public void incrementAndReport(){

        synchronized (this) {
            System.out.print(++counter + " ");
        }
    }

    public static void main(String[] args) {

        ExecutorService service = null;

        try{
            service = Executors.newFixedThreadPool(20);
            IncrementMethodSyncronized increment = new IncrementMethodSyncronized();

            IncrementMethodSyncronized crement2 = new IncrementMethodSyncronized();

            for (int i = 0; i < 10; i++) {
                service.submit(()-> crement2.incrementAndReport());
            }

            for (int i = 0; i < 10; i++) {
                service.submit(()-> increment.incrementAndReport());
            }

        }finally {
            if(service != null)
            service.shutdown();
        }

    }
}
