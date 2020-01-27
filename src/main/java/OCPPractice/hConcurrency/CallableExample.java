package OCPPractice.hConcurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = null;

        try {
            service = Executors.newSingleThreadExecutor();

            Future<Integer> result = service.submit(()-> 33 + 30);
            System.out.println(result.get());
        }finally {
            if(service != null) service.shutdown();
        }
    }
}
