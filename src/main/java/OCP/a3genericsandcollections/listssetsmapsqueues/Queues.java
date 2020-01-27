package OCP.a3genericsandcollections.listssetsmapsqueues;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queues {

    /*

    Queue -  folosim in cazul cind avem nevoie sa adaugam si sa stergem elemente intr-o ordine specifica. La fel ele deobicei
    se folosesc pentru a sorta elementele prioritar decit procesarea lor.

    */
    public static void main(String[] args) {

        Queue<Integer> que = new ArrayDeque<>();

        que.add(5);
        que.add(6);
        System.out.println(que.add(10) + " ---- add() adauga un element la sfirsitul sirului si returneaza true in caz ca s-a insertat cu succes sau arunca exceptie in caz contrar;");
        System.out.println(que.element() + " ---- element() returneaza primul element din sir si arunca exceptie in caz ca sirul este goll");
        System.out.println(que.remove() + " -----remove() sterge si returneaza primul element cel sters din sir sau arunca exceptie in caz ca sirul e gol;");
    }
}
