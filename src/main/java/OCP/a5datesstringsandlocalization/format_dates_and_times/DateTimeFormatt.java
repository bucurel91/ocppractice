package OCP.a5datesstringsandlocalization.format_dates_and_times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeFormatt {

    public static void main(String[] args) {


        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(date.format(DateTimeFormatter.ISO_DATE));
        System.out.println(time.format(DateTimeFormatter.ISO_TIME));
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));

        DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        System.out.println(shortDateTime.format(date));
        System.out.println(shortDateTime.format(dateTime));
        System.out.println(shortDateTime.format(time)); //exceptie, deoarece metoda statica ofLocalizedDate indica doar formatarea datei

    }
}
