import java.util.Scanner;

public class diaDaSemanaIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String dia;

        if (x == 1) {
            dia = "Domingo";
        } else if (x == 2) {
            dia = "Segunda-Feira";
        } else if (x == 3) {
            dia = "Terça-Feira";
        } else if (x == 4) {
            dia = "Quarta-Feira";
        } else if (x == 5) {
            dia = "Quinta-Feira";
        } else if (x == 6) {
            dia = "Sexta-Feira";
        } else if (x == 7) {
            dia = "Sábado";
        } else {
            dia = "Valor inválido";
        }

        System.out.println("Dia da semana: " + dia);

        sc.close();
    }
}
