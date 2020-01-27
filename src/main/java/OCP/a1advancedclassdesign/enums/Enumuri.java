package OCP.a1advancedclassdesign.enums;

public enum Enumuri {

    WINTER("Low"){
        public void print(){
            System.out.println("Is winter");
        }
    }, SPRING("Medium"){
        public void print(){
            System.out.println("Is Spring");
        }
    }, SUMMER("FAST"){
        @Override
        public void print() {
            System.out.println("Is Summer");
        }
    }, FALL("Medium"){
        @Override
        public void print() {
            System.out.println("Is Fall");
        }
    };

    private String value;

    private Enumuri(String value) {
        this.value = value;
    }

    public abstract void print();// aici se poate si default metoda public void print(){face ceva..}; si sa fie override in fiecare ENUM

//    public String getValue(){
//        return this.value;
//    }
}
