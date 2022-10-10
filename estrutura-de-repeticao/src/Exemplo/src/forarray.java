package Exemplo.src;

public class forarray {

    public static void main(String[] args) {
        
        String alunos [] = {"THIAGO", "DEISE", "INGRID", "THEO"};

        for (int x=0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);            
        }
    }
}