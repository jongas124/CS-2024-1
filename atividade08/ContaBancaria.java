public class ContaBancaria {
    private double saldo;

    public ContaBancaria (double saldo) {
        this.saldo = saldo;
    }

    public void depositar (double valor) {
        this.saldo = valor + this.saldo;
    }

    public void sacar (double valor) throws SaldoInsuficienteException {
        if(saldo < valor) {
            throw new SaldoInsuficienteException();
        }
        this.saldo = this.saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
