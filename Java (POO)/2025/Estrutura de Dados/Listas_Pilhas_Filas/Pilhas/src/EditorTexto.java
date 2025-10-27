import java.util.Stack;

public class EditorTexto {
    private String texto;
    private Stack<String> pilhaUndo;

    public EditorTexto(){
        texto = "";
        pilhaUndo = new Stack<>();
    }

    public void digitar(String novoTexto){
        pilhaUndo.push(texto);
        texto = texto + novoTexto;
    }

    public  void desfazer(){
        if (!pilhaUndo.isEmpty()){
            texto = pilhaUndo.pop();
        } else {
            System.out.println("Pilha vazia, nada para desfazer");
        }
    }

    public void mostarTexto(){
        System.out.println("Texto atual: " + texto);
    }

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.digitar("Olá");
        editor.mostarTexto();

        editor.digitar(", mundo.");
        editor.mostarTexto();

        editor.desfazer();
        editor.mostarTexto();

        editor.desfazer();
        editor.mostarTexto();

        editor.desfazer();
    }
}
