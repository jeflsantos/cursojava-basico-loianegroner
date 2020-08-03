package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc15 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o n-ésimo termo da serie de Fibonacci:");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        for (int i=3; i<=n; i++){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }

    }
}

/*
 * A SERIE DE FIBONACCI É FORMADA PELA SEQUENCIA 1,1,2,3,5,8,13,21,34,55,... FAÇA UM PROGRAMA CAPAZ DE GERAR ATE O n-ESIMO TERMO.
 */