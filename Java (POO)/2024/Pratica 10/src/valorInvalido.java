public class valorInvalido extends Exception{
    private double valor;

    public valorInvalido(String mensagem, double valor){
        super(mensagem);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
