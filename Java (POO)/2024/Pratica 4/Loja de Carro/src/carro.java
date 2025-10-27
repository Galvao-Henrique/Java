/// Exercício 1) Considere um sistema que irá gerenciar uma loja de venda de carros. Crie ao menos
/// duas classes para representar dois conjuntos de objetos distintos que possam existir dentro desse
/// contexto. Para cada classe, é necessário que ao menos elas possuam seis atributos relevantes ao
/// contexto que estão aplicadas. Em relação aos métodos, é necessário que elas possuam ao
/// menos dois métodos cada.

public class carro {
    String marca;
    String modelo;
    int ano;
    double preco;
    String cor;
    boolean vendido;

    void detalhes() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano +
                ", Preço: R$" + preco + ", Cor: " + cor + ", Vendido: " + vendido);
    }

    void vender() {
        vendido = true;
        System.out.println("Vendido com sucesso!");
    }
}


