package Heranca_Polimorfismo.Exemplo1.entities;

public class savingsAccount extends account{

    private Double interestRate;

    public savingsAccount() {
        super();
    }

    public savingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    //No tax
    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
