package OCA;

import com.sun.java_cup.internal.runtime.virtual_parse_stack;

public class ExceptionsTest {

    public static void main(String[] args) throws Exception {
        int[] a = null;
        int i = a[m1()];
    }

    public static int m1() throws Exception {
        throw new Exception("Some Exception");
    }


}
