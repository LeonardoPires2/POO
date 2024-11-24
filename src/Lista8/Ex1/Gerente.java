package Lista8.Ex1;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String departamento, String nome, String cpf, double salario) {
        super(nome, cpf, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public double getSalario() {
        double salarioGerente = 20 * super.getSalario() / 100;
        return salarioGerente + super.getSalario();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + "\n" +
                "Cpf: " + getCpf() + "\n" +
                "Salario: " + getSalario() + "\n";
    }


}