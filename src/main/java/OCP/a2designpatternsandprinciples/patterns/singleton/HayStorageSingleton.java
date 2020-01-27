package OCP.a2designpatternsandprinciples.patterns.singleton;

public class HayStorageSingleton {

    private int quatity = 0;
    private HayStorageSingleton(){}

    private static  HayStorageSingleton insance;


    // lazy instatiation - cind prima data se apleaza obiectul singleton, se produce un delay, dupa care la celelalte apeluri totul merge ok
    public static HayStorageSingleton getInstance(){
        if(insance == null)
          insance = new HayStorageSingleton();
        return insance;
    }

    public synchronized void addHay(int amount){
        quatity += amount;
    }

    public synchronized boolean removeHay(int amount){
        if(quatity < amount) return false;
        quatity -= amount;
        return true;
    }

    public synchronized int getHayQuantity(){
        return quatity;
    }
}
