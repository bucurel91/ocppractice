package OCP.a4functionalprogramming.usingstreams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Stream;

public class CommonIntermediatOperations {

    /*

    Spre deosebire de operatiile terminale, operatiile intermediare se ocupa de streamurile infinite, simplu returnind  un stream infinit.
    */

    public static void main(String[] args) {

        // filter() - returneaza un stream cu elementele care conincid cu expresia data.
        //singnatura - Stream<T> filter(Preducate<? super T> predicate)

        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("go")).forEach(str -> System.out.println(str));

        System.out.println("filter() ---------------------------");

        //distinct() - returneaza un stream cu valorile duble sterse.
        //signatura - Stream<T> distinct()
        Stream<String> s1 = Stream.of("duck", "duck", "duck", "goose");
        s1.distinct().forEach(System.out:: println);

        System.out.println("distinct() --------------------------");

        //limit() and skip() - metodele fac Streamul mai mic. Ele pot  face un stream finit mai mic, sau pot face un stream finit dintr-un stream infinit.
        //signatura - Stream<T> limit(int maxSize)
        //            Stream<T> skip(int n)

        Stream<Integer> s2 = Stream.iterate(1, n -> n + 1);// creeaza un stream infinit care incepe de la 1.
        s2.skip(5).limit(2).forEach(System.out:: print); // metoda skip - returneaza un stream infinit care incepe de la 6, deoarece el trece peste primele 5 elemente
                                                           // metoda limit - ia primele 2, si acum avem un stream finit din 2 elemente.
        System.out.println("");
        System.out.println("skip() and limit() -----------------------------");

        //map() - metoda creeaza o mapare de unu la unu din elementele streamului cu elementele din urmatoarea treapta din stream.
        //signatura - <R> Stream<R> map(Function<? super T, ? extends R> mapper )
        // metoda map() din streamrui este pentru transformarea datelor, nu trebuie confundat cu interfata Map, care mapapeaza cheile cu valorile.

        Stream<String> s3 = Stream.of("monkey", "gorilla", "bonobo");
        s3.map(str1 -> str1.length()).forEach(System.out:: print);// metoda map transorma streamul de String intr-un stream de cifre.

        System.out.println("");
        System.out.println("map() -------------------------------------------");

        //flatMap() - primeste fiecare element din stream si face ca orce element sa contina elementele de top intr-un singur stream
        // Asta este folositor atunci cind avem nevoie sa stergem elemente dintr-un stream sau vrem sa combinam un stream de liste.
        //signatura <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)

        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);

        animals.flatMap(l -> l.stream()).forEach(System.out:: println); // in cazula asta uneste toate elementele din mai multe liste intr-un stream.

        System.out.println("flatMap() ----------------------------------");

        //sorted() - returneaza un stream cu elementele sortate
        //signatura - Stream<T> sorted()
        //            Stream<T> sorted(Comparator<? super T> comparator)

        Stream<String> s4 = Stream.of("brown-", "bear-");
        //s4.sorted().forEach(System.out:: print);
        System.out.println("");
        s4.sorted(Comparator.reverseOrder()).forEach(System.out:: print);

        System.out.println("sorted() --------------------------------------");

        //peek() - este ultima metoda intermediara. Este folositoare pentru debugg deoarece ne perimte sa efectuam o operatie stream fara a modifica defapt streamul.
        //signatura - Stream<T> peek(Consumer<? super T> action)
        // Cea mai obisnuita utilizare a metodei peek() este de a scoate continutul din stream asa cum trece.
        //Sa presupunem ca facem o greseala si ursii enumerati se incep cu litera g inloc de b
        //suntem nedumeriti de ce numarul de ursi este 1 si nu 2, putem adauga peek() pentru a vedea motivul

        Stream<String> s5 = Stream.of("black bear", "brown bear", "grizzly");
        long count = s5.filter(st -> st.startsWith("b")).peek( st1 -> System.out.println(st1)).count();
        System.out.println(count);

    }
}
