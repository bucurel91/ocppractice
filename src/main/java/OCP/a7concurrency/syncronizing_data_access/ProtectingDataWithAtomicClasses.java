package OCP.a7concurrency.syncronizing_data_access;


        /*

        Atomic Operations - un set de clase similare cu cele obisnuite care extind clasa Number, doar ca ele au un set de metode
        care executa operatii atomice. Ele sunt destinate pentru a face operatii in siguranta in caz ca se ruleaza mai multe thredur odata,
        deoarece este riscul ca 2 threaduri spre exemplu sa execute unu si acelasi task si sa fie un rezultat necorespunzator.

        AtomicBoolean

        AtomicInteger

        AtomicIntegerArray - un array de int care poate fi updatat atomical.

        AtomicLong

        AtomicReference -

        AtomicReferenceArray - un array cu referinte generice a obiectelor.
         */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class ProtectingDataWithAtomicClasses {



         private AtomicInteger sheepCoount = new AtomicInteger(0);

        private  void  incrementAndReport(){
            System.out.println(sheepCoount.incrementAndGet());
        }

        public static void main(String[] args) {

            ExecutorService service = null;

            try{

                ProtectingDataWithAtomicClasses manager = new ProtectingDataWithAtomicClasses();
                service = Executors.newFixedThreadPool(20);

                for (int i = 0; i < 10; i++) {
                    service.submit(manager::incrementAndReport);
                }

            }finally {
                if(service != null) service.shutdown();
            }

        }




}
