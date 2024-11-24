package Lista9.Ex2;

public class Retangulo extends Quadrilatero {
    public Retangulo(double base, double altura) {
        super(base, altura, base, altura);
    }

    @Override
    public double calculaArea() {
        System.out.print("Area do retangulo: " + lado1 * lado2 +"\n");
        return lado1 * lado2;
    }

    @Override
    public double calcularPerimetro() {
        System.out.print("Perimetro do retangulo: " + 2 * (getLado1() + getLado2()) +"\n");
        return 2 * getLado1() + getLado2();
    }
}
