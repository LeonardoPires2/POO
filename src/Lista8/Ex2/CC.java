package Lista8.Ex2;

public class CC extends Conta {
    private double limite = 500;

    public CC(String numero, String nomeTitular, double saldo) {
        super(numero, nomeTitular, saldo);
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void sacarDinheiro(double valor) {
        double saldoInicial = getSaldo();
        double valorDisponivel = saldoInicial + limite;

        if (saldoInicial < 0) {
            valorDisponivel = limite;
        }
        if (valor <= valorDisponivel) {
            valorDisponivel -= valor;
            setSaldo(saldoInicial -= valor);
            if (saldoInicial < 0) {
                limite = valorDisponivel;
            }
            if (valorDisponivel != limite && getSaldo() < 0) {
                double valorExcedido = Math.abs(getSaldo());
                limite -= valorExcedido;
            }
            System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
        } else {
            System.out.println("Operação não realizada.Saldo insuficiente na conta corrente");
        }
        exibirInfo();
    }

    @Override
    public void depositarDinheiro(double valor) {
        super.depositarDinheiro(valor);
        if (getSaldo() < 0) {
            limite += valor;
        }
        exibirInfo();

    }

    public void exibirInfo() {
        System.out.println("FuncionarioHorista{" + "Titular = " + getNomeTitular() + ", Saldo = " + getSaldo() + "(Limite " + limite + ")");
    }

    @Override
    public String toString() {
        return "FuncionarioHorista{" + "Titular = " + getNomeTitular() + ", Saldo = " + getSaldo() + "(Limite " + limite + ")";
    }
}
