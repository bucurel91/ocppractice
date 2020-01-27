package OCP.a4functionalprogramming.usingstreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamSources {

    public static void main(String[] args) {

        Stream<String> empty = Stream.empty(); //Crearea unui stream gol
        Stream<Integer> singleElement = Stream.of(1); //crearea unui stream cu un element;
        Stream<Integer> fromArray = Stream.of(1,2,3); //crearea unui stream dintr-un array

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> streamFromList = list.stream();
        Stream<String > streamFromParallel = list.parallelStream(); //crearea unui stream dintr-o lista care permite ca elementele sa fie procesate paralel.

        Stream<Double> randoms = Stream.generate(Math::random); // genereaza numere aletorii la infinit, pina nu-i spunem noi sa se opreasca
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2); // aici avem mai mult control asupra streamului, iterate primeste un parametru seed,
        // ca valoare de start, astfel stremu ne va genera numere impare atitea de cite avem nevoie
    }
}
