package vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetores {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int qtdVetores = sc.nextInt();

        double vetores[] = new double[qtdVetores];

        for (int i=0; i<qtdVetores; i++ ) {
            vetores[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i=0; i<qtdVetores; i++) {
            soma += vetores[i];
        }
        double media = soma / qtdVetores;
//
        System.out.printf("AVERAGE HEIGHT: %.2f", media);

        sc.close();
    }
}
