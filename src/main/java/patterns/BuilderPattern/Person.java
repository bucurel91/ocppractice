package patterns.BuilderPattern;

public class Person {

    private String name;
    private int id;



        public Person(String name,int id){
            this.id = id;
            this.name = name;
        }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", id=" + id +
            '}';
    }
}
