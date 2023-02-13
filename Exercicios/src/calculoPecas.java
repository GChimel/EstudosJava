import java.util.Scanner;
import java.util.Locale;

public class calculoPecas {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//  p1 = peça1 | np1 = número de peças | vp1 = Valor da peça

        int p1, np1, p2, np2, pecas;
        double vp1, vp2, calc, produtos1, produtos2;

        System.out.print("Digite o código do produto1:");
        p1 = sc.nextInt();
        System.out.print("Digite a quantidade do produto1:");
        np1 = sc.nextInt();
        System.out.print("Digite o valor do produto1:");
        vp1 = sc.nextDouble();

        System.out.print("Digite o código do produto2:");
        p2 = sc.nextInt();
        System.out.print("Digite a quantidade do produto2:");
        np2 = sc.nextInt();
        System.out.print("Digite o valor do produto2:");
        vp2 = sc.nextDouble();

        pecas = p1 + p2;
        produtos1 = np1 * vp1;
        produtos2 = np2 * vp2;

        calc = produtos1 + produtos2;

        System.out.println("TOTAL DE PEÇAS:"+ pecas);
        System.out.printf("VALOR A PAGAR: R$%.2f", calc);

        sc.close();
    }
}
