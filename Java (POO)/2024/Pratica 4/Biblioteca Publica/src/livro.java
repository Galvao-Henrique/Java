public class livro {
    String nome;
    String autor;
    String genero;
    int ano;
    boolean disponivel;

    void infoLivro(){
        System.out.println("Nome do livro: " + nome + ", Autor: " + autor + ", ano publicado: " + ano + ", Disponibilidade: " + disponivel);
    }

}
