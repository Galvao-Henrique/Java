// Implementação de uma pilha de inteiros usando vetor
// Autor: Henrique (exemplo de estudante)
// Aula: Estruturas de Dados - Pilhas

public class Pilha {
    private int[] elementos; // vetor que vai armazenar os valores
    private int topo;        // índice do elemento no topo da pilha
    private int capacidade;  // capacidade máxima da pilha

    // Construtor da pilha
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        elementos = new int[capacidade]; // cria o vetor do tamanho desejado
        topo = -1; // quando a pilha está vazia, o topo vale -1
    }

    // Operação PUSH -> adiciona um elemento no topo
    public void push(int valor) {
        if (topo == capacidade - 1) { // se topo for o último índice
            System.out.println("Pilha cheia! Não é possível adicionar " + valor);
        } else {
            topo++;              // move o topo para a próxima posição
            elementos[topo] = valor; // insere o valor no vetor
            System.out.println(valor + " adicionado na pilha.");
        }
    }

    // Operação POP -> remove o elemento do topo
    public int pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia! Nada a remover.");
            return -1; // valor simbólico para erro
        } else {
            int valorRemovido = elementos[topo]; // pega o valor do topo
            topo--; // move o topo para baixo (removendo o elemento)
            return valorRemovido;
        }
    }

    // Operação TOP -> mostra o valor do topo sem remover
    public int top() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            return elementos[topo];
        }
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    // Método principal para testar a pilha
    public static void main(String[] args) {
        Pilha pilha = new Pilha(5); // cria uma pilha de tamanho 5

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Topo da pilha: " + pilha.top());

        System.out.println("Removendo: " + pilha.pop());
        System.out.println("Removendo: " + pilha.pop());

        System.out.println("Topo da pilha agora: " + pilha.top());

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
    }
}
