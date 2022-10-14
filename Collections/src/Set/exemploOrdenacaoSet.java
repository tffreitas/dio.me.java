package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/*
 * Dados as seguintes informações sobre minhas series favoritas.
 * crie um conjunto e ordene este conjunto exibindo:
 * (nome - genero - tempo de episodio);
 * 
 * Serie 1 = Nome: Got, genero: fantasia, tempoEpisodio: 60
 * Serie 2 = Nome: Dark, genero: drama, tempoEpisodio: 60;
 * Serie 3 = nome: that '70s show, gereno: comedia, tempoEpisodio: 25;
 */

public class exemploOrdenacaoSet {
    public static void main(String[] args) {
        
        System.out.println("--\tOrdem aleatoria\t--");
        Set<Serie> minhasSeries = new HashSet(){{
            add(new Serie("GoT", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("That '70s Show", "comedia", 25));
        }};
        for (Serie serie: minhasSeries) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }

        System.out.println("--\tOrdem Inserção\t--");
        Set<Serie> minhasSeries1 = new LinkedHashSet(){{
            add(new Serie("GoT", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("That '70s Show", "comedia", 25));
        }};
        for (Serie serie: minhasSeries1) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpisodio());
        }
    }
    
}

class Serie {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
        "nome='"  + nome + '\'' +
        ", genero='" + genero + '\'' +
        ", tempoEpisodio=" + tempoEpisodio +
        '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return nome.equals(serie.nome) && genero.equals(serie.genero) && tempoEpisodio.equals(serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }
}
