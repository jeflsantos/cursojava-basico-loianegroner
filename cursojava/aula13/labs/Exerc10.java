package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius:");
        double cels = scan.nextDouble();

        double fire = cels * 1.8 + 32;

        System.out.println("A tempeatura " +cels +"C, é igual a " + fire + "F");

    }
}

/*
Faça um programa que peça a temperatura em graus Celsius, transforme e mostre a
temperatura em graus Farenheit.

 */