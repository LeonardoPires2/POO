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
        double saldo = getSaldo();

        if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
            return;
        } else if (valor > valorDisponivel) {
            System.out.printf("Saldo e limite insuficientes. Saldo disponível: R$ %.2f\n", valorDisponivel);
            return;
        }

        setSaldo(saldo -= valor);
        if (getSaldo() < 0) {
            double valorExcedido = Math.abs(getSaldo());
            limite -= valorExcedido;
            System.out.printf("Limite ajustado para R$ %.2f\n", limite);
        }

        System.out.printf("Saque de R$ %.2f realizado com sucesso.\n", valor);
        exibirInfo();
    }

    @Override
    public void depositarDinheiro(double valor) {
        super.depositarDinheiro(valor);
        exibirInfo();

    }

    public void exibirInfo() {
        System.out.println("Conta{" + "Titular = " + getNomeTitular() + ", Saldo = " + getSaldo() + "(Limite " + limite + ")");
    }

    @Override
    public String toString() {
        return "Conta{" + "Titular = " + getNomeTitular() + ", Saldo = " + getSaldo() + "(Limite " + limite + ")";
    }
}
