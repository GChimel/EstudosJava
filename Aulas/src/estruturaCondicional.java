import java.util.Scanner;
public class estruturaCondicional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valor1, valor2;

        valor1 = sc.nextInt();
        valor2 = sc.nextShort();

        if (valor1 > valor2) {
            System.out.println("O valor 1 ganhou!");
        }
        if (valor1 < valor2) {
            System.out.println("O valor 2 perdeu!");
        }

    }
}
