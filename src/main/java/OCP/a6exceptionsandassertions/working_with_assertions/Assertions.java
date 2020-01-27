package OCP.a6exceptionsandassertions.working_with_assertions;

import static OCP.a6exceptionsandassertions.working_with_assertions.Assertions.Seasons.FALL;
import static OCP.a6exceptionsandassertions.working_with_assertions.Assertions.Seasons.WINTER;

public class Assertions {

    enum Seasons {
        SPRING, WINTER, FALL
    }

    public static void main(String[] args) {

        testSeason(FALL);


       // assert compare(5, 4) : "nu este egal";
    }

    public static boolean compare(int x, int y) {

        return x < y;
    }

    public static void testSeason(Seasons s) {

        switch (s) {
            case WINTER:
                System.out.println("Shorter hours");
                break;
            case SPRING:
                System.out.println("Longer hours");
                break;
            case FALL:
                break;
                default:
                    assert false: "Invalid season";
        }
    }
}
