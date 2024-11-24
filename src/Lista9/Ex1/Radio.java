package Lista9.Ex1;

public class Radio extends Eletrodomestico implements ControleRemoto {
    private short AM = 1;
    private short FM = 2;
    private int banda;
    private float sintonia;
    private int volume;


    public Radio(boolean ligada, int voltagem) {
        super(ligada, voltagem);
    }

    public int getBanda() {
        return banda;
    }

    public void setBanda(int banda) {
        this.banda = banda;
    }

    public float getSintonia() {
        return sintonia;
    }

    public void setSintonia(float sintonia) {
        this.sintonia = sintonia;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
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
        setSintonia(88.10F);
        setVolume(25);
        System.out.printf("\nO rádio está ligado. Volume: %s e sintonia: %.2f ", volume, sintonia);
    }

    @Override
    public void desligar() {
        setLigada(false);
        System.out.println("\n Rádio desligado!");
    }
}
