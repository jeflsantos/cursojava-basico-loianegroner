package com.jefferson.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = scan.nextInt();
        }

        for (int i=0; i< vetorA.length; i++){
            soma += vetorA[i];
        }

        System.out.print("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println();

        System.out.println("A soma do Vetor A: " +soma);
    }
}

/*
 *  CRIAR UM VETOR A COM 10 ELEMENTOS INTEIROS. IMPLEMENTAR UM PROGRAMA QUE DEFINA E ESCREVA A SOMA DE TODOS OS ELEMENTOS ARMAZENADOS
 * NESTE VETOR.
 */
