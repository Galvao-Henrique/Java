public class saldoInsuficiente extends Exception{
    private double saldoDisponivel;

    public saldoInsuficiente(String mensagem, double saldoDisponivel){
        super(mensagem);
        this.saldoDisponivel = saldoDisponivel;
    }

    public double getSaldoDisponivel(){
        return saldoDisponivel;
    }
}
