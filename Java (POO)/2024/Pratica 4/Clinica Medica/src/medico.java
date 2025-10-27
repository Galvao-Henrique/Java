public class medico {
    String nome;
    String crm;
    String especialidade;
    String telefone;
    double salario;

    void atendendoPaciente(){
        System.out.println(nome + "está atendendo um paciente");
    }

    void naoPaciente (){
        System.out.println(nome + "não está atendendo um paciente");
    }
     void infoMed(){
         System.out.println("Médico: " + nome + ", CRM: " + crm + ", Especialidade: " + especialidade + ", Telefone: " + telefone + ", Salário: R$" + salario);
     }
}
