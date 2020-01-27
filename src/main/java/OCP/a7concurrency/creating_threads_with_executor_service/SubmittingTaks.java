package OCP.a7concurrency.creating_threads_with_executor_service;

    /*

    O solutie de a executa taskurile in thread e metoda execute(), care este mostenita de la interfata Executor, care este extinsa de interfata ExecutorService
    execute() - primeste un parametru de tip Runnable si nu returneaza nimic, respectiv noi nu stim nimic de soarta taskurilor executate.

    Exista si metoda submit(), care este similara la execute, cu exceptia ca sumbit retuneaza un obiect Future<T>, cu care eventual se poate de verificat daca taskul e complet.


    */

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

public class SubmittingTaks {

    //  void execute(Runnable comand){} // executa Runnable task intr-un oare care moment in viitor

    //  Future<?> submit (Callable<?> task ){} // executa Runnable task la un moment dat in viitor si returneaza Future care reprezinta taskul dat

    // <T> Future <T> sumbit (Callable<T> task) {} // executa Runnable task la un moment dat in viitor si returneaza Future care reprezinta rezultatele in asteptare a taskului.

    // <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> tasks) throws InterruptedException // executa taskurile date, sincronic
    //si returneaza rezultatele  a tuturor taskurilor ca Colectie de obiecte Future, in ordinea in care au fost in Colectia originala date ca parametru in metoda.

    //<T> T invokeAny(Collection<? extends Callable<T>> tasks) throws InterruptedException, ExecutionException  // executa taskurile date, sincronic
    //si returneaza rezultatul unui task finisat si intrerupe orice task nefinisat.

    //Executarea sincronica  - metodele cu astfel de executare vo astepta toate rezultatele sa fie disponibile pina a returna controlul programului de finisare.
}
