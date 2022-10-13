package List;

import java.util.ArrayList;
import java.util.List;

/*
 * Dadas as seguintes informações sobre meus gatos,
 * crie uma lista exibindo:
 * (nome - idade - cor);
 * 
 * Gato 1 = nome: Jon, idade: 18, cor: preta
 * Gato 2 = nome: Simba, idade: 6, cor: tigrado
 * Gato 3 = nome: Jon, idade: 12, cor: amarelo
 */

public class ExemploOrdenacaoLis {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList(){{
            add(new Gato("Jon", 18, "preto"));
            add(new Gato("Simba", 6, "tigrado"));
            add(new Gato("Jon", 12, "amarelo"));
            
        }};
        
        System.out.println("--\tOrdem de Inserçao\t---");

        System.out.println("--\tOrdem aleatoria\t---");

        System.out.println("--\tOrdem Natural (Nome)\t---");

        System.out.println("--\tOrdem Idade\t---");

        System.out.println("--\tOrdem cor\t---");

        System.out.println("--\tOrdem Nome/Cor/Idade\t---");
    }    
}

class Gato {
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome(){
        return nome;
    }

    public Integer getIdade(){
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public String toString() {
        return "Gato{" +
        "nome= '" + nome + '\'' +
        ", idade= " + idade +
        ", cor= " + cor + '\'' +
        '}';        
    }
}


