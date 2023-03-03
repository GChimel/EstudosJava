package CursoUdemy;
import java.util.Locale;
import java.util.Scanner;

// Código para converter Graus Celcius em Fahrenheit
public class ExerciciosDoWhile1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double temperatura, fahrenheit;
        char repitir;

        do {
            System.out.print("Digite a temperatura em Celsius: ");
            temperatura = sc.nextDouble();

            fahrenheit = (temperatura * 1.8) + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f\n", fahrenheit);

            System.out.print("Deseja repetir(s/n)? ");
            repitir = sc.next().charAt(0);

        } while (repitir != 'n');

        sc.close();
    }
}
