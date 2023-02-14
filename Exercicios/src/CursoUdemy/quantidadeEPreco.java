package CursoUdemy;

import java.util.Scanner;
import java.util.Locale;
public class quantidadeEPreco {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int codigo, quantidade;
        double total;

        System.out.print("Digite o código do produto: ");
        codigo = sc.nextInt();
        System.out.print("Digite a quantidade do produto: ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            String produto = "cachorro quente";
            double preco = 4.00;
            total = quantidade * preco;
            System.out.printf("%d %s fica no total: R$ %.2f", quantidade, produto, total);
        }
        else if (codigo == 2) {
            String produto = "x-salada";
            double preco = 4.50;
            total = quantidade * preco;
            System.out.printf("%d %s fica no total: R$ %.2f", quantidade, produto, total);
        }
        else if (codigo == 3) {
            String produto = "x-bacon";
            double preco = 5.00;
            total = quantidade * preco;
            System.out.printf("%d %s fica no total: R$ %.2f", quantidade, produto, total);
        }
        else if (codigo == 4) {
            String produto = "torrada simples";
            double preco = 2.00;
            total = quantidade * preco;
            System.out.printf("%d %s fica no total: R$ %.2f", quantidade, produto, total);
        }
        else if (codigo == 5) {
            String produto = "refrigerante";
            double preco = 1.50;
            total = quantidade * preco;
            System.out.printf("%d %s fica no total: R$ %.2f", quantidade, produto, total);
        }
        else {
            System.out.println("Você precisa escolher um produto!");
        }

    }

}
