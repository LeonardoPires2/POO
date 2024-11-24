package Lista8.Ex2;

public class Conta {
    private String numero;
    private String nomeTitular;
    private double saldo = 0;

    public Conta(String numero, String nomeTitular, double saldo) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositarDinheiro(double valor) {
        System.out.printf("Deposito de R$ %.2f \n", valor);
        setSaldo(this.getSaldo() + valor);
    }

    public void sacarDinheiro(double valor) {
        if (valor < this.saldo) {
            System.out.println("Valor sacado: " + valor);
            setSaldo(this.getSaldo() - valor);
            System.out.println("saldo atual: " + this.getSaldo());
        } else {
            System.out.println("saldo insuficiente: " + this.getSaldo());

        }
    }

}
