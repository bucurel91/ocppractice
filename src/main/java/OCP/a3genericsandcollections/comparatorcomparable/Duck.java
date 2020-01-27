package OCP.a3genericsandcollections.comparatorcomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Duck implements Comparable<Duck> {

    private String name;
    private int weigth;

    public String getName() {
        return name;
    }

    public int getWeigth() {
        return weigth;
    }

    public Duck(String name, int weigth){
        this.name = name;
        this.weigth = weigth;
    }

    @Override
    public String toString() {
        return "Duck{" +
            "name='" + name + '\'' +
            ", weigth=" + weigth +
            '}';
    }

    @Override
    public int compareTo(Duck o) {
        return name.compareTo(o.name);
    }


   static Comparator<Duck> byWeigth = (d1, d2) -> d1.weigth - d2.weigth;

    public static void main(String[] args) {

        Duck duck = new Duck("Quack", 7);
        Duck duck1 = new Duck("Puddles", 11);
        Duck duck2 = new Duck("McDuck", 1);
        List<Duck> ducks = new ArrayList<>();
        ducks.add(duck);
        ducks.add(duck1);
        ducks.add(duck2);

        Collections.sort(ducks);
        System.out.print(ducks);
        System.out.println("\n" + " ---------------------");

        Collections.sort(ducks, byWeigth);
        System.out.println(ducks);
    }
}
