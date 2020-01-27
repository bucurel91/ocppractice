package OCPPractice.dfunctionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionBiFunctionLambda {

    //Functional Interfaces - Functions si BiFunction - transformarea unui parametru intr-o valoare care sa fie returnata de metoda,
                                                    // BiFunction primeste 2 parametri si ii transforma intr-o valoare si este returnata.

//    @FunctionalInterface public class Function<T, R> {
//        R apply(T t);
//    }

//    @FunctionalInterface public class BiFunction<T, U, R> {
//        R apply(T t, U u);
//    }

    static Function<String, Integer> f1 = String::length;
    static Function<String, Integer> f2 = x -> x.length();

    static BiFunction<String, String, String> f3 = String::concat;
    static BiFunction<String, String, String> f4 = (y,z) -> y.concat(z);


    public static void main(String[] args) {

        System.out.println(f1.apply("chuck"));
        System.out.println(f2.apply("chuck"));

        System.out.println(f3.apply("jocric ", "Vartamov"));
        System.out.println(f4.apply("Vasilik ", "Chiparush"));


    }




}
