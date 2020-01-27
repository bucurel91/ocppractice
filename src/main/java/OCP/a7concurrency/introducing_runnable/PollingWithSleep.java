package OCP.a7concurrency.introducing_runnable;

public class PollingWithSleep {

    /*

    Polling - este procesul periodic de verificare a datelor la un interval fix de timp.

    Spre exemplu = avem un thread care modifica o valoare statica transmisibila si threadul metodei main() asteapta (waiting)
    ca threadul sa mareasca valoarea mai mare de 100, ca in exemplul de mai jos :
     */

    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                PollingWithSleep.counter++;
            }
        }).start();

        while (PollingWithSleep.counter < 100) {
            System.out.println("Not reached yet");  //spre exemplu counter e 5 in while, astel va ajunde la sleep si timp de aceasta secunda cit
            //threadul la metoda main va sta in sleep o secunda, thredul declarat de noi va reusi sa incrimenteze conteru din for.
            Thread.sleep(1000);
        }
        System.out.println("Reached");

    }

    // De cite ori se va printa "Not reached yet" din blocu while? NU STIM! Deoarece while se executa in threadul metodei main()
    // iar Threadul creat de noi se executa aparte, iar ambele threaduri proceseaza aceiasi valoare statica, astfel while din main poate sa apeleze valoarea statica
    // spre exemplu cind aceasta abia a ajuns la 50 si so mai apeleze apoi la 70, astfel va printa de doua ori not reached, ceia ce nu e chiar bine
    // Pentru a rezolva problema, o solutie este de a adauga un sleep() de o secunda ca whilu sa astepte pin counter va trece de 100 si il va executa.
}
