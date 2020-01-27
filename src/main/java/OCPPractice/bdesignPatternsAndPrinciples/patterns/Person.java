package OCPPractice.bdesignPatternsAndPrinciples.patterns;

import java.util.List;

public class Person {

    private int age;
    private String name;
    private List<String> studies;

    private Person() {

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public List<String> getStudies() {
        return studies;
    }



    public static Builder builder (){

        return new Person().new Builder();
    }

    public class Builder{

        private Builder(){

        }

        public Builder setAge(int age) {
            Person.this.age = age;
            return this;
        }

        public Builder setName(String name) {
            Person.this.name = name;
            return this;
        }

        public Builder setStudies(List<String> studies) {
            Person.this.studies = studies;
            return this;
        }

        public Person build(){
            return Person.this;
        }
    }

}

