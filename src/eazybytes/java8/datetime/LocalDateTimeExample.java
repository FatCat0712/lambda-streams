package eazybytes.java8.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1989,6,16);
        LocalTime time = LocalTime.of(12,30,10);
        LocalDateTime dateTime = LocalDateTime.of(1989, Month.JUNE, 16,12,30,10);

        System.out.println("The given date and time is: " + dateTime);
        LocalDateTime datetimeVal = LocalDateTime.of(date, time);

        System.out.println(datetimeVal.getYear());

        System.out.println(datetimeVal.getMonth());

        System.out.println(datetimeVal.getDayOfMonth());

        System.out.println(datetimeVal.getDayOfWeek());

        System.out.println(datetimeVal.getDayOfYear());

        System.out.println(datetimeVal.getHour());

        System.out.println(datetimeVal.getMinute());

        System.out.println(datetimeVal.getSecond());

        System.out.println(datetimeVal.getNano());

        System.out.println(datetimeVal.isAfter(dateTime));

        System.out.println(datetimeVal.isBefore(dateTime));

        System.out.println(datetimeVal.plusYears(1));

        System.out.println(datetimeVal.plusWeeks(3));

        System.out.println(datetimeVal.plusDays(2));

        System.out.println(datetimeVal.plusHours(4));

        System.out.println(datetimeVal.plusMinutes(40));

        System.out.println(datetimeVal.plusSeconds(20));

        System.out.println(datetimeVal.minusYears(1));

        System.out.println(datetimeVal.minusWeeks(3));

        System.out.println(datetimeVal.minusDays(2));

        System.out.println(datetimeVal.minusHours(4));

        System.out.println(datetimeVal.minusMinutes(40));

        System.out.println(datetimeVal.minusSeconds(20));

        LocalDate dateLocal = datetimeVal.toLocalDate();
        System.out.println("The given time value is: " + dateLocal);

        LocalTime timeLocal = datetimeVal.toLocalTime();
        System.out.println("The given date value is: " + timeLocal);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        System.out.println("The current date & time value is: " + dateTimeNow);







    }
}
