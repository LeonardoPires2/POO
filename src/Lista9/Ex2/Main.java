package Lista9.Ex2;

import Lista9.Ex1.ControleRemoto;
import Lista9.Ex1.Modelo1;
import Lista9.Ex1.Modelo2;
import Lista9.Ex1.Radio;

public class Main {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(5);
        Retangulo retangulo = new Retangulo(4.00,3.00);

        quadrado.calculaArea();
        quadrado.calcularPerimetro();
        retangulo.calculaArea();
        retangulo.calcularPerimetro();
    }
}