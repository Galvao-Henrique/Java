public class Texto {
    private String palavras;

    /// Construtor que recebe uma String
    public Texto(String palavras) {
        this.palavras = palavras;
    }

    /// Construtor com lógica
    public Texto(int numero, String texto) {
        if (numero == 0) {
            this.palavras = "";
        } else if (numero >= texto.length()) {
            this.palavras = texto;
        } else {
            this.palavras = texto.substring(0, numero);
        }
    }

    public void exibir() {
        System.out.println("Palavras: " + palavras);
    }
}
