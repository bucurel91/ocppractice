package OCP.a3genericsandcollections.comparatorcomparable;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class UseTreeSet {

    static class Rabbit{
        int id;
    }

    public static void main(String[] args) {

        Set<Duck> ducks = new TreeSet<>();
        ducks.add(new Duck("Masha", 2));

        Set<Rabbit> rabbits = new TreeSet<>();
        rabbits.add(new Rabbit());// o sa arunce ClassCastException, deoarece TreeSetu necesita sortat, deaceea tipurile de date care sunt adaugate in TreeSet
        //trebuie sa implementeze interfata Comparable

        //sau putem asa

        Set<Rabbit> rabbits1 = new TreeSet<>(  new Comparator<Rabbit>(){

            public int compare(Rabbit r1, Rabbit r2){
                return r1.id - r2.id;
            }
        });
        rabbits1.add(new Rabbit());
    }
}
