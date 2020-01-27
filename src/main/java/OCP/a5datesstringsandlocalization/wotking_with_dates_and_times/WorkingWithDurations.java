package OCP.a5datesstringsandlocalization.wotking_with_dates_and_times;

import OCP.a3genericsandcollections.comparatorcomparable.Duck;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class WorkingWithDurations {

    public static void main(String[] args) {

        Duration daily = Duration.ofDays(1);
        Duration hourly = Duration.ofHours(1);
        Duration everyMinute = Duration.ofMinutes(1);
        Duration everyTenSeconds = Duration.ofSeconds(10);
        Duration everyMili = Duration.ofMillis(1);
        Duration everyNano = Duration.ofNanos(1);

        Duration daily1 = Duration.of(1, ChronoUnit.DAYS); // la fel sunt si alte constante ChronoUnit - seconds,hours, minutes si asa mai departe

    }
}
