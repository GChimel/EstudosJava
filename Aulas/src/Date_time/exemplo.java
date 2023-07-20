package Date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class exemplo {
    public static void main(String[] args) {

//      https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

//        Date
        LocalDate d01 = LocalDate.now();
//        Date + Time Local
        LocalDateTime d02 = LocalDateTime.now();
//        Date + Time UTC
        Instant d03 = Instant.now();
//        Format Text Date to ISO 8601
        LocalDate d04 = LocalDate.parse("2023-05-16");
//        Format Text Date + Time to Iso 8601
        LocalDateTime d05 = LocalDateTime.parse("2023-05-16T21:22:12");
//        Format Text Date + Time UTC
        Instant d06 = Instant.parse("2023-05-16T13:21:52Z");
//        Format Text Date + Timw with other local
        Instant d07 = Instant.parse("2023-05-16T13:21:52-03:00");
//        Custom format using line11
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
//         Custom format using hours and minuts
        LocalDateTime d09 = LocalDateTime.parse("20/01/2022 01:12",  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);

    }
}
