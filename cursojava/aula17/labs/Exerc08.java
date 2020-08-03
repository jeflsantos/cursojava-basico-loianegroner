package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        double media;
        int soma = 0;

        for (int i=0; i<5; i++){
            System.out.println("Digite um numero:");
            num = scan.nextInt();

            soma += num;
        }

        media = soma / 5;

        System.out.println("Soma: " +soma);
        System.out.println("Media: " +media);
    }

}

/*
 * FAÇA UM PROGRAMA QUE LEIA 5 NUMEROS E INFORME A SOMA E A MEDIA DOS NUMEROS.
 */