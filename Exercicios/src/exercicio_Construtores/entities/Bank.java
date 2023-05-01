package exercicio_Construtores.entities;

public class Bank {

    public int conta;

    public String nome;
    public double deposito;
    public String depositInitial;

    public Bank(int conta, String nome, double deposito) {
        this.conta = conta;
        this.nome = nome;
        this.deposito = deposito;
    }

}