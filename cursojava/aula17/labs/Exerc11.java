package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Entre com o primeiro numero:");
        num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero:");
        num2 = scan.nextInt();

        int soma = 0;

        for (int i=num1; i<=num2; i++){
            soma += i;
        }

        System.out.println(soma);
    }
}

/*
 * ALTERE O PROGRAMA ANTERIOR PARA MOSTRAR AS SOMAS DOS NUMEROS;
 */