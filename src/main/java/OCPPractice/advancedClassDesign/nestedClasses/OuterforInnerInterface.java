package OCPPractice.advancedClassDesign.nestedClasses;

public class OuterforInnerInterface {

    private interface Secret{

        public void shh();
    }

    class Inner implements Secret{

        public void shh(){

        }
    }


}
