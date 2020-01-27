package OCP.a2designpatternsandprinciples.patterns.singleton;

public class LamaTrainer {

    public boolean feedLamas(int numberOfLamas){
        int amountNeeded = 5 * numberOfLamas;
        HayStorageSingleton hayStorageSingleton = HayStorageSingleton.getInstance();
        if(hayStorageSingleton.getHayQuantity() < amountNeeded)
            hayStorageSingleton.addHay(amountNeeded + 10);

        boolean fed = hayStorageSingleton.removeHay(amountNeeded);
        if (fed)
            System.out.println("Lamas have been fed");

            return fed;

    }
}
