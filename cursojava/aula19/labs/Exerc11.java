package com.jefferson.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int qtdPares = 0;

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = scan.nextInt();
        }

        for (int i=0; i< vetorA.length; i++){
            if (vetorA[i] % 2 == 0){
                qtdPares++;
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println();
        System.out.println("Qtd numeros pares: " +qtdPares);
    }
}

/*
 *  CRIAR UM VETOR A COM 10 ELEMENTOS INTEIROS. IMPLEMENTAR UM PROGRAMA QUE DEFINA E ESCREVA A QUANTIDADE DE ELEMENTOS ARMAZENADOS
 * NESTE VETOR QUE SÃO PARES.
 */

