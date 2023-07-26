package exercicio_Polimorfismo.exercicio1.entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;
    public OutsourcedEmployee() {
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {

        //Valor da hora
        double total = (valuePerHour * hours);

        double percent = additionalCharge * 1.1;
        return ((total * percent) + total);
    }
}