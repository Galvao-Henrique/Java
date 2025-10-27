public class SomaAssincrona extends Thread{
    private int ValorA;
    private int ValorB;

    public SomaAssincrona(int ValorA, int ValorB){
        this.ValorA = ValorA;
        this.ValorB = ValorB;
    }

    @Override
    public void run() {
        int resultado = ValorA + ValorB;
        System.out.println("Soma: " + resultado);
    }
}

