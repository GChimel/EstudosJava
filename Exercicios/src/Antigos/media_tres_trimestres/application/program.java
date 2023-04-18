package Antigos.media_tres_trimestres.application;

import Antigos.media_tres_trimestres.entities.student;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        student student = new student();

        System.out.print("Digite o nome do aluno: ");
        student.aluno = sc.nextLine();

        System.out.print("Primeira nota: ");
        student.nota1 = sc.nextDouble();

        System.out.print("Segunda nota: ");
        student.nota2 = sc.nextDouble();

        System.out.print("Terceira nota: ");
        student.nota3 = sc.nextDouble();

        System.out.print("Nota final: " + student.nota_total());
        sc.close();
    }
}
