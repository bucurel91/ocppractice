package OCP.a3genericsandcollections.listssetsmapsqueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class FifoQueue {

    // Queue - primul intrat, primul iesit - FIFO



    public static void main(String[] args) {

        Queue<Integer> que = new ArrayDeque<>();// acesta este FIFO metoda offer/poll/peek - sir cu un capat
        // in depindenta de ce metoda de insertare noi avem nevoie LIFO sau FIFO, instantiem cu Queue sau Deque
        //asta doar se implimenteaza diferit, cu metodele specifice push/poll/peek sau offer/poll/peek

        que.offer(45);
        que.offer(5);
        System.out.println(que.offer(7) + " -----offer() adauga un element la sfirsitul sirului si returneaza true in caz ca s-a insertat cu succes;");
        System.out.println(que.poll() + " -----poll() sterge si returneaza primul element cel sters din sir sau retruneaza null daca siru este gol. //se traduce -  a taia virful.");
        System.out.println(que.peek() + " -----peek() returneaza primul element sau returneaza null in caz ca siru este gol"); //
    }
}
