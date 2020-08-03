package com.jefferson.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int [] vetorA = new int[15];
        int [] vetorB = new int[vetorA.length];

        for (int i=0; i< vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * vetorA[i];
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
 * CRIAR UM VETOR A COM 15 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR B DE MESMO TIPO E TAMANHO, SENDO CADA ELEMENTO DO VETOR B
 * DEVERA SER O QUADRADO DO RESPECTIVO ELEMENTO DE A, OU SEJA, B[I] = A[I] * A[I].
 */