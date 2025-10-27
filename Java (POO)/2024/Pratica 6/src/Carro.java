class Carro {
    private String modelo;
    private String marca;
    private int velocidadeMaxima;
    private String cor;
    private String chassi;
    private int velocidadeAtual;
    private int numMarchas;
    private int ano;
    private Proprietario proprietario;
    private int numPortas;
    private boolean automatico;
    private boolean tetoSolar;
    private int marchaAtual = 0;

    public boolean isTetoSolar() {
        return tetoSolar;
    }
    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public boolean isAutomatico() {
        return automatico;
    }
    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    public int getNumPortas() {
        return numPortas;
    }
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public int getMarchaAtual() {
        return marchaAtual;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public void setNumMarchas(int numMarchas) {
        this.numMarchas = numMarchas;
    }

    public void acelerar() {
        if (velocidadeAtual < velocidadeMaxima) {
            velocidadeAtual += 1;
        }
    }

    public void frear() {
        velocidadeAtual = 0;
    }

    public void trocarMarcha(int novaMarcha) {
        if (novaMarcha == -1 && velocidadeAtual > 0) {
            System.out.println("Carro em movimento, pare para engatar a ré");
        } else if (novaMarcha >= -1 && novaMarcha <= numMarchas) {
            marchaAtual = novaMarcha;
        } else {
            System.out.println("Marcha inválida");
        }
    }

    public void reduzirMarcha(int novaMarcha) {
        if (novaMarcha < marchaAtual && novaMarcha >= -1) {
            marchaAtual = novaMarcha;
        } else {
            System.out.println("Marcha inválida para redução.");
        }
    }

    public void carroPrint(){
        System.out.println("=== CARRO ===");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Qtd de marchas: " + numMarchas);
        System.out.println("Velocidade máxima: " + velocidadeMaxima);
        System.out.println("Automático: " + (automatico ? "Sim" : "Não"));
        System.out.println("Número de portas: " + numPortas);
        System.out.println("Possui teto solar: " + (tetoSolar ? "Sim" : "Não"));
        System.out.println("Chassi: " + chassi);
    }
}
