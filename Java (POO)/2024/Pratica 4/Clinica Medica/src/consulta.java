public class consulta {
    String medico;
    String paciente;
    String data;


    void confirmaCons(){
        System.out.println("Consulta confirmada com o Dr(a): " + medico + "com o paciente" + paciente + "na data de: " + data);
    }

    void cancelaCons(){
        System.out.println("Consulta cancelada com o Dr(a): " + medico + "com o paciente" + paciente + "na data de: " + data);
    }

    void infoCons(){
        System.out.println("Médico: " + medico + ", Pciente; " + paciente + ", data: " + data );
    }
}
