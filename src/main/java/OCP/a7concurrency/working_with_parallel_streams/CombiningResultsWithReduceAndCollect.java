package OCP.a7concurrency.working_with_parallel_streams;


import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*

Dupa cum stim din Cap 4  metoda rduce combina un stream intr-un obiect.
Astfel primul parametru se umeste identitate, al doilea acumulator si al treilea combinator.

In streamuri paralele, reduce() aplica reducerea la perechi de elemente in stream pentru a crea valori intermediare si apoi
combinind aceste valori intermediare pentru a produce un rezultat final.

Streams API previne problema de executare in streamuri paralele in ordine aleatoria elementelor

________________________________________________________________________________________________________________________

Ca si reduce, Stream API instroduce versiunea cu trei argumente ptr collect() care primeste acumulator si combiner operatori,
cu un operator supplier inloc de identity.


*/
public class CombiningResultsWithReduceAndCollect {

            public static void main(String[] args) {

                System.out.println(Arrays.asList('w', 'o', 'l', 'f').stream().reduce("", (c, s1) -> c + s1, (s2, s3) -> s2 + s3));

                System.out.println(Arrays.asList("w","o","l","f")
                    .parallelStream()
                    .reduce("X",String::concat)); // asta va aduce la rezultat neclar, deoarece identity este x

                System.out.println("------------------------------------------------------------------------");

                Stream<String> stream = Stream.of("w", "o", "l", "f").parallel();

                SortedSet<String> set = stream.collect(() -> new ConcurrentSkipListSet(), (x, s2) -> x.add(s2), (set1, str) -> set1.addAll(str));
                System.out.println(set);
            }
}
