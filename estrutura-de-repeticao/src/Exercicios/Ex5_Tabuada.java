package Exercicios;

import java.util.Scanner;

/*
 Desenvolva um gerador de tabuada,
 capaz de gerar a tabuada de qualquer núemro inteiro entre 1 a 10.
 o Usuario deve informar de qual numero ele deseja ver a tabuada.
 A saída deve ser conforme o exemplo abaixo:
 */

 public class Ex5_Tabuada {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();
        
        System.out.println("Tabuada de " + tabuada);

        for(int i =1 ; i <= 10; i++) {
            System.out.println(tabuada + " X " + i + " = " + tabuada*i);4
        }
    }
    
}
