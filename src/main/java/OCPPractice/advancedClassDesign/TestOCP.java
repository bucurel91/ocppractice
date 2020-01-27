package OCPPractice.advancedClassDesign;


import OCPPractice.advancedClassDesign.enums.ExampleEnum;
import OCPPractice.advancedClassDesign.enums.TestEnum;
import OCPPractice.advancedClassDesign.toStringEqualsHashCode.Hypo;

public  class TestOCP {

    public static void main(String[] args){

       Hypo hippo = new Hypo("Joric", 2);
       Hypo hip = new Hypo("Joric", 2);

        System.out.println(hippo.equals(hip));

        System.out.println(hippo.hashCode());
        System.out.println(hip.hashCode());

        for (ExampleEnum example: ExampleEnum.values()) {
            System.out.println(example.getName() + " " + example.ordinal());
        }

        ExampleEnum exampleEnum = ExampleEnum.valueOf("SECOND");

        switch (ExampleEnum.FIRST){

            case FIRST:
                System.out.println("primu");
                break;
            case SECOND:
                System.out.println("a doilea");
                default:
                    System.out.println("nimic");
        }

        TestEnum testEnum = TestEnum.FALL;

        testEnum.print();
    }
}
