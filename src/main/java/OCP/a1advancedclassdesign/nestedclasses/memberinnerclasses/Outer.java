package OCP.a1advancedclassdesign.nestedclasses.memberinnerclasses;

/*
Clasele de instanta interne (member inner classes) -
 - pot fi public, privet,protected sau default
 - pot extinde orce clasa si implimenta orce interfata
 - pot fi abstracte sau finale
 - nu pot declara cimpuri statice sau metode
 - pot accesa membrii clasei externe inclusiv cimpurile private

 */

public class Outer {

    String greetings = "Hi";

    public class Inner {
        public  int repeat = 3;

        public void go(){

            for (int i = 0; i < repeat; i++) {
                System.out.println(greetings);
            }
        }
    }

    public void callInner(){
        Inner inner = new Inner();
        inner.go();
    }

    public static void main(String[] args) {

        Outer outer = new Outer();
        Inner inner = outer.new Inner();
      //  Inner inner1 = new Inner(); nu putem intantia, deoarece este membru de instanta, respectiv nu este statica si nu putem so apelam intr-o metoda statice psvm.
        outer.callInner();
        inner.go();
    }
}
