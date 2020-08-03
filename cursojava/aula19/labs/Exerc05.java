package com.jefferson.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Entre com a posição: " +i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * i;
        }

        System.out.print("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i=0; i< vetorB.length; i++){
            System.out.print(vetorB[i] +" ");
        }
        System.out.println();


    }
}

/*
 *  CRIAR UM VETOR A COM 10 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR B DE MESMO TIPO E TAMANHO, SENDO QUE CADA ELEMENTO DO VETOR B
 * DEVERA SER O RESPECTIVO ELEMENTO DE A MULTIPLICADO POR SUA POSIÇÃO (OU INDICE), OU SEJA:
 * B[i] = A[i] * i.
 */