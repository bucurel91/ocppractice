package OCPPractice.bdesignPatternsAndPrinciples;

import OCPPractice.bdesignPatternsAndPrinciples.patterns.Person;
import OCPPractice.bdesignPatternsAndPrinciples.patterns.Singleton;

public class TestClass {

    public static void main(String[] args) {

      Singleton singleton =  Singleton.getInstance();

//        Person builderPerson = new BuilderPerson().setAge(25).setName("Jorik").build();

        Person person = Person.builder().setAge(4).setName("Joric").build();


        System.out.println(person.getName());
        System.out.println(person);
    }
}
