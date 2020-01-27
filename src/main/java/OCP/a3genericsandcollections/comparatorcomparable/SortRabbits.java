package OCP.a3genericsandcollections.comparatorcomparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {

    static class Rabbit implements Comparable<Rabbit>{
        int id;

        @Override
        public int compareTo(Rabbit o) {
            return id - o.id;
        }
    }

    public static void main(String[] args) {

        List<Rabbit> rabbits = new ArrayList<>();
        rabbits.add(new Rabbit());
        Collections.sort(rabbits);

        Comparator<Rabbit> rabbitComparator = Comparator.comparingInt(r -> r.id);
        Collections.sort(rabbits, rabbitComparator);

        List<String> list = Arrays.asList("Joric", "tamara");
        Comparator<String > c = Comparator.reverseOrder();
       int index = Collections.binarySearch(list, "tamara", c);
        System.out.println(index);
    }
}
