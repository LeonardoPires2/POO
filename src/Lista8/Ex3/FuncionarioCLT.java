package Lista8.Ex3;

public class FuncionarioCLT extends CFuncionario {
    private double salario;

    public FuncionarioCLT(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void calculaRendimento() {
        System.out.println("\nDados Eletrodomestico CLT:");
        System.out.println("Nome:" + getNome());
        System.out.println("Cpf:" + getCpf());
        System.out.println("Rendimento Mensal: " + this.salario);
    }
}
