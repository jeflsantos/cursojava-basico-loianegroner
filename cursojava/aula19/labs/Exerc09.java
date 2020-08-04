package com.jefferson.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exerc09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Entre com o valor da posição " +i +", do Vetor A.");
            vetorA[i] = scan.nextInt();
        }

        for (int i=0; i< vetorB.length; i++){
            System.out.println("Entre com o valor da posição " +i +", do Vetor B.");
            vetorB[i] = scan.nextInt();
        }

        for (int i=0; i< vetorC.length; i++){
            vetorC[i] = vetorA[i] / vetorB[i];
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

        DecimalFormat df = new DecimalFormat("###,###.##");

        System.out.print("Vetor C = ");
        for (int i=0; i< vetorC.length; i++){
            System.out.print(vetorC[i] +" ");
        }
        System.out.println();
    }
}

/*
 *  CRIAR DOIS VETORES A e B CADA UM COM 10 ELEMENTOS INTEIROS. CONSTRUIR UM VETOR C, ONDE CADA ELEMENTO DE C É A
 * DIVISÃO DOS RESPECTIVOS ELEMENTOS EM A e B, OU SEJA:
 * C[i] = A[i] / float (B[i]).
 */