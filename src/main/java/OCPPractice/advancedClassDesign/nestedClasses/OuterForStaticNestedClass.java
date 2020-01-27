package OCPPractice.advancedClassDesign.nestedClasses;

public class OuterForStaticNestedClass {

    /*
    Static nested classes are not inner classes.
     */
    private int x = 4;

    static class NestedStaticClass {
        private int price = 6;

         OuterForStaticNestedClass o = new OuterForStaticNestedClass();

       void scrie(){
           System.out.println(o.x);
           //System.out.println(x); nu se poate deoarece x nu este static, respectiv in clasa static interna nu poti apela direct variabilel non-static, doar prin referinta.
       }

        static void print() {
            System.out.println("static nested class");

        }
    }

    public static void main(String[] args) {

        NestedStaticClass nested = new NestedStaticClass();
        NestedStaticClass.print();
        nested.print();

       // NestedStaticClass.scrie(); nu e valabil, metoda nu este statica

        System.out.println();
        System.out.println(nested.price);

    }
}
