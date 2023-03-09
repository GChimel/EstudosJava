package Largura_Altura_Retangulo.application;

import Largura_Altura_Retangulo.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rectangle width and height: ");
        Rectangle rectangle = new Rectangle();

        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.printf("AREA = %.2f\n", rectangle.Area());
        System.out.printf("PERIMETER = %.2f\n",rectangle.Perimeter());
        System.out.printf("DIAGONAL = %.2f\n", rectangle.Diagonal());

    }
}
