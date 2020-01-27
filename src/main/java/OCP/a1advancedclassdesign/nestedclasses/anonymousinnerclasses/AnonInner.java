package OCP.a1advancedclassdesign.nestedclasses.anonymousinnerclasses;


/*
Clasele anonime - este o clasa interna locala care nu are nume.
    Este declarata si instantiata toata intr-o afirmatie (statement)
    prin operatorul new.
  Ele sunt necesare pentru a extinte o clasa existenta sau sa implimenteze o clasa existenta.
  Ele sunt folosite la implimentare scurta unde nu va mai fi folosita nicaieri in alta parte.

 */
public class AnonInner {

    abstract class SaleToday{

        abstract  int dolarsOff();
    }

    public  int admission (int basePrace){

        SaleToday  saleTodayOnly = new SaleToday(){

            @Override
            int dolarsOff() {

                return 3;
            }
        };

        return basePrace - saleTodayOnly.dolarsOff();
    }

    interface SalyTodayOnly{

        int anotherDolarsOff();
    }

    public int anotherAdmission(int basePrice){

        SalyTodayOnly sale = new SalyTodayOnly() {
            @Override
            public int anotherDolarsOff() {
                return 3;
            }
        };

        return basePrice - sale.anotherDolarsOff();
    }
}
