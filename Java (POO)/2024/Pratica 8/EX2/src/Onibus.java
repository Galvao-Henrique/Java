public class Onibus extends Veiculo {

    @Override
    public void ligar(){
        super.ligar();
        System.out.println("Esta Ligado");
    }

    @Override
    public void desligar(){
        super.desligar();
        System.out.println("Esta Desligado");
    }
}
