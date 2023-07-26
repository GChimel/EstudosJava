package exercicio_Polimorfismo.exercicio1.application;

import exercicio_Polimorfismo.exercicio1.entities.Employee;
import exercicio_Polimorfismo.exercicio1.entities.OutsourcedEmployee;

public class Program {
    public static void main(String[] args) {

        OutsourcedEmployee teste = new OutsourcedEmployee("gustavo", 100, 15.0, 200.00);

        System.out.println(teste.payment());

    }
}
