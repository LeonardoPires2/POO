package Lista7.Ex1;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite o valor do ladoDoQuadrado do quadrado: ");
        double ladoDoQuadrado = scanner.nextDouble();

        Quadrado quadrado = new Quadrado();
        quadrado.setLadoDoQuadrado(ladoDoQuadrado);

        System.out.println("Eletrodomestico: " + quadrado.getLadoDoQuadrado());
        System.out.println("Área: " + quadrado.getAreaQuadrado() + " cm²");
        System.out.println("Perímetro: " + quadrado.getPerimetroQuadrado() + " cm");
        System.out.println("Diagonal: " + quadrado.getDiagonalQuadrado() + " cm");
    }
}