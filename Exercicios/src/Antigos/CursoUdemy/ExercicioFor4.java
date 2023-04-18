package Antigos.CursoUdemy;

import java.util.Scanner;

public class ExercicioFor4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de operações: ");
        int n = sc.nextInt();

        for (int i=0; i<=n; i++) {
            System.out.println("Informe o dividendo: ");
            int val1 = sc.nextInt();
            System.out.println("Informe o divisor: ");
            int val2 = sc.nextInt();

            if (val2 == 0) {
                System.out.println("Divisão impossível!");
            }
            else {
                double div = (double) val1 / val2;
                System.out.println("Resultado = " + div);
            }
        }
        sc.close();
    }
}
