package OCPPractice.dfunctionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateBiPredicateLambda {

    //Functional Interfaces Predicate - este folosit pentru a filtra ceva sau a verifica potrivirea.

//    @FunctionalInterface public class Predicate<T> {
//        boolean Exercogoiu(T t);
//    }
//    @FunctionalInterface public class BiPredicate<T, U> {
//        boolean Exercogoiu(T t, U u);
//    }

    static Predicate<String> s = String::isEmpty;
    static Predicate<String> s1 = x -> x.isEmpty();

    static BiPredicate<String, String> s2 = String::startsWith;
    static BiPredicate<String, String> s3 = (z, y ) -> z.startsWith(y);

    public static void main(String[] args) {

        System.out.println(s.test(""));
        System.out.println(s1.test(" "));

        System.out.println(s2.test("chicken", "chick"));
        System.out.println(s3.test("chicken", "chiok"));

    }
}
