package OCPPractice.eDatesStringsLocalization;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DatesTimes {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        LocalDate date = LocalDate.of(2013, Month.FEBRUARY, 13);
        System.out.println(date);

        Period period = Period.of(1,2,3);
        System.out.println(period);
        System.out.println(Period.ofMonths(1));

        LocalDate date1 = LocalDate.of(2016, Month.MARCH, 13);
        LocalTime time = LocalTime.of(1, 30);

//        Set<String> ids = ZoneId.getAvailableZoneIds();
//        for (String id : ids ) {
//            System.out.println(id);
//        }

        ZoneId id1 = ZoneId.of("Europe/Chisinau");
        ZonedDateTime zd = ZonedDateTime.of(date, time, id1);
        System.out.println(zd);

        Period p = Period.ofDays(1).ofYears(2);

        System.out.println(p);

    }
}
