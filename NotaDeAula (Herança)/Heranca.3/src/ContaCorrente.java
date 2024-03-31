
public class ContaCorrente extends ContaBancaria {
    public double valorChequeEspecial = 1000;

    // Getters and Setters
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getValorChequeEspecial() {
        return valorChequeEspecial;
    }

    public void setValorChequeEspecial(double valorChequeEspecial) {
        this.valorChequeEspecial = valorChequeEspecial;
    }
    // Funções
    public double depositar(double x) {
        return x;
    }

    public double sacar(double x) {
        return x;
    }

    public double chequeEspecial(double x) {
        return valorChequeEspecial;
    }

    public String exibirDados() {
        return "Titular: " + getTitular() + "\nSaldo: " + getSaldo() + "\nCheque Especial:" +valorChequeEspecial;
    }
}
