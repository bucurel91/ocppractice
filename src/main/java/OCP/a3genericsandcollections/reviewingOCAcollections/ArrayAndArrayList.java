package OCP.a3genericsandcollections.reviewingOCAcollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndArrayList {


    public static void main(String[] args) {
        String[] array = { "gerbil", "mouse" };
        List<String> list = Arrays.asList(array);
        list.set(1, "test");
        array[0] = "new";
        String[] array2 = (String[]) list.toArray();
        for (String s: list) {
            System.out.println(s);
        }
        List<String> list2 = new ArrayList<>();
        list2.add("jor");
        list2.add("bur");
        list2.set(1, ":dor");
        list2.remove(1);

        list.remove(1);
    }

}
