package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo:");
        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo é " +area);
    }
}


//Faça um programa que peça o raio de um circulo, calcule e mostre sua area.