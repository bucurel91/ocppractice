package OCA;

public class Modulus {

   static char g = 10000;

   double a5 = 10;
   String name = "igor";
    public static void main(String[] args) {


    Modulus mod = new Modulus();
    mod.setName();
        System.out.println(mod.name);

        char i;
        LOOP: for (i=0;i<5;i++){
            switch(i++){
                case '0': System.out.println("A");
                case 1: System.out.println("B"); break LOOP;
                case 2: System.out.println("C"); break;
                case 3: System.out.println("D"); break;
                case 4: System.out.println("E");
                case 'E' : System.out.println("F");
            }
        }
    }

    public void setName(){

        String name = "Vanea";

    }
}
