package edu.knoldus;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Operations {

    /**
     * Get All Days Of birthday form my Birthdate to Current date.
     */
    public static List<String> birthdayDayOfWeek() {


        LocalDate firstBirthday = LocalDate.parse("1994-08-15");
        LocalDate lastBirthdayTillDate = LocalDate.now();

        int totalNumberOfBirthDate = Period.between(firstBirthday, lastBirthdayTillDate).getDays();

        List<LocalDate> listOfDays = new ArrayList<>(totalNumberOfBirthDate);
        while (firstBirthday.getYear() <= lastBirthdayTillDate.getYear()) {
            listOfDays.add(firstBirthday);
            firstBirthday = firstBirthday.plusYears(1);
        }
        return listOfDays.stream().map(daysOfBirth -> daysOfBirth.getDayOfWeek().toString())
                .collect(Collectors.toList());
    }

    /**
     * Get TimeZone in Particular UTC format.
     */

    public static ZonedDateTime getTimeZone(String timeZone) {
        ZoneId europeBerlin = ZoneId.of(timeZone);
        ZonedDateTime europeBerlinTimeZone = ZonedDateTime.now(europeBerlin);
        return europeBerlinTimeZone;
    }

    /**
     * Get Duration Of mahatma gandhi life in Seconds.
     */

    public static Long mahatmaGandhiLived() {
        LocalDateTime birthDate = LocalDateTime.of(1869, 10, 02, 7, 8, 12);
        LocalDateTime deathDate = LocalDateTime.of(1948, 1, 30, 12, 00, 00);
        LocalDateTime tempDateTime = LocalDateTime.from(birthDate);
        long lifeInSeconds = tempDateTime.until(deathDate, ChronoUnit.SECONDS);
        return lifeInSeconds;
    }

    /**
     * Find List of All Leap Years from 1991 to Current year.
     */
    public List<Integer> findLeapYear() {

        LocalDate startingYear = LocalDate.ofYearDay(1991,15);
        LocalDate currentYear = LocalDate.now();
        List<LocalDate> listOfAllLeapYears = new ArrayList<>();
        for (int year = startingYear.getYear(); year < currentYear.getYear(); year++) {
            if (startingYear.isLeapYear()) {
                listOfAllLeapYears.add(startingYear);
            }
            startingYear = startingYear.plusYears(1);
        }
        return listOfAllLeapYears.stream().map(LocalDate::getYear).collect(Collectors.toList());
    }
}