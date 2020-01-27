package OCP.a7concurrency.creating_threads_with_executor_service;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



    /*
        Interfata Callable este similara cu Runnable, cu exceptia sginaturei metodei call(), ea retunreaza tipul de date care este indicat tipul de valoare
        si poate arunca o exceptie verificate(checked).
        Ea se appeleaza prin metoda submit() overloaded doar ca primeste ca parametru interfata Callable

     */
public class IntroducingCallable {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = null;

        try{
            service = Executors.newSingleThreadExecutor();
            Future<Integer> result = service.submit(() -> 30 + 11);
            System.out.println(result.get());
        }finally {
            if(service != null) service.shutdown();
        }
    }
}
