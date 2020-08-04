package com.jefferson.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int impar = 0;

        for (int i=0; i< vetorA.length; i++){
            System.out.println("Entre com o valor da posição: " +i);
            vetorA[i] = scan.nextInt();
        }

        for (int i=0; i< vetorA.length; i++){
            if (vetorA[i] % 2 != 0){
                impar++;
            }
        }

        int par = vetorA.length - impar;
        double porcPar = (par * 100)/ vetorA.length;
        double porcImpar = 100 - porcPar;

        System.out.print("Vetor A = ");
        for (int i=0; i< vetorA.length; i++){
            System.out.print(vetorA[i] +" ");
        }
        System.out.println();

        System.out.println("Porcentagem Pares: " +porcPar);
        System.out.println("Porcentagem impares: " +porcImpar);
    }
}

/*
 * CRIAR UM VETOR A COM 10 ELEMENTOS INTEIROS. DESENVOLVER UM PROGRAMA QUE DEFINA O PERCENTUAL
 * DE ELEMENTOS PARES E IMPARES, RESPECTIVAMENTE ARMAZENADOS NESSE VETOR.
 */