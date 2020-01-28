package OCP.a7concurrency.using_concurrent_collections;


        /*

        CopyOnWriteArrayList si CopyOnWriteArraySet clase, care se comporta putin diferit decit celelalte colectii concurente de pina acum.
        Aceste clase copie toate elementele sale intr-o nou structura de baza in orcind un element a fost adaugat, modificat sau sters din colectie.
        Modificarea elementului se are in vedere cind referinta colectiei este schimbata. Modificind continutul actual al colectiei nu va cauza
        alocarea unei noi structuri.

        Desi datele sunt copiate intr-o noua structura de baza, referinta noastra la obiect nu se schimba. Aceasta in particular este folositor
        in multi-threading environmente care necesita sa itereze o colectie.
        Orice iterator stabilit cu prioritate unei modificari nu va vedea modificarile, in schimb va itera elementele originale prioritar modificarii.

         */

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteCollections {

    public static void main(String[] args) {

        List<Integer> list =  new CopyOnWriteArrayList<>(Arrays.asList(3, 4, 42));

        for (Integer nr: list) {
            System.out.println(nr + " ");
            list.add(9);
        }
                        // in iteratia data noi adaugam elemente, cu un ArrayList simplu ar arunca exceptie(ConcurrentModificationException), insa cu CopyOnWriteArrayList colectia se itereaza
                            //doar ca nu se modifica elementele, doar marimea arrayului creste.
        System.out.println();
        System.out.println(list.size());
    }
}
