package Lista9.Ex1;

public class Modelo1 extends TV implements ControleRemoto  {
    private String modelo = "Modelo 1";


    public Modelo1(boolean ligada, int voltagem, int tamanho) {
        super(ligada, voltagem, tamanho);
    }

    @Override
    public void mudarCanal(int canal) {

    }

    @Override
    public void aumentarVolume(int taxa) {

    }

    @Override
    public void diminuirVolume(int taxa) {

    }

    @Override
    public void ligar() {
        setLigada(true);
        System.out.printf("\nTV1 - modelo %s está ligado.", modelo);
    }

    @Override
    public void desligar() {
        setLigada(false);
        System.out.printf("\nDesligando  a TV modelo %s.", modelo);
    }
}
