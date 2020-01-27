package OCPPractice.bdesignPatternsAndPrinciples.patterns;

import java.util.List;

public class BuilderPerson {

   private int age;
   private String name;
   private List<String> studies;

    public BuilderPerson setAge(int age) {
        this.age = age;
        return this;
    }

    public BuilderPerson setName(String name) {
        this.name = name;
        return this;
    }

    public BuilderPerson setStudies(List<String> studies) {
        this.studies = studies;
        return this;
    }

//    public Person build(){
//
//        return new Person(age, name, studies);
//    }
}
