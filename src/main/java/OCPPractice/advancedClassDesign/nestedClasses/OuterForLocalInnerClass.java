package OCPPractice.advancedClassDesign.nestedClasses;

public class OuterForLocalInnerClass {

    private int lenght = 5;

    public void calculate() {

         int width = 20; // in java 7 variabila locala trebuie sa fie final ca sa poate fi apelata in in clasa interna(inner) locala (cea de mai jos),
        // in java 8 nu e necesar

        class Inner {

            String d = "dsa";

            public void multiply() {
                System.out.println(d);
                System.out.println(lenght * width);
            }
        }
        Inner inner = new Inner();
        inner.multiply();

    }


    public static void main(String[] args) {

        OuterForLocalInnerClass outerForLocalInnerClass = new OuterForLocalInnerClass();
        outerForLocalInnerClass.calculate();


    }
}
