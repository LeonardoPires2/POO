package Lista9.Ex1;

public abstract class TV extends Eletrodomestico {
    private int tamanho;
    private int canal;
    private int volume;


    public TV(boolean ligada, int voltagem, int tamanho) {
        super(ligada, voltagem);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
