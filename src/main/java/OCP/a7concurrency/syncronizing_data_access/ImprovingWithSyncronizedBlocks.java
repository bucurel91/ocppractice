package OCP.a7concurrency.syncronizing_data_access;



/*

    Synchronized - este  cuvintul cheie cu care noi asiguram ca un task se executa de un singur thread si nu pertmite altuia sa se implice,
    pentru a nu crea rezultate necorespunzatoare.

 */


public class ImprovingWithSyncronizedBlocks {


    static SheepManager manager =  new SheepManager();

    public static void main(String[] args) {

        synchronized (manager){

            for (int i = 0; i < 10; i++) {

            }

        }
    }
}
