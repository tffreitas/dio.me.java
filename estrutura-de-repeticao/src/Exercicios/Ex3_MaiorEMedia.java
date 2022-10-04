package Exercicios;

import java.util.Scanner;

/*
Faça um programa que leia 5 numeros e informe
o maior núemro e a media desses números. 
 */

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0; //variavel criada para contar numero de vezes do laço
        int maior = 0; // variavel criada para verificar o maior numero informado
        int soma = 0;
        

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();
            count += 1;

            soma = soma + numero;

            if (numero > maior) maior = numero;

        } while(count < 5);  
        
        System.out.println("A soma dos números digitados foi: " + soma);
        System.out.println("O maior número digitado foi: " + maior);
        System.out.println("A média dos números digitados foi: " + soma/5);
    }         
}
    

