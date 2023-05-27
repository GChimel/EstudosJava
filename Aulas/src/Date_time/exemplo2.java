package Date_time;

import org.w3c.dom.ls.LSOutput;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class exemplo2 {
    public static void main(String[] args) {

        LocalDate t1 = LocalDate.parse("2022-08-14");
//        Horário de londres.
        Instant t2 = Instant.parse("2023-05-27T08:33:13Z");

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd_MM_yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd~MM?yyyy");
//        Formatar para exibir qual o horário do meu computador que seria equivalente ao horário de londres LINHA15
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        System.out.println("Sem formatar: " + t1);
        System.out.println("Com formato: " + t1.format(f1));
        System.out.println("Com formato: " + t1.format(f2));
        System.out.println("Com formato: " + f3.format(t2));
    }
}
