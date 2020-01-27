package OCPPractice.cgenericAndCollections;

import java.util.ArrayList;
import java.util.List;

public class TestClass {

    static String name;

    public static void main(String[] args) {

        name = "kpr";
        String[] array = new String[]{"Marcel", "Vlad", "Igor"};

        TestClass.print("joric");

        List<String> list = new ArrayList<>();

        list.add("5432");
        list.add("321");
        list.add("132");

        for (String marcels: list) {
            System.out.println(marcels);
        }

        list.forEach(s -> System.out.println(s));

        list.forEach(System.out::println);
    }

    public static void print(String ...args){

        for (String arg: args) {
            System.out.println(arg);
        }
    }
}
