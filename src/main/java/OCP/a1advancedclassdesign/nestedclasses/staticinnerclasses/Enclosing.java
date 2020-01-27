package OCP.a1advancedclassdesign.nestedclasses.staticinnerclasses;

/*
      Clasele static interne  (static nested clases) - este o clasa statica declarata la nivel de membru,
   ea poate fi instantiata fara ajutorul clasei care o contine, deci clasa interna statica nu poate avea acces
   la varianbilele de instanta fara obiectul explicit al clasei externe.

   - incuibarea (nesting) creaza spatii de nume, deoarece numele clasei externe trebuie folosit pentru referire la clasa interna.
   - clasa statica interna poate fi privata sau sa foloseasca orce alt modificator de acces pentru encapsulare.
   - clasa externa se poate referi la cimpurle si metodele clasei statice interne.

 */


public class Enclosing {

    private  int price = 5;

    public void print(){
        System.out.println("Enclosing");
    }
   static class Nested  extends  Enclosing{

        private int price = 3;

//        public void print(){
//            System.out.println("nested");
//        }
    }

    public static void main(String[] args) {

       Enclosing enclosing = new Nested();
        Nested nested = new Nested();
        System.out.println(nested.price);
        System.out.println(enclosing.price);

        nested.print();
        enclosing.print();
    }
}
