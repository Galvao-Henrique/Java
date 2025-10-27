public class Pilha {
    private int[] dados;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade){
        this.capacidade = capacidade;
        dados = new int[capacidade];
    }

    public boolean isVazio(){
        return topo == -1;
    }

    public boolean isfull(){
        return topo == capacidade - 1;
    }

    public void push(int valor){
        if (isfull()) {
            System.out.println("Pilha cheia");
        } else {
            dados[++topo] = valor;
        }
    }

    public int pop() {
        if (isVazio()){
            System.out.println("Pilha vazia");
            return -1;
        } else {
            return dados[topo--];
        }
    }

    public int top(){
        if (isVazio()){
            System.out.println("Pilha vazia!");
            return -1;
        } else {
            return dados[topo];
        }
    }

    public void mostrar(){
        if (isVazio()){
            System.out.println("Pilha vazia");
        } else {
            System.out.println("Pilha: ");
            for (int i = 0; i <= topo; i++){
                System.out.println(dados[i]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.mostrar();

        System.out.println("topo: " + pilha.top());
        System.out.println("Removido: " + pilha.pop());
        pilha.mostrar();

        pilha.push(40);
        pilha.push(50);
        pilha.push(60);
        pilha.push(70);

        pilha.mostrar();
    }
}
