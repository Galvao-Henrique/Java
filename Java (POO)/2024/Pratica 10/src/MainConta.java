public class MainConta {
    public static void main(String[] args) {
        contaBancaria conta = new contaBancaria();

        try {
            conta.depositar(500);
            System.out.println("Depósito realizado. Saldo atual: " + conta.getSaldo());
        } catch (valorInvalido e){
            System.out.println(e.getMessage() + " Valor: " + e.getValor());
        }

        try {
            conta.sacar(200);
            System.out.println("Saque realizado. Saldo atual: " + conta.getSaldo());
        } catch (valorInvalido | saldoInsuficiente e) {
            if (e instanceof valorInvalido) {
                System.out.println(e.getMessage() + " Valor: " + ((valorInvalido) e).getValor());
            } else {
                System.out.println(e.getMessage() + " Saldo disponível: " + ((saldoInsuficiente) e).getSaldoDisponivel());
            }
        }

        // Depósito inválido
        try {
            conta.depositar(0);
        } catch (valorInvalido e) {
            System.out.println(e.getMessage() + " Valor: " + e.getValor());
        }

        // Saque inválido (valor maior que o saldo)
        try {
            conta.sacar(1000);
        } catch (valorInvalido | saldoInsuficiente e) {
            if (e instanceof valorInvalido) {
                System.out.println(e.getMessage() + " Valor: " + ((valorInvalido) e).getValor());
            } else {
                System.out.println(e.getMessage() + " Saldo disponível: " + ((saldoInsuficiente) e).getSaldoDisponivel());
            }
        }
    }
}

