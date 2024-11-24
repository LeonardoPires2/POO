package Lista8.Ex2;

import Lista8.Ex1.Funcionario;
import Lista8.Ex1.Gerente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       Conta conta = new CC("233323232", "titular", 1000);

        System.out.println("Estado inicial da Conta Corrente");
        System.out.println(conta);
        conta.depositarDinheiro(100);
        conta.sacarDinheiro(1000);
        conta.sacarDinheiro(750);
        conta.sacarDinheiro(350);
        conta.sacarDinheiro(100);
        conta.sacarDinheiro(150);
        conta.sacarDinheiro(50);
        conta.depositarDinheiro(100);
    }
}