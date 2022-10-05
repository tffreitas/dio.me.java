package Exercicios;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuario:
Ex: 5! = 120 (5 X 4 X 3 X 2 x 1) 

 */
public class Ex6_Fatorial {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");

        int fatorial;
        fatorial = scan.nextInt();

        int multiplicacao = 1;
        
        System.out.print(fatorial +"! = ");
        for(int i = fatorial; i >= 1; i--) {
            multiplicacao = multiplicacao*i; 
        }
        System.out.print(multiplicacao);
    }   
}
