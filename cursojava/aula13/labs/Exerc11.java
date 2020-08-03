package com.jefferson.cursojava.aula13.labs;


import java.util.Scanner;

public class Exerc11 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo numero inteiro:");
        int num2 = scan.nextInt();

        System.out.println("Digite o numero real:");
        double real1 = scan.nextDouble();

        int resultado1 = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + real1;
        double resultado3 = Math.pow(real1, 3);

        System.out.println("Resultado 1: " +resultado1);
        System.out.println("Resultado 2: " +resultado2);
        System.out.println("Resultado 3: " +resultado3);
    }
}

/*
Faça um programa que peça 2 numeros inteiros e um real.
Calcule e mostre:
a. o produto do dobro do primeiro com metade do segundo;
b. a soma do triplo do primeiro com o terceiro;
c. o terceiro elevado ao cubo;
 */