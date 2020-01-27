package OCP.a4functionalprogramming.built_in_functional_interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionBiFunctionFI {

    /*

     Function - o folosim atunci cind avem nevoie ca dintr-un tip de date primit ca parametru sa facem ceva cu el si sa returnam alt tip de date.
     BiFunction - o folosim atunci cind avem nevoie ca 2 parametri de acelasi tip primit ca parametru sa faci ceva cu ei si sa returnam alt tip de date.


     */

    public static void main(String[] args) {

        Function<String, List<String>> function = s -> Arrays.asList();//Arrays::asList;
        List<String> list = function.apply("dsa");
        list.forEach(System.out::println);

        BiFunction<String, String, String> biFunction = String::concat;//Str
        System.out.println(biFunction.apply("primu cu", " al doilea"));
    }

}
