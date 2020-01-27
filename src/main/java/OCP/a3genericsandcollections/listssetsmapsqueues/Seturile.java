package OCP.a3genericsandcollections.listssetsmapsqueues;

import java.util.HashSet;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class Seturile {

    /*
        Folosim Set cind dorim sa nu avem elemente dublicate in colectie.

        HashSet - stocheaza elementele intr-un hashtable, aceasta inseamna ca foloseste metoda hashCode() pentru a accesa elementele mai eficient.
        Beneficiul principal este ca adaugarea si verificarea daca un element se afla in Set au un timp constant de executie. In schimb se pierde
        ordinea de in care au fost insertate elementele. In mare parte aceasta nu ne ingrijoreaza folosind HashSetu ce ce il face cel mai frecvent folosit.

        TreeSet - stocheaza elementele intr-o structura de arbore sortata. Principalul beneficiu este ca Setul este permanent sortat. In schimb
        atunci cind adaugam sau verificam daca un element este prezent, in ambele variante se foloseste binarySearch O(log n) - log in baza 2 a numarului total de elemente din set.

     */


    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();
         boolean b1 = set.add(66); // true
         boolean b2 = set.add(10); // true
         boolean b3 = set.add(66); // false
         boolean b4 = set.add(8); // true
         for (Integer integer: set) System.out.print(integer + ","); // 66,8,10,

        System.out.println();

        Set<Integer> treeSet = new TreeSet<>();
        boolean b11 = treeSet.add(77); // true
        boolean b12 = treeSet.add(9); // true
        boolean b13 = treeSet.add(77); // false
        boolean b14 = treeSet.add(7); // true
        for (Integer i: treeSet) System.out.print(i + ","); // 66,8,10,



        //sunt citeva metoda care sunt disponibile in caz ca instantiem TreeSetul cu interfata NavigableSet (doar TreeSetul implimenteaza aceasta interfata)
        //sunt mai jos
        NavigableSet<Integer> navSet = new TreeSet<>();

        for (int i = 0; i <= 20; i++) {
            navSet.add(i);
        }
        System.out.println("-------------------------------");
        System.out.println(navSet.lower(10)); // returneaza cel mai mare element care este mai mic ca paremetru e(10), sau null daca nu e asa element.
        System.out.println(navSet.floor(10)); //returneaza cel mai mare element care este mai mic sau egal ca parametru e(10), sau null daca nu e asa element.
        System.out.println(navSet.higher(20)); // returneaza cel mai mic element care este mai mare ca paramentru e(20), sau null daca nu e asa element.
        System.out.println(navSet.ceiling(20)); //returneaza cel mai mic element care este mai mare sau egal ca parametru e(20), sau null daca nu e asa element.

        //
    }
}
