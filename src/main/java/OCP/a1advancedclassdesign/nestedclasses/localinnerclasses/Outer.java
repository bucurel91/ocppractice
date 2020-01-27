package OCP.a1advancedclassdesign.nestedclasses.localinnerclasses;


/*
Clasele locale (local inner classes)
    - nu au modificatori de acces
    - nu pot fi declarate statice si nu pot contine cimpuri ori metode statice
    - ele au acces la toate cimpurile si metodile a clasei externe
    - ele nu au acces la variabilele locale  a unei metode cel putin daca aceste variabile nu sunt finale sau finale efective.
 */
public class Outer {

    private int length = 5;

    public void calculate(){

        class Inner{
            int width;
            public void multiply(){
                this.width = length;
                System.out.println(length * width);
            }
        }

        Inner inner = new Inner();
        inner.multiply();
    }

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.calculate();
    }

}
