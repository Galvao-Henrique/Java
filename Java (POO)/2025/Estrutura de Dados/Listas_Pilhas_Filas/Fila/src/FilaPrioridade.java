import java.util.LinkedList;
import java.util.Queue;

public class FilaPrioridade {
    public static void main(String[] args) {
        Queue<Normal> filaNormal = new LinkedList<>();
        Queue<Prioridade> filaPrioridade = new LinkedList<>();

        // Clientes prioritários
        filaPrioridade.add(new Prioridade("Gabriel"));
        filaPrioridade.add(new Prioridade("Helena"));
        filaPrioridade.add(new Prioridade("João"));

        // Clientes normais
        filaNormal.add(new Normal("Henrique"));
        filaNormal.add(new Normal("Leticia"));
        filaNormal.add(new Normal("Carolina"));
        filaNormal.add(new Normal("Luan"));

        System.out.println("=== Iniciando Atendimento ===\n");

        // Atende todos os prioritários primeiro
        while (!filaPrioridade.isEmpty()) {
            Prioridade p = filaPrioridade.poll();
            System.out.println("Atendendo (PRIORITÁRIO): " + p.nome);
        }

        // Depois atende os normais
        while (!filaNormal.isEmpty()) {
            Normal n = filaNormal.poll();
            System.out.println("Atendendo: " + n.nome);
        }

        System.out.println("\nTodos os clientes foram atendidos!");
    }
}

class Normal {
    String nome;

    Normal(String nome) {
        this.nome = nome;
    }
}

class Prioridade {
    String nome;

    Prioridade(String nome) {
        this.nome = nome;
    }
}
