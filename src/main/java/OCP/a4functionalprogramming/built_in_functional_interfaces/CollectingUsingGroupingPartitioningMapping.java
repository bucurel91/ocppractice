package OCP.a4functionalprogramming.built_in_functional_interfaces;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingUsingGroupingPartitioningMapping {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("lions", "tigers", "bears");;

        Map<Integer, List<String >> map = stream.collect(Collectors.groupingBy(s -> s.length())); // collect primeste ca argument clasa Collectors cu metoda statica groupingBy si grupeaza
                                                                                                 // listele din map create dupa lungime, adic o lista cu stringuri de 5 caractere
                                                                                                 // a doua lista cu stringuri din 6 caractere, si cheia ptr liste serves lungimea la string
        System.out.println(map);


        Stream<String> stream1 = Stream.of("lions", "tigers", "bears");

        Map<Boolean, List<String>> map1 = stream1.collect(Collectors.partitioningBy(s -> s.length() <= 5));// partitionarea este ca impartirea liste in 2, care au valoarea true sau false
        System.out.println(map1);

    }
}
