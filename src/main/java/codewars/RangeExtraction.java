package codewars;

import java.util.ArrayList;
import java.util.List;

public class RangeExtraction {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {


        int[] arr2 = new int[]{-21,-19,-18,-17,-16,-14,-12,-11,-10,-8,-5,-2,-1,2,4,5,6,8,11,14,15,18,19,20,23,26,29};


        int[] arr1 = new int[]{-6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20};
        int[] arr = new int[]{-6, -5, -4, 0, 1, 2, 3, -3};

        System.out.println(rangeExtraction(arr2));
    }

    public static String rangeExtraction(int[] arr) {


        StringBuilder sb = new StringBuilder();

        String result;
        int temp = arr[0];
        list.add(arr[0]);

        for (int i = 0; i < arr.length; i++) {

            if(temp == arr[i] - 1){
                list.add(arr[i]);
                if(i == arr.length - 1)sb.append(appendRange(list));
                temp = arr[i];
            }

            if(temp < arr[i] - 1){
                sb.append(appendRange(list));
                list.clear();
                list.add(arr[i]);
                if(i == arr.length - 1)sb.append(appendRange(list));
                temp = arr[i];
            }

        }

            sb.setLength(sb.length() - 1);
        list.clear();
        result = sb.toString();

        return result;
    }


    public static StringBuilder appendRange(List<Integer> arr) {

        Object[] ar = arr.toArray();

        StringBuilder sb = new StringBuilder();

        if (list.size() > 2) {
            sb.append(ar[0]).append("-").append(ar[ar.length - 1]).append(",");
        } else if (list.size() == 2) {
            sb.append(ar[0]).append(",").append(ar[1]).append(",");
        }

        if (list.size() < 2) {
            sb.append(ar[0]).append(",");
        }


        return sb;
    }

}

