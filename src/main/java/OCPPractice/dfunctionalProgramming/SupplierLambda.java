package OCPPractice.dfunctionalProgramming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierLambda {



    public static void main(String[] args) {

        //Functional Interface Supplier - e folosit pentru a genera sau furniza valori fara a lua date de intrare


//        @FunctionalInterface public class Supplier<T> {
//            public T get();
//        }


        Supplier<LocalDate> s1 = () -> LocalDate.now();
        Supplier<LocalDate> s = LocalDate::now;

        LocalDate d = s1.get();
        LocalDate d1 = s.get();

        System.out.println(d + " " + d1);

        //////////////////////////////////////////////////////////////////////////////////

        Supplier<ArrayList<String>> arr = ArrayList::new;
        ArrayList arr1 = arr.get(); //metoda get creeaza o noua instanta de tip ArrayList<String>

        System.out.println(arr1);



    }
}
