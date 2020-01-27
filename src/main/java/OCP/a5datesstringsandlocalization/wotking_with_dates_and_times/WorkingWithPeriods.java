package OCP.a5datesstringsandlocalization.wotking_with_dates_and_times;

import java.time.Period;

public class WorkingWithPeriods {

    public static void main(String[] args) {

        Period annually = Period.ofYears(1);
        Period quarterlly = Period.ofMonths(3);
        Period evreyThreeWeeks = Period.ofWeeks(3);
        Period everyOtherDay = Period.ofDays(2);
        Period everyYearAndWeek = Period.of(1, 0, 7);

        System.out.println(everyYearAndWeek);

        //In cazul perioadelor nu se aplica metodele in lant ca si la manipularea LocalDate LocalTime ( metodele plusDays, plusMonths in lant)

        Period wrong = Period.ofYears(1).ofWeeks(1); //  doar ultima metoda se va aplica ofWeeks.

    }
}
