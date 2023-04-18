package Antigos.CursoUdemy;

import java.util.Locale;
import java.util.Scanner;
public class horasTrabalhadas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int funcionario, hora;
        double valorHora, salario;

        funcionario = sc.nextInt();
        hora = sc.nextInt();
        valorHora = sc.nextDouble();

        salario = hora * valorHora;

        System.out.printf( "NUMBER = %d\nSALARY = %.2f", funcionario, salario);

        sc.close();
    }
}
