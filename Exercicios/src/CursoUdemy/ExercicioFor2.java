package CursoUdemy;

import java.util.Scanner;

public class ExercicioFor2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantidade de itens que serão informados: ");
        int n = sc.nextInt();
        int somain = 0;
        int somaout = 0;

        for (int i=1; i<=n; i++) {
            System.out.println("Informe um número: ");
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                somain = somain + i;
            }
            else {
                somaout = somaout + i;
            }
        }
        System.out.printf("%d in\n", somain);
        System.out.printf("%d out", somaout);

        sc.close();
    }
}
