package OCP.a3genericsandcollections.listssetsmapsqueues;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Listele {

    //Listele se folosesc atunci cind avem nevoie de o colectie de obiecte ordonate care poate contine obiecte dublicate.
    //Listele deobicei se folosesc in multe situatie cind avem nevoie sa tinem evidenta undei liste de obiecte.

    //UN ArrayList este similar cu un array redimensionabil.Cind se adauga elemente, ArrayLista automat creste.

    /*

     - Principalul beneficiu a ArrayListei este ca noi instantaneu putem sa extragem un element, dar adaugarea si stergerea din ArrayList este mai de lunga durata,
    decit sa accesam elementul.

    */

    /*

     - LinkedList - este speciala deoarece implimenteaza ambele interfete Lista si Queue, are toate metodele unei liste si unele metode adaugatoare
     care faciliteaza stergerea si adaugarea elementelor la inceput si/sau de la sfrisi.
        Beneficiul LinkedListei este ca putem sa adaugam sau sa stergem de la inceputul sau sfirsitul listei intr-un timp constant.

    */


    public static void main(String[] args) {

        Queue<Integer> deq = new LinkedList<>();// LinkedList este un sir cu 2 capete, diferenta este insa ca nu este un Queue pur, comparativ cu ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>(); // ArrayDeque este un sir cu doua capete pur (double queue), el stocheaza elementele intrun array redimensionabil.
        // ArrayDeque este mai eficient ca LinkedLista

        List<Integer> list = new ArrayList<>();
        list.add(1); /// in ArrayList nu sunt metode de gen peek, poll push, care adauga sterge la inceput/sfirsit de sir.

        List<Integer> linkedList = new LinkedList<>();
        ((LinkedList<Integer>) linkedList).poll(); // metoda asta si inca altele sunt care nu sunt in ArrayList
    }
}
