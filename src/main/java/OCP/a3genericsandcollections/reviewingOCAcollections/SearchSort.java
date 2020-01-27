package OCP.a3genericsandcollections.reviewingOCAcollections;

import java.util.Arrays;

public class SearchSort {

    static int[] numbers = {1, 9, 2, 6, 7};

    public static void main(String[] args) {

        Arrays.sort(numbers);

        System.out.println(Arrays.binarySearch(numbers, 6));
        for (int x :numbers) {
            System.out.println(x);
        }
    }
}
