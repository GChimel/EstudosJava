package exercicios_vetores.negativos;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? ");
        int qtd = sc.nextInt();

        int vect[] = new int[qtd];

        for (int i=0; i<vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos: ");

        for (int i=0; i<vect.length; i++){
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }
        sc.close();
    }
}
