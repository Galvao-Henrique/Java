public class Endereco {
    // Atributos encapsulados
    private String bairro;
    private String rua;
    private String cidade;
    private String estado;
    private String cep;

    // Getters e Setters
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    // toString() para exibição correta
    @Override
    public String toString() {
        return rua + ", " + bairro + ", " + cidade + " - " + estado + " | CEP: " + cep;
    }
}
