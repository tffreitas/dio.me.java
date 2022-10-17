package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import javax.print.attribute.standard.RequestingUserName;
import javax.sound.midi.Soundbank;

/*
 * Dadas as seguintes informações sobre meus livros favorios e seus auores,
 * crie um dicionario e ordene ese dicionario:
 * exibindo (Nome Autor - Nome livro);
 * 
 * Autor = Hawking, Stephen - Livro = Uma breve historia do tempo. paginas, 256
 * Autor = Duhigg, Charles - Livro = O poder do habito. paginas: 408
 * Autor = Harari, uval Noah - Livro = 21 lições para o seculo 21, paginas: 432
 */
public class exemploOrdenacaoMap {
    public static void main(String[] args) {
        
    System.out.println("--\tOrdem Aleatoria\t--");

    Map<String, Livro> meusLivros = new HashMap(){{
        put("Hawking, Stephen", new Livro("Uma breve historia do tempo", 256));
        put("Duhigg, Charles", new Livro("O poder do habito. paginas", 408));
        put("Harari, uval Noah", new Livro("21 lições para o seculo 21", 432));
    }};
    for(Map.Entry<String, Livro> livro : meusLivros.entrySet())
    System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
    }
    
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "{" +
        "nome='" + nome + '\'' +
        ",paginas=" + paginas +
        '}';
    }
}