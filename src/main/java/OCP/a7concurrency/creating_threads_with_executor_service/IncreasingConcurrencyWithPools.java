package OCP.a7concurrency.creating_threads_with_executor_service;

        /*

        Pool of threads - este un grup de threaduri pre-instantiate, care sunt disbonibile pentru a executa un set de taskuri arbitrare.

        MethodName                           Return Type                       Descriere

        newSingleThreadExecutor()            ExecutorService                   creaza un singur thread de executie care foloseste un singur lucrator
                                                                               care opereaza cu un rind nelimitat. Rezultatele sunt procesate secvential
                                                                               in ordinea in care au fost adaugate.

        newSingleThreadScheduledExecutor()   ScheduledExecutorService          creaza un singur thread de executare care poate fi programat sa se execute
                                                                               setindui un anumit timp de delay sau sa execute periodic.

        newCachedThreadPool()                ExecutorService                   creaza un pool de threaduri care creeaza noi threaduri de care este nevoie,                                                                                                                                   dar care vor folosi threadurile create precedente care vor fi disponibile

        newFixedThreadPool(int nThreads)     ExecutorService                   creaza un pool de threaduri care refoloseste un numar fix de threauri
                                                                               care opereaza cu unrind transmisibil fara limite

        newScheduledThreadPool(int nThreads) ScheduledExecutorService          creaza un pool de threaduri care pot programa comenzile  pentru a rula                                                                                                                                        dupa un delay setat ori pentru a fi executat periodic.


         */

public class IncreasingConcurrencyWithPools {

    public static void main(String[] args) {

    }
}
