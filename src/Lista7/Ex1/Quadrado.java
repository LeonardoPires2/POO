package Lista7.Ex1;

public class Quadrado {
    private double ladoDoQuadrado;

    public double getLadoDoQuadrado() {
        return ladoDoQuadrado;
    }

    public void setLadoDoQuadrado(double ladoDoQuadrado) {
        this.ladoDoQuadrado = ladoDoQuadrado;
    }

    public double getAreaQuadrado() {
        return ladoDoQuadrado * ladoDoQuadrado;
    }

    public double getPerimetroQuadrado() {
        return 4 * ladoDoQuadrado;
    }

    public double getDiagonalQuadrado() {
        return ladoDoQuadrado * Math.sqrt(2);
    }
}
