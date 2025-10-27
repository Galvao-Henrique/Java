public class main {
    public static void main(String[] args) {
        livro livro1 = new livro();
        livro1.autor = "Dan Brown";
        livro1.nome = "Código da vinci";
        livro1.ano = 2015;
        livro1.genero = "Ficção";
        livro1.disponivel = true;

        usuario usuario1 = new usuario();
        usuario1.cpf = "234.534.645-45";
        usuario1.idade = 21;
        usuario1.nome = "Henrique Galvão";
        usuario1.tell = "(12) 99864-4242";

        usuario1.infoUsuario();
        livro1.infoLivro();
    }
}
