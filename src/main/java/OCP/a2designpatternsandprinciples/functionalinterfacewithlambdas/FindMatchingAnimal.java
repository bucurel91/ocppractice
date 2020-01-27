package OCP.a2designpatternsandprinciples.functionalinterfacewithlambdas;

public class FindMatchingAnimal {

    private static void print(Animal animal, CheckTrait<Animal> checkTrait){
        if (checkTrait.test(animal))
            System.out.println(animal);

    }

    public static void main(String[] args) {

        print(new Animal("fish", false, true), (Animal a) -> {String b = ""; return a.canHop();});
        print(new Animal("kangoroo", true, true), a -> a.canHop());
    }
}
