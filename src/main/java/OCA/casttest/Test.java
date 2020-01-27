package OCA.casttest;

public class Test {

    Animal animal = new Animal();
  static Animal cat =  (Animal) new Cat();

    public static void main(String...args) {

        ((Cat)cat).meow();
        cat.eat();
    }
}
