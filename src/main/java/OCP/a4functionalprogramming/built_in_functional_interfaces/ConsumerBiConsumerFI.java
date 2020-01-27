package OCP.a4functionalprogramming.built_in_functional_interfaces;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerBiConsumerFI {

    /*
     Consumer se foloseste atunci cind  avem nevoie sa transmite un parametru insa sa nu ne returneze nimic

    */


    public static void main(String[] args) {

        Consumer<String> s1 = System.out::println;
        s1.accept("dsa");
        System.out.println(s1); //aici se apeleaza toString la lambda expresion



        Map<String, Integer> map = new HashMap<>();
        BiConsumer<String, Integer>  biConsumer = map::put;
        BiConsumer<String, Integer>  biConsumer1 = (k, v) -> map.put(k, v);
        BiConsumer<String, Integer> printBiconsumer = (k, v) -> System.out.println(k + " " + v);
        biConsumer.accept("Doba", 1);
        biConsumer1.accept("Doba2", 2);
        System.out.println(map);

        map.forEach((k, v) -> System.out.println(k + " " + v));
        map.forEach(printBiconsumer);

    }
}
