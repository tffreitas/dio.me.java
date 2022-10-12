import java.util.List;
import java.util.ArrayList;

public class Restaurante {
    private Long id;
    private String nomeFantasia;
    private String cnpj;
    private List<Produto> catalogo = new ArrayList<>();
    private Endereco endereco;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public void setcnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String toString()  {
        return "Restaurante{" +
            "id = " + id +
            ", nomeFantasia= " + nomeFantasia + "\"" +
            ", cnpj= " + cnpj + "\"" +
            ", catalogo= " + catalogo +
            ", endereco= " + endereco +
            "}";    
    }
}

