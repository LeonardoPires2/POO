package Lista8.Ex3;

public class FuncionarioHorista extends CFuncionario {
    private double salarioHora;
    private int horasTrabalhadas = 40;

    public FuncionarioHorista(String nome, String cpf, double salarioHora) {
        super(nome, cpf);
        this.salarioHora = salarioHora;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(double salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calculaRendimento() {
        System.out.println("\nDados Eletrodomestico Horista:");
        System.out.println("Nome:" + getNome());
        System.out.println("Cpf:" + getCpf());
        System.out.println("Rendimento Mensal: " + salarioHora * horasTrabalhadas);
    }
}
