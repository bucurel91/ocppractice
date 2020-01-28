package OCP.a7concurrency.using_concurrent_collections;


import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

        /*
        BlockingQueue si BlockingDeque- interfete pentru colectiile concurente.
        Sunt 2 clase care implementeaza aceasta interfata LinkedBlockingQueue si LinkedBlockingDeque
        Aceastea sunt similare cu Queue cu exceptia la metoda, care primeste si un parametru in care se specifica un timp anumit pentru a executa o operatie.

        offer(E e, long timeout, TimeUnit unit)  - adauga un element in queue asteptind o perioada de timp specificata,
                                                   returneaza false in caz ca nu s-a reusit sa se adauge elementul in timpul specificat.

        poll(long timeout, TimeUnit unit)        - scoate un element si il sterge din queue, asteptind o perioada specificata de timp,
                                                   returneaza null daca timpul expira inainte ca elementul sa fie disponibil ptr stergere.



        LinkedBlockingDeque -

        offerFirst(E e, long timeout, TimeUnit unit)  - adauga un item la inceputul colectiei (queue), asteapta un timp specificat,
                                                        returneaza false daca timpul se termina inainte ca spatiul de adaugare in colectie sa fie disponibil

        offerLast(E e, long timeout, TimeUnit unit)   - adauga un item la sfirsitul colectiei (queue), asteapta un timp specificat,
                                                        returneaza false daca timpul se termina inainte ca spatiul de adaugare in colectie sa fie disponibil

        pollFirst(long timeout, TimeUnit unit)        -  scoate un element si il sterge de la inceputul colecitie queue, asteptind o perioada specificata de timp,
                                                         returneaza null daca timpul expira inainte ca elementul sa fie disponibil ptr stergere.

        pollLast(long timeout, TimeUnit unit)         - scoate un element si il sterge de la sfirsitul colecitie queue, asteptind o perioada specificata de timp,
                                                         returneaza null daca timpul expira inainte ca elementul sa fie disponibil ptr stergere.

         */

public class BlockingQueues {

    public static void main(String[] args) {

        try {
            BlockingQueue<Integer> blockingQueue = new LinkedBlockingQueue<>();

            blockingQueue.offer(39);
            blockingQueue.offer(4, 3, TimeUnit.MILLISECONDS);

            System.out.println(blockingQueue.poll());
            System.out.println(blockingQueue.poll(10, TimeUnit.MILLISECONDS));
        } catch (InterruptedException e) {
            Logger.getLogger("torba");
        }

        try{
            BlockingDeque<Integer> blockingDeque = new LinkedBlockingDeque<>();

            blockingDeque.offer(91);
            blockingDeque.offerFirst(5, 2, TimeUnit.SECONDS);
            blockingDeque.offerLast(47, 100, TimeUnit.MICROSECONDS);
            blockingDeque.offer(3, 4, TimeUnit.SECONDS);

            System.out.println(blockingDeque.poll());
            System.out.println(blockingDeque.poll(950, TimeUnit.MILLISECONDS));
            System.out.println(blockingDeque.pollFirst(200, TimeUnit.NANOSECONDS));
            System.out.println(blockingDeque.pollLast(1, TimeUnit.SECONDS));
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }


}
