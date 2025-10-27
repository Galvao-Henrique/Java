import java.util.LinkedList;
import java.util.Queue;

public class SistemaImpressao {
    public static void main(String[] args) {
        Queue<Documento> fila = new LinkedList<>();

        fila.add(new Documento("Trabalho_TCC.pdf", 25));
        fila.add(new Documento("Relatorio.docx", 12));
        fila.add(new Documento("Foto.png", 3));
        fila.add(new Documento("APS.pdf", 10));

        System.out.println("Carregando documentos!");
        System.out.println("Ordem de impressão:\n");

        int contador = 1;
        while (!fila.isEmpty()) {
            Documento d = fila.poll(); // remove o primeiro da fila
            System.out.println(contador + "° " + d.Doc + " - " + d.Pag + " páginas");
            contador++;
        }

        System.out.println("\nTodos os documentos foram impressos!");
    }
}

class Documento {
    String Doc;
    int Pag;

    Documento(String Doc, int Pag) {
        this.Doc = Doc;
        this.Pag = Pag;
    }
}
