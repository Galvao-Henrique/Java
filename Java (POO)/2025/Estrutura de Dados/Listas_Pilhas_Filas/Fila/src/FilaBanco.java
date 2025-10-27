import java.util.LinkedList;
import java.util.Queue;

public class FilaBanco {
    public static void main(String[] args) {
        Queue<Cliente> fila = new LinkedList<>();

        fila.add(new Cliente("Henrique", 6));
        fila.add(new Cliente("Pedro", 7));
        fila.add(new Cliente("Carolina", 10));

        System.out.println("Ordem de chamada: ");
        while (!fila.isEmpty()){
            Cliente c = fila.poll();
            System.out.println("Atendimento: " + c.nome);
            System.out.println("Tempo estimado: " + c.tempoAtendimento + " minutos");
            System.out.println("");
        }
    }
}

class Cliente{
    String nome;
    int tempoAtendimento;

    Cliente(String nome, int tempoAtendimento){
        this.nome = nome;
        this.tempoAtendimento = tempoAtendimento;
    }
}
