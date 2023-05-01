package modulosAntigos;

import java.util.Scanner;
import java.util.Locale;

public class entradaDeDados {
    private static double f;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        int a;
        a = sc.nextInt();
        System.out.println("Você digitou o número:" + a);

        Locale.setDefault(Locale.US);
        double b;
        b = sc.nextDouble();
        System.out.printf("Você tem R$ %.2f\n", b);

        char c;
        c = sc.next().charAt(0);
        System.out.println("O primeiro caractere é:" + c);


        String d;
        int e;
        double f;

        d = sc.next();
        e = sc.nextInt();
        f = sc.nextDouble();

        System.out.printf("sua string é: %s | seu número é: %d | seu double é: %f", d, e, f);

        sc.close();
    }
}
