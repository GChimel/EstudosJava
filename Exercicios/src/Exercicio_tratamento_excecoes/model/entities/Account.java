package Exercicio_tratamento_excecoes.model.entities;

import Exercicio_tratamento_excecoes.model.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withdraw(Double amount) throws DomainException {

        //Se o saldo for menor que a retirada será exibida essa mensagem de erro:
        if (balance < amount) {
            throw new DomainException("No enough balance");
        }
        //Se a retirada foi maior que o limite será exibida essa mensagem de erro:
        if (amount > withdrawLimit) {
            throw new DomainException("The amount execeeds withdraw limit");
        }
        balance -= amount;
    }
}