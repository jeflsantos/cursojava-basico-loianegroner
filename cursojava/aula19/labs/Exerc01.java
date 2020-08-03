package com.jefferson.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorB.length; i++) {

            System.out.println("Entre com o valor da posição: " + i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();

        System.out.print("Vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}

/*
 *  CRIAR UM VETOR A COM 5 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR B DO MESMO TIPO E TAMANHO E COM OS "MESMOS" ELEMENTOS DO VETOR A,
 * OU SEJA, B[1] = A[1].
 */