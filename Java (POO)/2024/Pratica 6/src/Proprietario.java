import javax.sound.midi.Soundbank;

public class Proprietario {
    private String nome;
    private String dataNasc;
    private String CPF;
    private String RG;
    private Endereco endereco;

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }
    public void setRG(String RG) {
        this.RG = RG;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /// Método para imprimir dados
    public void propPrint() {
        System.out.println("");
        System.out.println("=== PROPIETARIO ===");
        System.out.println("Nome: " + nome);
        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("Endereço: " + endereco);
        System.out.println("CPF: " + CPF);
        System.out.println("RG: " + RG);
    }
}

