package OCP.a1advancedclassdesign.enums;

import static OCP.a1advancedclassdesign.enums.Enumuri.SUMMER;
import static OCP.a1advancedclassdesign.enums.Enumuri.WINTER;

public class TestEnums {

    public static void main(String[] args) {

        SUMMER.print();

        for (Enumuri e : Enumuri.values()) {
            System.out.println(e + " " + e.ordinal());
        }

        switch (SUMMER) {
            case SUMMER:
                System.out.println("Yuhuhu");
                break;
            case WINTER:
                System.out.println("Brrrr");
                break;
                default:
                    System.out.println("norm");
        }

        System.out.println(
            Enumuri.WINTER.valueOf(Enumuri.class, "WINTER")
        );
    }
}
