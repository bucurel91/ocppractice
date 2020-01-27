package codewars;

import java.util.ArrayList;
import java.util.List;

public class Greed {


    public static int greedy(int[] dice) {

        for (int x : dice) {
            System.out.print(x);
        }

        List<Integer> list = new ArrayList<>();
        int result = 0;

        for (int x : dice) {
            list.add(x);
        }

        if (list.stream().filter(num -> num == 1).count() == 3) {
            result = 1000;

        } else if (list.stream().filter(num -> num == 1).count() == 1) {
            result = 100;

        } else if (list.stream().filter(num -> num == 1).count() == 2) {
            result = 200;

        } else if (list.stream().filter(num -> num == 1).count() == 4) {
            result = 1100;

        } else if (list.stream().filter(num -> num == 1).count() == 5) {
            result = 1200;

        }

        if (list.stream().filter(num -> num == 2).count() == 3) {
            result = result + 200;
        }

        if (list.stream().filter(num -> num == 3).count() == 3) {
            result = result + 300;
        }

        if (list.stream().filter(num -> num == 4).count() == 3) {
            result = result + 400;
        }

        if (list.stream().filter(num -> num == 5).count() == 3) {
            result = result + 500;
        } else if (list.stream().filter(num -> num == 5).count() == 1) {
            result = result + 50;
        } else if (list.stream().filter(num -> num == 5).count() == 2) {
            result = result + 100;
        } else if (list.stream().filter(num -> num == 5).count() == 4) {
            result = result + 550;
        } else if (list.stream().filter(num -> num == 5).count() == 5) {
            result = result + 600;
        }

        if (list.stream().filter(num -> num == 6).count() >= 3) {
            result = result + 600;
        }

        return result;
    }

//        public static void main (String[]args){
//
//            int[] x = {1, 1, 1, 3, 4};
//            greedy(x);
//        }
}

//        for (int i = 0; i < dice.length; i++) {
//            if(dice[i] == 1){
//                for (int j = 1; j < dice.length; j++) {
//                    //if(dice[j] == dice[i] && )
//                }
//            }