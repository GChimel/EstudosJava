package Date_time;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;


public class exemplo3 {
    public static void main(String[] args) {

        LocalDate t1 = LocalDate.parse("2023-07-27");
        LocalDate t2 = LocalDate.parse("2023-07-21");
        Instant t3 = Instant.parse("2023-07-27T09:57:54Z");

        LocalDate semanaAnterior = t2.minusDays(7);
        LocalDate semanaPosterior = t1.plusDays(7);

        System.out.println(t1);
        System.out.println(semanaAnterior);
        System.out.println(semanaPosterior);

    }
}
