package OCP.a7concurrency.creating_threads_with_executor_service;

import org.apache.catalina.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ZooInfoExecutorService {

    /*
    ExecutorService - ne creeaza si ne gestioneaza threadurile.
    Initial obtinem o instanta de interfata ExecutorService, apoi trimitem serviciu de taskuri sa fie procesate.


    Acest exemplu este similar cu cel precedent PrintData si ReadInventory, doar ca acolo a fost create 3 threaduri, aici 1,
    astfel rezultatul executarii programului va fi in ordinea in care s-au adaugat.

    La executarea mai multor taskuri de acelasi thread service, taskurile vor fi puse in rind si executate una dupa alta, in ordinea in care au fost adaugate.
    Insa daca numarul de threaduri creste, aceasta garantie dispare, in urmatoarele capitole va fi descris.
     */

    public static void main(String[] args) {

        ExecutorService service = null;

        try{
            service = Executors.newSingleThreadExecutor();

            System.out.println("begin");

            service.execute(() -> System.out.println("print zoo inventory"));
            service.execute(() -> {
                for (int i = 0; i < 3; i++) {
                    System.out.println("Printing record: " + i);
                }
            });
            service.execute(() -> System.out.println("printing zoo inventory"));
            System.out.println("end");
        }finally {
            if(service != null)service.shutdown();// atunci cind facem shutdown() la thread, el nu mai primeste taskuri noi, dar le executa care au fost
            // puse in rind la executare, astfel invocind isShutdown() returneaza true, dar daca taskurile nu au fost executate toate atunc isTerminated() returneaza false
            // si returneaza true doar atunci cind se executa ultimul task.
            //In caz ca am apelat shutdown(), iar dupa asta invocam un task nou, va fi aruncata exceptie RejectedExecutionException.

            //ExecutorService ne ofera metoda shutdownNow(), care incearca sa finiseze toate taskurile. E posibil ca va crea un nou thread care nu se va terminan niciodata,
            //astfel orcie incercare de a intrerupe vor fi ignorate.
            //metoda shutdownNow() retunreaza o Lista<Runnable> cu taskurile care au fost invocate treadului de executie, dar care nu au fost incepute.
        }

    }
}
