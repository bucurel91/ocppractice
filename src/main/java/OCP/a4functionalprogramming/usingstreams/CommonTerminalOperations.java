package OCP.a4functionalprogramming.usingstreams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonTerminalOperations {

    /*

    Putem efectua in streamuri operatii terminale fara careva operatii intermediare, dar nu si invers.

    Reductions - sunt tipuri speciale de operatii terminale unde tot continutul streamului se combina intr-un singur obiect primitiv.

            Operatii terminale petru Streamuri

                                Ce se intimpla pu Streamuri infinite            Returneaza valoare              Reducere
            allMatch()
            anyMatch()          Uneori se termina                               boolean                         Nu
            noneMatch()

            collect()           Nu se termina                                   variaza                         Da

            count()             Nu se termina                                   long                            Da

            findAny()
            findFirst()         Se termina                                      Optional<T>                     Nu

            forEach()           Nu se termina                                   void                            Nu

            min()
            max()               Nu se termina                                   Optional<T>                     Da

            reduce()            Nu se termina                                   variaza                         Da
     */


    public static void main(String[] args) {

        // count() - determina elementele intr-un stream finit, este o metoda de reducere, deoarece ea se uita la fiecare element si returneaza o singura valoare.
        //signatura long count()

        Stream<String> s =  Stream.of("dsa", "fds", "fdsgf");
        System.out.println(s.count());

        System.out.println(" count --------------------------------------");

        // min() si max() - metoda ne permite sa-i transmitem un comparator customizat si sa gasim cea mai mic sau mai mare valoare intr-un stream finit, in corespundere cu ordinea de sortare
        //ambele metode sunt de reducere, doarece ele verifica toate valorile si returneaza doar una
        //signatura - Optional<T> min(<? super T> comparator)     Optional<T> max(<? super T> comparator)

        Stream<String> s1 =  Stream.of("dsa", "fds", "fdsgf");
        Optional<String> min = s1.min((s2, s3) -> s2.length() - s3.length());// folosim optional ptr a stabili in caz ca nu este nici minim nici maxim, astfel aici se printeaza minim doar in cazul ca el
         min.ifPresent(System.out:: println);                                 // exista

        Optional<?> minEpmty = Stream.empty().min((x,z) -> 0);
        System.out.println(minEpmty.isPresent());// deoarece streamul este gol, comparatoru nu va fi apelat niciodata si nici o valuare nu va fi prezenta in Optional.

        System.out.println("min/max --------------------------------");

        //findAny() and findFirst() - este folositor pentru a lucrea cu streamurile in paralel
        // findFrist() - metodele date returneaza un element chiar daca streamul este gol. Ambele metode lucreaza cu streamuri infinite.
        // aceste metode sunt terminale dar nu de reducere, cauza este ca ele retunreaza fara a procesa toate elementele. Aceasta inseamna ca ele retuneaza valoare bazata pe stream dar nu reduce streamul
        // la o valoare.
        //signatura - Optional<T> findAny()
        //            Optional<T> findFirst()

        Stream<String> stream = Stream.of("monitz", " ciine", "iepuroi");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        stream.findAny().ifPresent(System.out:: println);
        infinite.findAny().ifPresent(System.out::println);

        System.out.println("findAny/ findFirst -------------------------------");

        //anyMatch(), allMatch() and noneMatch() - metodele cauta un stream si returneaza informatia desbre cum streamul apartine unui Predicate.
        //acestea pot sau nu sa se termine intr-un stream infinit, depinde de date. Ca si metodele find , ele nu reduc, deoarece nu este necesar ca sa verifice toate elementele
        //signatura - boolean anyMatch(Predicate<? super T> predicate)
        //            boolean allMatch(Predicate<? super T> predicate)
        //            boolean noneMatch(Predicate<? super T> predicate)

        List<String> list = Arrays.asList("monkey", "2", "chimp");
        Stream<String> infinite1 = Stream.generate(() -> "chimp");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));// verifica daca primu caracter e litera
        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().noneMatch(pred));

        System.out.println(infinite1.anyMatch(pred));

        System.out.println("anyMatch(), allMatch() and noneMatch() -----------------------------------");

        //forEach() - constructie de ciclu este disponibila. Dupa cum era de asteptat, apelind metoda forEach intr-un stream infinit, nu-l va termina.
        // prin urmare daca nu este valoare de returnat, nu este o metoda de reducere
        //signatura - void forEach(Consumer<? super T> action)
        // Nota  - este unica operatie terminala cu tipul de returnare void

        Stream<String> stringStream = Stream.of("Monkey", "Gorilla", "Bonobo");
        stringStream.forEach(System.out:: println);

        System.out.println("forEach() -----------------------------------");

        //reduce() - metoda combina un stream intr-un singur obiect, este o metoda de reducere.
        //signaturi  - T reduce(T identity, BinaryOperator<T> accumulator)
        //             Optional<T> reduce(BinaryOperator<T> accumulator)
        //             <U> U reduce(U identity, BiFunction<U, ? super T,U> accumulator, BinaryOperator<U> combiner) - se foloseste deobicei la procesarea a streamurilor paralele

        //Sa le luam pe rind. Cel mai comun mod de a efectua o reducere este de a incepe cu o valoare initiala si de a continua de a o uni cu urmatoarea valoare
        // spre exemplu adaugarea a mai multor stringuri la un string unic

        String[] array = new String[] { "w", "o", "l", "f" };
        String result = "";
        for (String ss: array) result = result + ss;
        System.out.println(result);

        //Valoarea initiala a unui string gol este identity(identitatea).Accumulatoru combina rezultatu; curent cu stringul curent
        Stream<String> stringStream1 = Stream.of("w", "o", "l", "f");
        String word = stringStream1.reduce("",(c,v) -> c + v);
        //String word1 = stringStream1.reduce("", String:: concat);// aceiasi treaba ca mai sus, adauga a doua vloare la prima
        System.out.println(word + " " );

        Stream<Integer> integerStream = Stream.of(2,3,5,6);
      //  integerStream.reduce((z,v) -> z * v).ifPresent(n -> System.out.println(n));// medota reduce inmulteste cifrele din sir una cu alta, iar metoda ifPresent verifica daca rezultatul dat este prezent in stream.
        System.out.println(integerStream.reduce(1, (l,k) -> l * k, (t,y) -> t * y ));

        System.out.println("reduce() -------------------------------");

        /*

            collect() - metoda este in tip special de reducere mutabila. Este mai eficienta decit metodare reduce() obisnuita, deoarece noi folosim acelasi obiect mutabil
            in timpul acumularii. Obiectele mutabile comune sunt - StringBUilder si ArrayList. Aceasta este o metoada foarte folositoare, deoarece
            ne permite sa extragem datele din streamuri intr-o alta forma.

            signatura - <R> R collect(Supplier<R> supplier , BiConsumer<R, ? super T> accumulator, BiConsumer<R, R> combiner)
                        <R, A> collect(Collector<? super T, A, R> collector)

         */
            Stream<String> stringStream2 = Stream.of("w", "o", "l", "f");
        StringBuilder collect = stringStream2.collect(()-> new StringBuilder(), (stringBuilder, str) -> stringBuilder.append(str), ((stringBuilder2, str2) -> stringBuilder2.append(str2) ));
        System.out.println(collect);// metoda data in general este cind procesam 2 streamuri in paralel

        Stream<String> stringStream3 = Stream.of("w", "o", "l", "f");

        TreeSet<String> set = stringStream3.collect(() -> new TreeSet<>(), (tree, str4)-> tree.add(str4), (tree1, str5) -> tree1.addAll(str5));
        System.out.println(set);

        Stream<String> stringStream4 = Stream.of("w", "o", "l", "f", "set");
        TreeSet<String > set1 = stringStream4.collect(Collectors.toCollection(() -> new TreeSet<>()));
        System.out.println(set1);

        Set<String> set2 = stringStream4.collect(Collectors.toSet());
    }

}
