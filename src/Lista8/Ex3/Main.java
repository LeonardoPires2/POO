package Lista8.Ex3;

public class Main {
    public static void main(String[] args) {

       CFuncionario funcionarioHorista = new FuncionarioHorista("LEO", "2332332322", 75.00);
       CFuncionario funcionarioCLT = new FuncionarioCLT("LEO", "2332332322", 3500.0);
       funcionarioCLT.calculaRendimento();
       funcionarioHorista.calculaRendimento();
    }
}