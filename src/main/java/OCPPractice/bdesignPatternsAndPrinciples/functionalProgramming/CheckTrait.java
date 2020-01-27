package OCPPractice.bdesignPatternsAndPrinciples.functionalProgramming;

@FunctionalInterface
public interface CheckTrait {

    boolean test(Animal animal);

    default void parint(){
        System.out.println("ceva");
    }

}
