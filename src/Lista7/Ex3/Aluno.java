package Lista7.Ex3;

public class Aluno {
    private int matricula;
    private String nome;
    private double nota1;
    private double nota2;

    public Aluno(int matricula, String nome, double nota1, double nota2) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean estaAprovado() {
        return calcularMedia() >= 7.0;
    }

    public double quantoPrecisa() {
        return (50.0 - calcularMedia() * 6) / 4;
    }
}
