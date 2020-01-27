package OCPPractice.advancedClassDesign.instanceOf;

import java.io.IOException;

public abstract class Test {

    public static void main(String[] args) throws IOException {

        HeavyAnimal hippo = new Hypo();
         boolean b1 = hippo instanceof Hypo; // true
         boolean b2 = hippo instanceof HeavyAnimal; // true
         boolean b3 = hippo instanceof Elephant;

        System.out.println(b1 + " " + b2 + " " + b3);
    }
}
