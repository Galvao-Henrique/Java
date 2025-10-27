public class paciente {
    String nome;
    String cpf;
    int idade;
    boolean alergia;
    String plano;
    String telefone;

    void agendaConsulta(){
        System.out.println(nome + "consulta confirmada");
    }

    void cancelaConsulta(){
        System.out.println(nome + "consulta cancelada");
    }

    void infoPaciente(){
        System.out.println("Paciente: " + nome + ", CPF: " + cpf + ", Idade: " + idade + ", Alergia: " + alergia + ", Plano de saúde: " + plano + ", Telefone: " + telefone);
    }
}
