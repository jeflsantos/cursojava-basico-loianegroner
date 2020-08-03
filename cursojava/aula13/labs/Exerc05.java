package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc05 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a quantidade de metros:");
        double metros = scan.nextDouble();

        double cm = metros * 100;

        System.out.println(metros + " m é igual a " + cm + " cmts");



    }
}


// Faça um programa que converta metros para centimetros.