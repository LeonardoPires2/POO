package Lista8.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario("Funcionario 1", "298489242", 3500);
        Funcionario funcionario2 = new Funcionario("Funcionario 2", "298489242", 3500);
        Funcionario gerente = new Gerente("TI", "Gerente1", "3244424", 3500);

        List<Funcionario> listaFuncionarios = new ArrayList<>();
        List<Funcionario> listaGerente = new ArrayList<>();
        listaFuncionarios.add(funcionario1);
        listaFuncionarios.add(funcionario2);
        listaGerente.add(gerente);
        System.out.println("Funcionarios");
        listaFuncionarios.forEach(System.out::println);
        System.out.println("Gerente");
        listaGerente.forEach(System.out::println);
    }
}