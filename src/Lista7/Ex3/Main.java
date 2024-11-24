package Lista7.Ex3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de matrícula: ");
        int matricula = scanner.nextInt();

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.next();

        System.out.print("Digite a primeira nota:");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        Aluno aluno = new Aluno(matricula, nome, nota1, nota2);

        System.out.println("Média: " + aluno.calcularMedia());

        if (aluno.estaAprovado()) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado. Precisa tirar " + aluno.quantoPrecisa() + " para passar.");
        }
    }
}