package Lista9.Ex2;

public class Quadrado extends Quadrilatero {


    public Quadrado(double lado1) {
        super(lado1, lado1, lado1, lado1);
    }

    @Override
    public double calculaArea() {
        System.out.print("Area do quadrado: " + lado1 * lado1 + "\n");
        return lado1 * lado1;
    }

    @Override
    public double calcularPerimetro() {
        System.out.print("Perimetro do quadrado: " + 4 * lado1 +"\n");
        return 4 * lado1;
    }
}
