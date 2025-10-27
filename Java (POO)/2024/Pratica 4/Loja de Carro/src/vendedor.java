public class vendedor {
    String nome;
    String cpf;
    int idade;
    String email;
    String telefone;
    int vendidos;

    void info() {
        System.out.println("Nome: " + nome + ", CPF: " + cpf + ", Idade: " + idade +
                ", E-mail: " + email + ", Telefone: " + telefone);
    }

    void regVenda(){
        vendidos++;
        System.out.println("Venda registrada. Total de carros vendidos: " + vendidos);
    }
}
