package OCPPractice.zcodingGame;

import java.util.Scanner;

public class Exercogoiu {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse

        int[] initialArr = new int[n];
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            initialArr[i] = t;
            System.out.println(initialArr.length);
            System.out.println(initialArr[i]);

            if(i == 0){
                remainder = initialArr[i];
            }

            if (initialArr[1] != 0) {

                    if ((initialArr[i - 1] > 0 && initialArr[i] > 0) && ((initialArr[i - 1] > initialArr[i])  && (remainder > initialArr[i])) ) {
                        remainder = initialArr[i];

                    } else if ((initialArr[i - 1] < 0 && initialArr[i] < 0) && ((Math.abs(initialArr[i - 1]) > Math.abs(initialArr[i])) && (Math.abs(remainder) > Math.abs(initialArr[i])))) {
                        remainder = initialArr[i];
                    } else if ((initialArr[i - 1] > 0 && initialArr[i] < 0) && ((initialArr[i - 1]  > Math.abs(initialArr[i])) && (remainder > initialArr[i])) ) {
                        remainder = initialArr[i];
                    } else if ((initialArr[i] < 0 && initialArr[i] > 0) && ((Math.abs(initialArr[i]) < initialArr[i + 1]) && (remainder > initialArr[i])) ) {
                        remainder = initialArr[i];
                    }

            }
        }

        for (int i = 0; i < n; i++){
            if(Math.abs(remainder) == initialArr[i]){
                remainder = Math.abs(remainder);
            }

        }
        System.out.println(remainder);

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

    }
}
