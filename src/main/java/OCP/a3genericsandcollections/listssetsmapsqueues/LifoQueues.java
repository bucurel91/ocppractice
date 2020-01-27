package OCP.a3genericsandcollections.listssetsmapsqueues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class LifoQueues {


    /*

    Q
        Queue se structureaza dupa regula FIFO (firs in - first out), dar sunt unele Queue care folosesc si alt genuri de ordine.
        Folosim metoda LIFO - ultimul intrat, primul iesit;
    * */


    public static void main(String[] args) {


        Deque<Integer> arrayDeque = new ArrayDeque<>();//aceasta este FIFO metoda push/poll/peek - sir cu doua capete
        // in depindenta de ce metoda de insertare noi avem nevoie LIFO sau FIFO, instantiem cu Queue sau Deque



         arrayDeque.push(1);
         arrayDeque.push(5);
         arrayDeque.push(10);
        System.out.println( " push() -----adauga un element la inceputul sirului\n"
            + "        //Aici este necesar cast, deoarece interfata Queue nu contine metoda push, ci interfata Deque, respectiv se face down-cast catre clasa ArrayDeque"); //

        System.out.println(arrayDeque.pop() + " ---pop() sterge primul element din lista si returneaza elementul sters, sau arunca exceptie daca sirul este gol");

        for (Integer i : arrayDeque) {
            System.out.print(i + " ");
        }

        //In dependenta de ce gen de sir avem nevosie, cu dulblu capete sau doar cu unul,
        // cind avem nevoie sa insertam element la inceputul sirului folosim push(adica la inceput), principiul LIFO push/poll/peek - inserteaza primul element/sterge primul element/retuneaza primul element
        // cind avem nevoie sa insertam element la sfirsitul sirului folosim offer(adica la sfirsit), principiul FIFO offer/poll/peek - inserteaza u;ltimul element/sterge primul element/retuneaza primul element



        Deque<Integer> deque = new ArrayDeque<>(); // interfara Deque contine metode pe care interfata Queue nu le contine, de exemplu push si pop, mai sunt si altele
        deque.add(6);
        deque.add(7);
        deque.push(8);

        //LinkedList este similara cu ArrayDeque cu doua capete FIFO - push/peek/poll

    }
}
