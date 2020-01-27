package OCPPractice.advancedClassDesign.enums;

public enum TestEnum {

    WINTER{
        public void print(){
            System.out.println("winter");
        }
    },SUMMER{
        public void print(){
            System.out.println("summer");
        }
    },FALL{
        public void print(){
            System.out.println("fall");
        }
    };

    public abstract void print();
}
