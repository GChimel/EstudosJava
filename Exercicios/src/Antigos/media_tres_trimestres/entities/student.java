package Antigos.media_tres_trimestres.entities;

public class student {
    public String aluno;
    public double nota1;
    public double nota2;
    public double nota3;

    public double nota_total() {
        return nota1 + nota2 + nota3;
    }

}
