public class Fila {
    private int[] elementos;
    private int tamanho;
    private int inicio;
    private int fim;

    // Construtor
    public Fila(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
        inicio = 0;
        fim = -1;
    }

    // Enfileirar (adiciona um elemento no final da fila)
    public void enqueue(int valor) {
        if (tamanho == elementos.length) {
            System.out.println("Fila cheia! Não é possível adicionar o elemento.");
            return;
        }
        fim = (fim + 1) % elementos.length;
        elementos[fim] = valor;
        tamanho++;
    }

    // Desenfileirar (remove o elemento do início da fila)
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia! Não é possível remover o elemento.");
            return -1; // valor de erro
        }
        int valorRemovido = elementos[inicio];
        inicio = (inicio + 1) % elementos.length;
        tamanho--;
        return valorRemovido;
    }

    // Verifica se a fila está vazia
    public boolean isEmpty() {
        return tamanho == 0;
    }

    // Exibe a fila (opcional)
    public void mostrarFila() {
        if (isEmpty()) {
            System.out.println("Fila vazia.");
            return;
        }
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho; i++) {
            int index = (inicio + i) % elementos.length;
            System.out.print(elementos[index] + " ");
        }
        System.out.println();
    }

    // Teste da fila
    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enqueue(10);
        fila.enqueue(20);
        fila.enqueue(30);
        fila.mostrarFila();

        System.out.println("Removido: " + fila.dequeue());
        fila.mostrarFila();

        System.out.println("Fila está vazia? " + fila.isEmpty());
    }
}

