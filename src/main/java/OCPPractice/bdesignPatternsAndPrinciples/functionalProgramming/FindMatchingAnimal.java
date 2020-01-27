package OCPPractice.bdesignPatternsAndPrinciples.functionalProgramming;

import java.util.function.Predicate;

public class FindMatchingAnimal implements CheckTrait {

    public static void print(Animal animal, Predicate<Animal> animalPredicate) {
        if (animalPredicate.test(animal)) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {


        print(new Animal("fish", false, true),  animal -> animal.canSwim());
        print(new Animal("kangoroo", true, false), Animal::canHop);
    }

    @Override
    public boolean test(Animal animal) {
        return false;
    }

    @Override
    public void parint() {

        System.out.println("altceva");

        System.out.println("nustiu ce ink");

    }


}
