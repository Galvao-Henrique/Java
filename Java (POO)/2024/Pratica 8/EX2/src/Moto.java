public class Moto extends Veiculo{
    @Override
    public void ligar(){
        super.ligar();
        System.out.println("Esta Ligada");
    }

    @Override
    public void desligar(){
        super.desligar();
        System.out.println("Esta Desligada");
    }
}
