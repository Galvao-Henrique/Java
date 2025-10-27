public class Automovel extends Veiculo {

    @Override
    public void ligar(){
        super.ligar();
        System.out.println("Esta ligado");
    }

    @Override
    public void desligar() {
        super.desligar();
        System.out.println("Esta Desligado");
    }

}
