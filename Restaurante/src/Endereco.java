public class Endereco {
    private String cep;
    private String complemento;
    
    public Endereco(String cep, String complemento) {
        this.cep = cep;
        this.complemento = complemento;
    }

    public Endereco() {        
    }

    public String toString() {
        return "Endereço{" +
        "cep= " + cep + "\"" +
        ", complemento= " + complemento + "\"" +
        "}";
    }
}
