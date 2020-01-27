package OCP.a7concurrency.syncronizing_data_access;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SyncronizedSheepManager {

    private int sheepCount = 0;
    private void incrementAndReport(){
        System.out.println(++sheepCount + " ");
    }

    public static void main(String[] args) {

        ExecutorService service = null;

        try{
        SyncronizedSheepManager manager = new SyncronizedSheepManager();
            service = Executors.newFixedThreadPool(20);
            for (int i = 0; i < 10; i++) {
                Future<?> result = service.submit(manager::incrementAndReport);
            }



        }finally {
            if(service != null) service.shutdown();
        }

    }
}
