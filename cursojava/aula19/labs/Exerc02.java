package com.jefferson.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[8];
        int[] vetorB = new int[vetorA.length];

        for (int i=0; i< vetorA.length; i++){

            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = scan.nextInt();

            vetorB[i] = vetorA[i] * 2;
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
 * CRIAR UM VETOR A COM 8 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR B DO MESMO TIPO E TAMANHO E COM OS ELEMENTOS DO VETOR A
 * MULTIPLICADOS POR 2 , OU SEJA, B[1] = A[1] * 2.
 */