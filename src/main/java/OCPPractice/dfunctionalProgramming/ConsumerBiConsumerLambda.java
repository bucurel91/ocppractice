package OCPPractice.dfunctionalProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerBiConsumerLambda {

    //Functional Interfaces Consumer and Biconsumer - Consumer este folosit cind doresti sa faci ceva cu un parametru fara sa returnezi ceva.
    //BiConsumer e similar doar ca primeste 2 parametri

//        @FunctionalInterface public class Consumer<T> {
//            void accept(T t);
//        }
//        @FunctionalInterface public class BiConsumer<T, U> {
//            void accept(T t, U u);
//        }

    public static void main(String[] args) {

        Consumer<String> s = System.out::println;
        Consumer<String> s1 = x -> System.out.println(x);

        s.accept("Joric Consumer");
        s1.accept("Joric2 Consumer");

        Map<String, Integer> map = new HashMap<>();

        BiConsumer<String, Integer> b = map :: put;
        BiConsumer<String, Integer> b1 = (k, v) -> map.put(k, v);

        b.accept("keya1", 1);
        b1.accept("keya2", 2);

        System.out.println(map);
    }
}
