package edu.knoldus;

public class DateApplication {

    public static void main(String []args) {
        Operations dateObject = new Operations();

        System.out.println("<---- My Birthday Days Till Date Are ---->");
        System.out.println(dateObject.birthdayDayOfWeek());

        System.out.println("<---- TimeZone Are ---->");

        System.out.println(dateObject.getTimeZone("Europe/Berlin"));

        System.out.println("<---- Mahatma Gandhi Life In Seconds ---->");
        System.out.println(dateObject.mahatmaGandhiLived());

        System.out.println("<---- Leap Year From 1991 to 2018 are ---->");
        dateObject.findLeapyear().forEach(System.out::println);
    }
}
