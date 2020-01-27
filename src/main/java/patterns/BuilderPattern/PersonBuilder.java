package patterns.BuilderPattern;

public class PersonBuilder {

    private String name;
    private int id;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }


    public PersonBuilder setId(int id) {
        this.id = id;
        return this;
    }


    public Person build() {
        return new Person(name, id);
    }

}
