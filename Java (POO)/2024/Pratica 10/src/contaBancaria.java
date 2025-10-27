// ContaBancaria.java
public class contaBancaria {
    private double saldo;

    public void depositar(double valor) throws valorInvalido {
        if (valor <= 0) {
            throw new valorInvalido("Valor de depósito inválido.", valor);
        }
        saldo += valor;
    }

    public void sacar(double valor) throws valorInvalido,saldoInsuficiente {
        if (valor <= 0) {
            throw new valorInvalido("Valor de saque inválido.", valor);
        }
        if (valor > saldo) {
            throw new saldoInsuficiente("Saldo insuficiente para saque.", saldo);
        }
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
