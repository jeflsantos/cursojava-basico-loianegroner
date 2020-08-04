package com.jefferson.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;

        for (int i=0; i< vetorA.length; i++){
            if (vetorA[i] % 5 == 0){
                soma += vetorA[i];
            }
        }

        System.out.print("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println();

        System.out.println("Soma: " +soma);

    }
}

/*
 * CRIAR UM VETOR A COM 10 ELEMENTOS INTEIROS. IMPLEMENTAR UM PROGRAMA QUE DETERMINE A SOMA DOS ELEMENTOS ARMAZENADOS NESTE VETOR QUE SAO MULTIPLOS DE 5.
 */