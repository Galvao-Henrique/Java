public class main {
    public static void main(String[] args) {

        carro carro1 = new carro();
        carro1.marca = "FIAT";
        carro1.modelo = "Toro";
        carro1.ano = 2025;
        carro1.preco = 200000;
        carro1.cor = "Vermelho";
        carro1.vendido = true;


        vendedor vendedor1 = new vendedor();
        vendedor1.nome = "Henrique Galvão";
        vendedor1.cpf = "496.432.355.56";
        vendedor1.idade = 21;
        vendedor1.email = "henriquepires114@gmai.com";
        vendedor1.telefone = "(12) 99772-4242";
        vendedor1.vendidos = 1;

        carro1.detalhes();
        vendedor1.info();
        vendedor1.regVenda();
    }
}
