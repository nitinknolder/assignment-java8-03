package edu.knoldus;

import org.junit.BeforeClass;
import org.junit.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;

public class TestingDateTime {


    private static Operations operationObject;

    @BeforeClass
    public static void Configurations() {
        operationObject = new Operations();
    }

    @Test
    public final void birthdayDayOfWeek() {
        List<String> expectedOutput = Arrays.asList("MONDAY", "TUESDAY", "THURSDAY",
                "FRIDAY", "SATURDAY", "SUNDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
                "FRIDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "FRIDAY", "SATURDAY", "SUNDAY", "MONDAY",
                "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "MONDAY", "TUESDAY", "WEDNESDAY");

        assertEquals("All weeks of my birth dates",
                expectedOutput, operationObject.birthdayDayOfWeek());
    }


    @Test
    public final void getTimeZone() {
        ZoneId europeBerlin = ZoneId.of("Europe/Berlin");
        String expected = ZonedDateTime.now(europeBerlin).toString().substring(0, 13);
        assertEquals("TimeZone for Europe/Berlin", expected, operationObject.getTimeZone("Europe/Berlin").toString().substring(0, 13));
    }


    @Test
    public final void mahatmaGandhiLived() {
        Long expectedLifeDuration = 2471748708L;
        assertEquals("BirthDate Of Mahatma Gandhi", expectedLifeDuration, operationObject.mahatmaGandhiLived());
    }

    @Test
    public final void findLeapYear() {
        List<Integer> expectedYears = Arrays.asList(1992, 1996, 2000, 2004, 2008, 2012, 2016);
        assertEquals("All Leap Years After 1991", expectedYears, operationObject.findLeapYear());

    }
}



