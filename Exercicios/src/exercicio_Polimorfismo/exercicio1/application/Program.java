package exercicio_Polimorfismo.exercicio1.application;

import exercicio_Polimorfismo.exercicio1.entities.Employee;
import exercicio_Polimorfismo.exercicio1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the number of employess: ");
        int employees = sc.nextInt();

        ArrayList<Employee>  list = new ArrayList<>();

        for (int i = 0; i < employees; i++) {
            System.out.print("Employee #" + (i + 1) + " data: \n");
            System.out.print("Outsourced (y/n)?");
            Character outsourced = sc.next().charAt(0);
            switch (outsourced) {
                case 'y':
                    System.out.print("Name: ");
                    String name = sc.next();
                    System.out.print("Hours: ");
                    int hours = sc.nextInt();
                    System.out.print("Value per hour: ");
                    double valuePerHour = sc.nextDouble();
                    System.out.print("Additional charge: ");
                    double additionalCharge = sc.nextDouble();

                    list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));

                    break;
                case 'n':
                     System.out.print("Name: ");
                     String nameEmployee = sc.next();
                     System.out.print("Hours: ");
                     int hoursEmployee = sc.nextInt();
                     System.out.print("Value per hour: ");
                     double valuePerHourEmployee = sc.nextDouble();

                     list.add(new Employee(nameEmployee, hoursEmployee, valuePerHourEmployee));

                     break;
                default:
                    System.out.println("Please try again!");
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        sc.close();
    }
}