package OCP.a3genericsandcollections.newinjava8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapNewMethods {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Primu", "Jora");
        map.put("A doilea", null);

        map.putIfAbsent("Primu", "Ghita");
        map.putIfAbsent("A doilea", "vera");
        map.putIfAbsent("A treilea", "Bambole");
        map.forEach((m1,m2) -> System.out.println(m2 + " - " + m1));
        System.out.println("------------------------------");

        BiFunction<String, String, String> mapper1 =(v1, v2) -> v1.contains("u") ? v1: v2;

        map.merge("Primu", "Sky", mapper1); // in caz ca keya exista in mapa, atunci valoarea se schimba, in dependenta de ce retunreaza Functia
       // map.merge("Primu", "Skye", (v1,v2) -> null);// in caz k lamda returneaza null, atunci key-a este stearsa din mapa
       // map.merge("al patrulea", "Skype", (v1,v2) -> null );//in cazul dat daca nu exosta keya in mapa, ea este adaugata cu valoarea  data ca parametru
        map.forEach((m1,m2) -> System.out.println(m2 + " - " + m1));

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Jenny", 1);

        BiFunction<String, Integer, Integer> mapper = (k,v) -> v + 3;
        Integer jeny = map1.computeIfPresent("Jeny", mapper);// in caz k exista asa key in mapa atunci metoda apeleaza BiFunction, in cazul nostru returneaza 4
                                                                    // in caz k BiFunction retuneaza null atunci key este stearsa din mapa
        System.out.println(jeny);

        Function<String, Integer> mapper2 = (k) -> 2;
        Integer jeny1 = map1.computeIfAbsent("Jenny", mapper2);// in caz k nu exista asa key in mapa atunci metoda apeleaza Function, in cazul nostru returneaza 2
                                                                    // in caz k nu este asa key se inserteaza in mapa keya si valoarea returanata de metoda jeny/2
                                                                    //in caz k cheiea exista da valoarea este, atunci se keya ramine dar se updateaza valoarea cu ceia ce returneaza metoda adica 2
                                                                    // in caz ca Function returneaza null atunci key nu se adauga in mapa
        System.out.println(jeny1);
        map1.forEach((k, m) -> System.out.println(k + " - " + m));

    }
}
