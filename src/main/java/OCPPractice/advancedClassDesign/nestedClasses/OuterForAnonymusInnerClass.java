package OCPPractice.advancedClassDesign.nestedClasses;

public class OuterForAnonymusInnerClass {

    interface SaleTodayOnly{ //aici poate fi si o clasa obisnuita sau abstracta
        int dollarsOff();
    }

    public int admission(int basePrice){

        int rubla = 4; // in java 7 variabila locala trebuie sa fie final ca sa poate fi apelata in in clasa anonima (cea de mai jos),
        // in java 8 nu e necesar

        SaleTodayOnly sale = new SaleTodayOnly() {
            @Override
            public int dollarsOff() {
                System.out.println(rubla);
                return 0;
            }
        };
        return basePrice - sale.dollarsOff();
    }

    public static void main(String[] args) {

        OuterForAnonymusInnerClass outer = new OuterForAnonymusInnerClass();

        System.out.println(outer.admission(4));
    }
}
