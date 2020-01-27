package patterns.FactoryPattern;

public class TestFactory {

    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.getAnimal("dog");
        dog.eat();
        Animal cat = factory.getAnimal("cat");
        cat.eat();
        Animal rabbit = factory.getAnimal("rabbit");
        rabbit.eat();
    }
}
