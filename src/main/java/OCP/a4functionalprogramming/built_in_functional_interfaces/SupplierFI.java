package OCP.a4functionalprogramming.built_in_functional_interfaces;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierFI {

    /*

    Supplier - se foloseste atunci cind avem nevoie de a furniza valori fara a primi careva parametri

    */


    public static void main(String[] args) {


        Supplier<LocalDate> supplier = LocalDate::now;  // method reference, forma scurta inloc la lambda la apelarea metodei care nu primeste nici un parametru
        Supplier<LocalDate> supplier1 = () -> LocalDate.now();

        LocalDate d1 = supplier.get();
        LocalDate d2 = supplier1.get();

        System.out.println(d1 + " " + d2);

        Supplier<String> s = () ->  new String();// constructor reference, forma scurta in loc de lambda la crearea obiectelor
        Consumer<String> s1 = System.out::println;
        System.out.println(s);
        String str = s.get();

        s1.accept("dsa");
    }
}
