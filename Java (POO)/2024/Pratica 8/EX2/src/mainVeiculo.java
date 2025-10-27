public class mainVeiculo {
    public static void main(String[] args) {
        Automovel a = new Automovel();
        Moto m = new Moto();
        Onibus o = new Onibus();

        a.ligar();
        System.out.println("Automóvel está ligado? " + a.isLigado());
        a.desligar();
        System.out.println("Automóvel está ligado? " + a.isLigado());

        m.ligar();
        System.out.println("Motocicleta está ligada? " + m.isLigado());
        m.desligar();
        System.out.println("Motocicleta está ligada? " + m.isLigado());

        o.ligar();
        System.out.println("Ônibus está ligado? " + o.isLigado());
        o.desligar();
        System.out.println("Ônibus está ligado? " + o.isLigado());
    }
}
