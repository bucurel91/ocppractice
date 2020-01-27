package OCA.dateandtime;


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2019, 2, 6);
        System.out.println(date);

        LocalDate date1 = LocalDate.of(2019, Month.FEBRUARY, 6);
        System.out.println(date1);

        LocalDate date2 = LocalDate.parse("2019-02-06");
        System.out.println(date2);

        LocalDate d = LocalDate.of(2019, 10, 4);
        LocalDate d1 = LocalDate.of(2019, 10, 6);

        Period period = Period.between(d, d1);
        System.out.println(period);

        DateTimeFormatter form = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date3 = LocalDate.parse("2057-01-29",form);
        System.out.println(date3);


    }
}
