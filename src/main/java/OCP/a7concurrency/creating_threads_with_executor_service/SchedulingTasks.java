package OCP.a7concurrency.creating_threads_with_executor_service;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/*
ScheduledExecutorService -  creaza un thread in care se poate de programat executarea taskurilor la un anumit timp in viitor,
sau intr-o perioada anumita.

Metode -

        schedule(Callable<V> callable, long delay, TimeUnit unit) - creaza si executa un task Callable dupa o intirziere(delay) setata.

        schedule(Runnable command, long delay, TimeUnit unit) - creaza si executa un task Runnable dupa o intirziere(delay) setata.

        scheduleAtFixedRate()Runnable command, long initialDelay, long period, TimeUnit unit) - creaza si executa un task Runnable dupa setarea unui delay
        initial, creind un nou task la o anumita perioada de timp care a fost data ca parametru

        scheduleAtFixedRate()Runnable command, long initialDelay, long delay, TimeUnit unit) -  creaza si executa un task Runnable dupa setarea unui delay
        initial si ulterior cu un delay setat intre terminarea a unei executari si inceperea executarii urmatorului

    Primele doua metode returneaza ScheduledFuture<V> si este identic cu Future, cu exceptia la metoda getDelay() care returneaza delayu setat.

 */
public class SchedulingTasks {

        public static void main(String[] args) {

            ScheduledExecutorService serivce = Executors.newSingleThreadScheduledExecutor();

            Runnable task = () -> System.out.println("Hello zoo");

            Callable<String> task2 = () -> "Monkey";

            Future<?> result = serivce.schedule(task, 10, TimeUnit.SECONDS); //executarea taskuilui este programat sa se execute in 10 sec in viitor
            Future<?> result2 = serivce.schedule(task2, 8, TimeUnit.MINUTES);// aici in 8 minute.

            Future<?> result3 =  serivce.scheduleWithFixedDelay(task, 5, 1, TimeUnit.MINUTES);//tasku asta se va executa dupa un delay de o minuta,
            // dupa care se va executa dupa fiecare minuta.


        // In timp ce aceste taskuri sunt programate, actuala executie poate sa intirzie. De exemplu, pot sa nu fie nici un thread disponibil pentru a executa
        //  taskul, astfel ei vor astepta in rind. Deasemenea, daca ScheduledEecutorService va fi terminat inainte ca sa expire timpul de execute setat ca delay ptr task,
        //  executarea lor va fi anulata.

        }
}
