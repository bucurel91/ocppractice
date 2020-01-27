package OCP.a2designpatternsandprinciples.patterns.builder;

import java.util.Arrays;

public class TestBuilder {

    public static void main(String[] args) {

        Person person = Person.builder()
            .setAge(2)
            .setName("Jora")
            .setHobbyes(Arrays.asList("Sport", "Citit"))
            .build();

        System.out.println( person.getAge());

        Person person1 = Person.builderPerson().setAgee(5);
        System.out.println(person1.getAge());


    }


}
