package Heranca_Polimorfismo.Exemplo1.application;

import Heranca_Polimorfismo.Exemplo1.entities.account;
import Heranca_Polimorfismo.Exemplo1.entities.businessAccount;
import Heranca_Polimorfismo.Exemplo1.entities.savingsAccount;

public class program {
    public static void main(String[] args) {

        account acc = new account(1001, "Alex", 0.0);
        businessAccount bacc = new businessAccount(1002, "Gustavo", 0.0, 500.00);

        //Upcasting
            //Nesse caso é atribuir o businnesAccount para uma classe account
            //bussinessAccount também é uma account (relação É-UM)
        account acc1 = bacc;
        account acc2 = new businessAccount(1003, "Diogo", 0.0, 200.00);
        account acc3 = new savingsAccount(1004, "José", 0.0, 0.01);

        //Downcasting
            //Converter da superclasse para a subclasse.
        businessAccount acc4 = (businessAccount) acc2;
        acc4.loan(100.0);

            //só vai dar erro no executar.
            //businessAccount não é um savingsAccount
//        businessAccount acc5 = (businessAccount) acc3;
        if (acc3 instanceof businessAccount) {
            businessAccount acc5 = (businessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }
        if (acc3 instanceof savingsAccount) {
            savingsAccount acc5 = (savingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        //Utilizando a taxa de 5.0
        account acc6 = new account(1006, "Hilda", 1000.00);
        acc6.withdraw(100.00);
        System.out.println("Acc6 withdraw-account(100): "+ acc6.getBalance());

        //Sem retirar a taxa de 5.0
        account acc7 = new savingsAccount(1007, "Matheus", 1000.00, 0.5);
        acc7.withdraw(100.00);
        System.out.println("Acc7 withdraw-savingsAccount(100): "+ acc7.getBalance());

        //Utilizando o super
        account acc8 = new businessAccount(1008, "Bob", 1000.00, 500.00);
        acc8.withdraw(200.00);
        System.out.println(acc8.getBalance());
    }
}
