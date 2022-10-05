package Exercicios;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
 */

public class Ex4_ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdNumeros;
        int numero;
        int qtdPares = 0;
        int qtdImpar = 0;

        System.out.println("Informe a quantidade de números: ");
        qtdNumeros = scan.nextInt();

        int count = 0;

        do{
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            if(numero % 2 == 0){
                qtdPares +=1;
            } else
                qtdImpar +=1;

            count +=1;

        }while(count < qtdNumeros);

        System.out.println("Quantidades de números pares é: " + qtdPares);
        System.out.println("Quantidades de números impares é: " + qtdImpar);
    }
    
}
