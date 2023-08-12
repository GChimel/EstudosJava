package exercicio_tratamento_excecoes.application;

import exercicio_tratamento_excecoes.model.entities.Account;
import exercicio_tratamento_excecoes.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int accountNumber = sc.nextInt();
            //NextLine para consumir o ENTER do NextINT
            sc.nextLine();
            System.out.print("Holder: ");
            String accountHolder = sc.nextLine();
            System.out.print("Initial balance: ");
            double initialBalance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            System.out.println("");
            System.out.print("Enter amount of withdraw: ");
            double withdrawValue = sc.nextDouble();

            Account account = new Account(accountNumber, accountHolder, initialBalance, withdrawLimit);
            account.withdraw(withdrawValue);

            System.out.printf("New balance: %.2f%n", account.getBalance());
        }
        //Tratamento do erro.
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
