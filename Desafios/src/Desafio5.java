// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.*;

public class Desafio5 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int numero;
        int posicao = -1;
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75}; 

        System.out.println("Digite o numero que deseja procurar: ");
        numero = leitor.nextInt();

        posicao = posicao(numero, elementos);

        if (posicao == -1){
            System.out.println("Numero " + numero + " nao encontrado!");
        } else {
            System.out.println("Achei " + numero + " na posicao " + posicao);
        }
    }
    
    static int posicao(int numero, int[] elementos) {
        int posicao = -1;
        for (int i = 0; i < elementos.length; i++){
            if(numero == elementos[i]){
                posicao = i;
            }
        }
        return posicao;
    }
}