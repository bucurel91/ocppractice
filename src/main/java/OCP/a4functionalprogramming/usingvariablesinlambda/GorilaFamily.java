package OCP.a4functionalprogramming.usingvariablesinlambda;

public class GorilaFamily {

    /*
     Lambda foloseste urmatoarele tipuri de variabile -

      - de instanta si statice
      - parametrii metodelor
      - variabilele locale daca sunt finale sau efectiv finale (cind sunt initilizate doar o singura da)

     */

    static String walk = "walk";


    void everyonePlay(boolean baby){
        String approach = "amble";
       // approach = "dsa";
       // walk = "dsa";

        play(() -> walk);
        play(() -> baby? "ride" : "run");
        play(() -> approach);
    }

    void play(Gorila g){
        System.out.println(g.move());
    }

    public static void main(String[] args) {

        GorilaFamily gorilaFamily = new GorilaFamily();
        gorilaFamily.everyonePlay(true);

    }
}
