package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc09 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Firenheit:");
        double fire = scan.nextDouble();

        double cels = (5 * (fire-32) / 9);

        System.out.println("A tempeatura " +fire +"F, é igual a " + cels + "C");

    }
}

/*
Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a
temperatura em grau Celsius.
        * C=(5 * (F-32) / 9).
 */