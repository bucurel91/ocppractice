package OCP.a5datesstringsandlocalization.wotking_with_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;


public class CreatingDateTimes {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        LocalDate date1 = LocalDate.of(2020, Month.JANUARY, 13);
        LocalTime time1 = LocalTime.of(23, 59, 30, 200);

        LocalDateTime dateTime1 = LocalDateTime.of(2020, 1, 13, 12, 57);
        LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);

        ZoneId zone = ZoneId.of("US/Eastern");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime1, zone);
        System.out.println(zonedDateTime);

        System.out.println(ZoneId.systemDefault());

        ZoneId.getAvailableZoneIds().stream().filter(z -> z.contains("Europe")).sorted().forEach(System.out:: print);

        ArrayList<String > list = new ArrayList<>();
        list.clear();

    }
}
