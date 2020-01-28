package OCP.a7concurrency.syncronizing_data_access;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*


    Clasa data este exemplu ptr a arata ca mai multe threaduri pot sa execute un task, respecit aici rezultatul ar putea fi nu numaratoarea de la 1 la 10,
    dar poate sa se repete unele cifre, astfel se creeaza un rezultat necorepsunzator cu ce avem noi nevoie.
 */

public class SheepManager {

    private int sheepCount = 0;

    private void incrementAndReport() {
        synchronized (this) {
            System.out.println(++sheepCount + " ");
        }
    }

    private synchronized void increment(){ // este similar ca mai sus, doar ca se sinvronizeaza toata metoda, nu se syncronizeaza doar un block de cod.
        System.out.println(sheepCount++ + " ");
    }

    //putem sa sincronizam si metode statice

    private static void printDayWork(){
        synchronized (SheepManager.class){
            System.out.println("Finishing work");
        }
    }

    private synchronized static void printDaysOfWork(){ // e similar ce ce e mai sus
        System.out.println("Finished work");
    }

    public static void main(String[] args) {

        ExecutorService service = null;

        try {

            service = Executors.newFixedThreadPool(20);
            SheepManager manager = new SheepManager();
            for (int i = 0; i < 10; i++) {
                service.submit(manager::incrementAndReport);
            }


        } finally {
            if (service != null) {
                service.shutdown();
            }
        }

    }
}
