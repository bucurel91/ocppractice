package OCP.a4functionalprogramming.built_in_functional_interfaces;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryOperatorBinaryOperatorFI {

    /*

    UnaryOperator - este un caz special pentru o functie.Ea necesita ca toti parametrii necesari sa fie de acelasi tip. UnaryOpearator transforma
    valoarea parametrului primit in acelasi tip de date, spre exemplu incrementarea cu unu este o operatie unara.UnaryOperator extinde Function,
    diferenta este ca Function primeste un tip de date, dar returneaza alt tip.

    BinaryOperator - exact ca si unari, doar ca primeste 2 parametri de acelasi tip si trasnorma valorile ambleor in acelasi tip de date, la fel extinde
    BiFunction.
    */


    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator = String:: toUpperCase;
        System.out.println(unaryOperator.apply("ura"));

        BinaryOperator<String> binaryOperator = String::concat;

        System.out.println(binaryOperator.apply("ora", "jumda"));
    }
}
