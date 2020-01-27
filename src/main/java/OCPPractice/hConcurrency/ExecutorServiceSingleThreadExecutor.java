package OCPPractice.hConcurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceSingleThreadExecutor {

    public static void main(String[] args) {

        ExecutorService service = null;

        try{
            service = Executors.newSingleThreadExecutor();

            System.out.println("begin");

            service.execute(() -> System.out.println("First printing"));
            service.execute(() -> {for (int i = 0; i < 3; i++)
                System.out.println("Printing record: " + i);
            });

            service.execute(() -> System.out.println("Second printing"));
            System.out.println("end");
        }finally{
            if(service != null) service.shutdown();
        }
    }
}
