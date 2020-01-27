package OCP.a3genericsandcollections.listssetsmapsqueues;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Maps {


    /*

    Maps - folosim cind avem nevoie sa identificam un element dupa o cheie unica.

    HashMap - stocheaza cheile in hashTable - aceasta inseamna ca foloseste hashCode() metoda a cheilor pentru a accesa valorile sale cit mai eficient
    Beneficiul principal este ca adaugarea si accesarea elementelor se face intr-un timp constant.In schimb se pierde ordinea in care au fost adaugate elementele,
    oricum asta nu ne preocupa la folosirea unui map.

    LinkedMap - se foloseste in cazul cind avem nevoie de ordinea elementelor in map.

    TreeMap - se stocheaza cheile intr-o structura de arbore sortata.
    Beneficiul principal este ca Mapa permanet este sortata. In schimb adaugarea si verificarea daca o cheie este prezenta se face prin binarySearch. log n -log in baza 2 al nr de elemente.

    */

    public static void main(String[] args) {

        LinkedHashMap<String, Integer>  linkedHashMap = new LinkedHashMap<>();
        Map<String, Integer> map = new HashMap<>();


        //Methods

        map.clear(); // sterge toate cheile si valorile din mapa
        map.isEmpty(); // returneaza daca mapa este goala
        map.size(); // retunreaza numarul de intrari cheie/valoare ca perechi din mapa.
        map.get("primu"); //returneaza valoarea mapate e cheie sau null daca nu este mapata
        map.put("primu", 1); // adauga sau inlocuieste perechea cheie/valoare, retunreaza valoarea precedenta sau null;
        map.put("doilea", 1);
        map.remove("primu"); // sterge si returneaza  valoarea mappata la cheie si null daca nu este mapata.
        map.containsKey("primu"); // returneaza daca este asa cheie in mapa sau nu
        map.containsValue(1); //retunreaza daca este asa valoare in mapa sau nu
        map.keySet(); //returneaza un Set cu toate cheile.
        map.values(); //returneaza o colectie cu toate valorile.

        Collection<Integer> list =  map.values();
        for (Integer i: list) {
            System.out.println(i);
        }
       // map.contains("primu"); nu se compileaza, deoarece interfata Map nu contine metoda data, ci Collections. containsKey, containsValue se contin in Map
    }
}
