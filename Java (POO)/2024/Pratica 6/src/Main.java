public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setBairro("Aquarius");
        endereco.setCep("12246001");
        endereco.setCidade("São José dos Campos");
        endereco.setRua("Rua Tubarão");
        endereco.setEstado("SP");

        Proprietario prop = new Proprietario();
        prop.setNome("Henrique Galvão");
        prop.setCPF("232.124.12-03");
        prop.setRG("13.123.123-45");
        prop.setDataNasc("27/12/2003");
        prop.setEndereco(endereco);

        Carro carro = new Carro();
        carro.setModelo("Sportage");
        carro.setMarca("Kia");
        carro.setAno(2008);
        carro.setCor("Preto");
        carro.setChassi("123ABC456XYZ");
        carro.setNumMarchas(5);
        carro.setVelocidadeMaxima(250);
        carro.setAutomatico(true);
        carro.setNumPortas(4);
        carro.setTetoSolar(false);

        carro.carroPrint();
        prop.propPrint();

        // SIMULAÇÃO
        System.out.println();
        System.out.println("=== SIMULAÇÃO ===");

        // ré com carro parado
        carro.trocarMarcha(-1); // Deve funcionar
        System.out.println("Marcha engatada: Ré");

        // Acelerar (vai continuar parado por estar em ré)
        carro.acelerar();
        System.out.println("Velocidade atual: " + carro.getVelocidadeAtual());

        // Engatar primeira e acelerar até 5 km/h
        carro.trocarMarcha(1);
        System.out.println("Marcha engatada: 1");

        for (int i = 0; i < 5; i++) {
            carro.acelerar();
            System.out.println("Acelerando... Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");
        }

        // Tentar engatar ré com carro em movimento
        carro.trocarMarcha(-1);

        // Reduzir para ponto morto
        carro.reduzirMarcha(0);
        System.out.println("Marcha reduzida para: " + carro.getMarchaAtual());

        // Frear
        carro.frear();
        System.out.println("Freando... Velocidade atual: " + carro.getVelocidadeAtual() + " km/h");

        // Engatar ré agora deve funcionar
        carro.trocarMarcha(-1);
        System.out.println("Ré engatada com sucesso!");

    }
}
