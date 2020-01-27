package OCA;

import java.util.Scanner;

public class Exercises {


    public static void main(String[] args) {

        stringPersistance("igor", "rogi");

        Short k = 9;
        Integer i = 9;

        i = (int) k.shortValue();



        int x = 10, y = 20;
        int dx, dy;
        try {
            dx = x % 5;
            dy = y / dx;
        } catch (
            ArithmeticException ae) {
            System.out.println("Caught AE");
            dx = 2;
            dy = y / dx;
        }

        x = x / dx;
        y = y / dy;
        System.out.println(dx + " " + dy);
        System.out.println(x + " " + y);
    }

    public static Boolean stringPersistance (String firstString, String secondString){
        for (int i = 0; i < firstString.length(); i++) {
            for (int j = 0; j < secondString.length(); j++) {
                char[] firstChars = firstString.toCharArray();
                char[] secondChars = secondString.toCharArray();
                if (firstChars[i] == secondChars[j]) {
                    break;
                }
            }
        }
        return true;
    }
}
