package Lista9.Ex1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ControleRemoto radio = new Radio(true, 13);
        ControleRemoto tv1 = new Modelo1(true, 13, 24);
        ControleRemoto tv2 = new Modelo2(true, 13, 25);
        radio.ligar();
        tv1.ligar();
        tv2.ligar();
        tv1.desligar();
        tv2.desligar();
        radio.desligar();
    }
}