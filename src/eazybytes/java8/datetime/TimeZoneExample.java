package eazybytes.java8.datetime;

import java.time.*;
import java.time.chrono.HijrahDate;
import java.util.AbstractMap.SimpleEntry;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TimeZoneExample {
    public static void main(String[] args) {
        printAllZones();

        ZoneId india = ZoneId.of("Asia/Ho_Chi_Minh");
        ZonedDateTime indiaDateTime = ZonedDateTime.now(india);
        System.out.println("Time in Ho Chi Minh now: " + indiaDateTime);

        ZonedDateTime parisZonedDateTime = indiaDateTime.withZoneSameInstant(ZoneId.of("Australia/Melbourne"));
        System.out.println("Time in Australia now: " + parisZonedDateTime);

        ZoneOffset zoneOffset = ZoneOffset.of("+05:30");
        OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffset);
        System.out.println("Time in India now using offset: " + offsetDateTime);

        OffsetDateTime targetOffsetDateTime = offsetDateTime.withOffsetSameInstant(ZoneOffset.of("+01:00"));
        System.out.println("Time in Paris now using offset: " + targetOffsetDateTime);

        ZonedDateTime dateTime1 = ZonedDateTime.now(ZoneId.of("America/New_York"));
        OffsetDateTime dateTime2 = OffsetDateTime.now(ZoneOffset.of("-05:00"));

        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime2.toEpochSecond() - dateTime1.toEpochSecond());

        ZonedDateTime dateTimePlus1 = dateTime1.plusMonths(6);
        OffsetDateTime dateTimePlus2 = dateTime2.plusMonths(6);
        System.out.println(dateTimePlus1);
        System.out.println(dateTimePlus2);
        System.out.println(dateTimePlus2.toEpochSecond() - dateTimePlus1.toEpochSecond());

        LocalDateTime ldt = LocalDateTime.of(2000,6,16,12,30,0);
        ZonedDateTime parisDateTime = ldt.atZone(ZoneId.of("Europe/Paris"));
        System.out.println("Depart: " + parisDateTime);

        ZoneOffset asiaKolkata = ZoneOffset.of("+05:30");
        LocalDateTime dateTime = LocalDateTime.of(2014, Month.MARCH, 18, 13,45);
        OffsetDateTime dateTimeInKolkata = OffsetDateTime.of(dateTime, asiaKolkata);
        System.out.println("Given time in Kolkata : " + dateTimeInKolkata);

        HijrahDate todayIslamic = HijrahDate.now();
        System.out.println("Islamic date for today: " + todayIslamic);






    }

    private static void printAllZones() {
        LocalDateTime localDateTime = LocalDateTime.now();
        Map<String, String> result = ZoneId.getAvailableZoneIds().stream().map(ZoneId::of)
                .map(zoneId -> new SimpleEntry<>(zoneId.toString(), localDateTime.atZone(zoneId).getOffset().getId().replaceAll("Z", "+00:00")))
                .sorted(Map.Entry.<String,String>comparingByValue().reversed())
                .collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        result.forEach((k,v) -> System.out.printf(String.format("%s (%s) %n", k, v)));

        System.out.println("\n Total Zone IDs supported " + result.size());

    }
}
