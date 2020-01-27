package patterns.BuilderPattern;

import OCPPractice.bdesignPatternsAndPrinciples.functionalProgramming.Animal;

public class TestBuilder {

    public static void main(String[] args) {

        Person person = new PersonBuilder().setId(2).setName("Jora").build();
        System.out.println(person);

        Animala animala = Animala.builder().setId(4).setName("Put").build();
        System.out.println(animala);
    }

}
