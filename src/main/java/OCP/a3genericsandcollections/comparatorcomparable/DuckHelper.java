package OCP.a3genericsandcollections.comparatorcomparable;

import java.util.Comparator;

public class DuckHelper {

    public static int compareByWeight(Duck d1, Duck d2){
        return d1.getWeigth() - d2.getWeigth();
    }

    public static int compareByName(Duck d1, Duck d2){
      return   d1.getName().compareTo(d2.getName());
    }

    public static void main(String[] args) {

        Comparator<Duck> c = (d1, d2) -> DuckHelper.compareByWeight(d1, d2);
        Comparator<Duck> c1 = DuckHelper :: compareByName;
    }
    }
