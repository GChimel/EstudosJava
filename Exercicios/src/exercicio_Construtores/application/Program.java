package exercicio_Construtores.application;
import exercicio_Construtores.entities.Bank;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int conta = sc.nextInt();

        System.out.println("Enter account holder: ");
        String nome = sc.nextLine();

//        System.out.println("Is there na initial deposit (y/n)? ");
//        String depositInitial = sc.nextLine();

        System.out.println("Enter initial deposit value: ");
        double deposito = sc.nextDouble();

        Bank account = new Bank(conta, nome, deposito);

        System.out.println("Account data: \n");

        System.out.printf("Account %d, Holder: %s Balance: $%.2f", account.conta, account.nome, account.deposito);


        sc.close();
    }
}