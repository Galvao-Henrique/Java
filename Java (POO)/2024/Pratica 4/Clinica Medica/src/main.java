public class main {
    public static void main(String[] args) {

        paciente paciente1 = new paciente();
        paciente1.telefone = "(12) 99743-0404";
        paciente1.cpf = "103.847.654-23";
        paciente1.plano = "Uniodonto";
        paciente1.alergia = true;
        paciente1.idade = 21;
        paciente1.nome = "Henrique Galvão";

        medico medico1 = new medico();
        medico1.crm = "625262";
        medico1.nome = "Ana Cristina";
        medico1.telefone = "(12) 99753-3511";
        medico1.salario = 20000;

        consulta consulta1 = new consulta();
        consulta1.data = "12/04/26";
        consulta1.medico = "Ana Cristia";
        consulta1.paciente = "Henrique Galvão";

        paciente1.infoPaciente();
        medico1.infoMed();
        consulta1.infoCons();
    }
}
