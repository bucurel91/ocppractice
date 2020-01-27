package OCP.a2designpatternsandprinciples.patterns.builder;

import java.util.List;

public class Person {

    private int age;
    private String name;
    private List<String> hobbyes;


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbyes() {
        return hobbyes;
    }

    public static Builder builder(){
        return new Person(). new Builder();
    }


    public static Person builderPerson(){
        return new Person();
    }

    public Person setAgee(int age){
        this.age = age;
        return this;
    }

    public Person build(){
        return this;
    }


    public class Builder{

        private Builder(){

        }

        public Builder setName(String name){
            Person.this.name = name;
            return this;
        }

        public  Builder setAge(int age) {
            Person.this.age = age;
            return this;
        }

        public Builder setHobbyes(List<String> hobbyes){
            Person.this.hobbyes = hobbyes;
            return this;
        }

        public Person build(){
            return Person.this;
        }

    }
}
