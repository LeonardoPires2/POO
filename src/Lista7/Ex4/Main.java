package Lista7.Ex4;

public class Main {
    public static void main(String[] args) {
        Proprietario proprietario1 = new Proprietario("João Silva", "Rua A, 123", 'M', "12345678901", "ABC1234");
        Proprietario proprietario2 = new Proprietario("Maria Santos", "Rua B, 456", 'F', "98765432109", "DEF5678");

        Veiculo veiculo1 = new Veiculo("AAA1B23", "Prata", "Gol", proprietario1);
        Veiculo veiculo2 = new Veiculo("BBB2C34", "Preto", "Corolla", proprietario1);
        Veiculo veiculo3 = new Veiculo("CCC3D45", "Vermelho", "Civic", proprietario2);
        Veiculo veiculo4 = new Veiculo("DDD4E56", "Azul", "Onix", proprietario2);
        Veiculo veiculo5 = new Veiculo("EEE5F67", "Branco", "HB20", proprietario1);

        veiculo1.mostrarDados();
        veiculo2.mostrarDados();
        veiculo3.mostrarDados();
        veiculo4.mostrarDados();
        veiculo5.mostrarDados();
    }
}