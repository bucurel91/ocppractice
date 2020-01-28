package OCP.a7concurrency.using_concurrent_collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*

        Pe ling clasele colectii concurente, Concurrency API ne ofera si metode pentru a obtine versiunile sincronizate al obiectelor colectii ne-concurente.


            synchronizedCollection(Collection<T> c)

            synchronizedList(List<T> list)

            synchronizedMap(Map <K, V> m)

            synchronizedNavigableMap(NavigableMap<K,V> m)
K
            synchronizedNavigableSet(navigableSet<T> s)

            synchronizedSet(Set<T> s)

            synchronizedSortedMap(SortedMap<K,V> m)

            synchronizedSortedSet(SortedSet<T> s)

            Se folosesc atunci cind avem nevoie sa sincronizam o colectie.

            In timp ce metodele date sincronizeaza accesul la datele elementelor, ca metodele get() si set(), ele nu sincronizeaza oricare iterari prin elemente
            Astfel e rational de folosit block synchronize daca avem nevoie sa iteram una din colectiile returnate de metodele date (sincronizate)
         */
public class OptainingSyncronizedCollections {

            public static void main(String[] args) {

                List<Integer> list = Collections.synchronizedList(new ArrayList<>(Arrays.asList(4,3, 42)));

                synchronized (list){
                    for (int data: list) {
                        System.out.println(data + " ");
                    }
                }

                //Cu toate ca metodele date sunt sincronizate, ele oricum aruna Exceptie in cazul de exemplu stergerea elementelor in iterare, spre deosebire
                // colectiile concuremte ca ConcurrentHashMap

                Map<String, Object> foodData = new HashMap<String, Object>();
                foodData.put("penguin", 1);
                foodData.put("flamingo", 2);
                Map<String,Object> synchronizedFoodData = Collections.synchronizedMap(foodData);
                for(String key: synchronizedFoodData.keySet())
                    synchronizedFoodData.remove(key); //exceptie ConcurrentModificationException
            }
}
