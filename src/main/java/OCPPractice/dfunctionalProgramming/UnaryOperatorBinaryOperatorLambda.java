package OCPPractice.dfunctionalProgramming;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorBinaryOperatorLambda {

    //Functional Interfaces - UnaryOperator and BinaryOperator - UnaryOpetator transofrma variabila sa intr-o valuare de acelasi tip (spre exemplu incrementarea cu 1)
                                                                //BinaryOperator comaseaza 2 valori in una de acelasi ti
    //Ambele extind interfata Function


//    @FunctionalInterface public interface UnaryOperator<T>
//        extends Function<T, T> { }
//    @FunctionalInterface public interface BinaryOperator<T>
//        extends BiFunction<T, T, T> { }
//    This means that method signatures look like this:
//    T apply(T t);
//    T apply(T t1, T t2)

    String str=  "dsa";

    static UnaryOperator<String> u1 = String::toUpperCase;
    static UnaryOperator<String> u2 = x->x.toUpperCase();

    static BinaryOperator<String> u3 = String::concat;
    static BinaryOperator<String> u4 = (string, toAdd) -> string.concat(toAdd); // aceasta face exact ce face BiFunction, cu diferenta ca parametru este doar 1 si nu 3.

    public static void main(String[] args) {

        System.out.println(u1.apply("igor cu litere mici"));
        System.out.println(u2.apply("joric"));

        System.out.println(u3.apply("eu ", "adaug alt eu"));
        System.out.println(u4.apply("tu ", "adaugi alt tu"));
    }
}
