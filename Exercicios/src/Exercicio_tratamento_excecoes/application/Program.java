package Exercicio_tratamento_excecoes.application;

import Exercicio_tratamento_excecoes.model.entities.Account;
import Exercicio_tratamento_excecoes.model.exceptions.DomainException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int accountNumber = sc.nextInt();
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

            System.out.print("New balance: " + account.getBalance());
        }
        //Tratamento do erro.
        catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
