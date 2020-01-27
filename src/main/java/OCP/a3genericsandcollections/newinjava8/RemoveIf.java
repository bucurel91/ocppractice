package OCP.a3genericsandcollections.newinjava8;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

    public static void main(String[] args) {

        List<String > list = new ArrayList<>();
        list.add("Jora");
        list.add("Sfeta");
        list.add("Bodiu");
        list.forEach(System.out::println);

        System.out.println("-------------------");

        list.removeIf(s -> s.contains("a"));
        list.forEach(System.out::println);

        System.out.println("--------------------");

        list.replaceAll(s -> s + " o hernea la capat");
        list.forEach(System.out::println);
    }
}
