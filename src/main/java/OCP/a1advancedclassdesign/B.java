package OCP.a1advancedclassdesign;

import java.io.IOException;

public class B extends  A {

    @Override
    public void somemethod() throws IOException{

    }

    public static void main(String[] args) throws IOException {

        B b = new B();

        b.somemethod();
    }
}
