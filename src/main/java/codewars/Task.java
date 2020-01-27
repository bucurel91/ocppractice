package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task {

    public static void main(String[] args) {

        int[] a = new int[]{0, -14, 191, 161, 19, 144, 195, 1, 2};
        int[] b = new int[]{1, 0, 196, 36481, 25921, 361, 20736, 38025, 3};

        System.out.println(Math.sqrt(1));
        System.out.println(comp(a, b));



    }

    public static boolean comp(int [] a, int [] b){


        if(a == null || b == null)
            return false;
        else if (a.length == 0 && b.length == 0)
            return true;

        int counter = 0;
        int counter2 = 3;
        int counter3 = -3;


        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < b.length; j++) {

                if(Math.abs(a[i]) == Math.sqrt(b[j])) {
                    counter++;
                    a[i] = counter2;
                    b[j] = counter3;
                    counter2++;
                    counter3--;
                    if(counter == a.length)
                        return true;
                }

            }
        }

        return false;
    }
}
