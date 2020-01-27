package OCP.a4functionalprogramming.built_in_functional_interfaces;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateBiPredicateFI {

    public static void main(String[] args) {

        Predicate<String> p = String::isEmpty; //s -> s.contains("d");
        boolean contains = p.test("trtr");
        System.out.println(contains);

        Predicate<String> p1 = String::isEmpty;

        BiPredicate<String, String> p3 = String::equals;
        boolean strings = p3.test("eq", "eq");
        System.out.println(strings);

        BiPredicate<Integer, Integer> p2 = (d1, d2) -> d1 + d2 == 5;
        boolean equals = p2.test(2,3);
        System.out.println(equals);


       Predicate<String> verify = s -> s.contains("egg") && s.contains("brr");// toata asta se poate de scris prin metoda and()
        Predicate<String> defaultMethods = p.and(p1); //verifica daca predicat p este true sau false si predicate p1 este true sau false si returneaza un boolean
    }
}
