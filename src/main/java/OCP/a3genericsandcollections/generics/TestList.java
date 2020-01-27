package OCP.a3genericsandcollections.generics;

import java.util.ArrayList;
import java.util.List;

public class TestList {

    static void printNames(List list){
        for (int i = 0; i < list.size(); i++) {
            String name = (String) list.get(i);//Class Cast exception, deoarace StringBuilder nu poate fi cast in String
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add(new StringBuilder("Wendy"));
        printNames(names);
    }
}
