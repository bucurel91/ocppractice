package OCP.a1advancedclassdesign.instanceOf;

public class Test {

    public static void main(String[] args) {

        HeavyAnimal heavyAnimal = new Hippo();
        Hippo hippo = new Hippo();
        Hippo hippo1 = null;

        boolean b = hippo1 instanceof Hippo;
        boolean b1 = heavyAnimal instanceof Hippo;
        boolean b2 = hippo instanceof Hippo;
       // boolean b3 = hippo instanceof Elephant;// nu se compileaza, deoarece nu se poate de facut cast din Hippo in Elephant

        System.out.println(b1 +" " +  b2 + " " + b);
    }
}
