// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        int A, N;
        int multiplicador = 1;
        int soma = 0;

        Scanner input = new Scanner(System.in);
        //System.out.println("Digite o numero: ");
        A = input.nextInt();
        //System.out.println("Digite o limitador");
        N = input.nextInt();

        //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

        for(int count = A; count <= N; count = count + A) {            
            //System.out.println(A*multiplicador);
            soma = soma + A*multiplicador; 
            multiplicador++;                     
        }
        System.out.println(soma);
    }
}