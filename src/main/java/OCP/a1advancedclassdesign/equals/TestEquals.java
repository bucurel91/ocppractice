package OCP.a1advancedclassdesign.equals;

import OCP.a1advancedclassdesign.tostring.Hippo;

public class TestEquals {

    public static void main(String[] args) {



        Hippo hippo = new Hippo("MotoMoto", 100);
        Hippo hippo1 = new Hippo("MotoMoto", 100);

        System.out.println(hippo.hashCode());
        System.out.println(hippo1.hashCode());
        System.out.println(hippo.equals(hippo1));
    }
}
