package OCP.a3genericsandcollections.generics.wildcards;

import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WildCard {

    public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("Jora");
    list.add("Vera");
    print(list);


    List<Integer> numbers = new ArrayList<Integer>();
    numbers.add(2);
    numbers.add(4);
    numbers.contains(4);
    System.out.println(total(numbers));

    List<Sparrow> sparrows = new ArrayList<>();
    sparrows.add(new Sparrow());
    anyFlyer(sparrows);

    List<? super IOException> exceptions = new ArrayList<Throwable>();
    exceptions.add(new IOException());
    }


    public static void print(List<?> list){ //Wildcard - lista primeste orce tip de date in cazul dat.

        for (Object x: list) {
            System.out.println(x);
        }
    }

    public static long total(List<? extends Number> list) { // lista primeste orice tip de date care extinde Numbers ( Long, Integer, Double etc);
        long count = 0;
        for (Number number: list)
            count += number.longValue();
        return count;
    }

    public static void anyFlyer(List<? extends Bird> birds){
        for (Bird b: birds) {
            System.out.println(b.toString());
        }
    }
}
