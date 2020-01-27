package OCPPractice.advancedClassDesign.enums;

public enum ExampleEnum {

    FIRST("primu"),
    SECOND("al doilea"),
    THIRD("al treilea");

    private String name;

    ExampleEnum(String value) {
        this.name = value;
    }

    public String getName() {
        return this.name;
    }

}
