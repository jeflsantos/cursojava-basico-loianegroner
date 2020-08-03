package com.jefferson.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o primeiro numero:");
        int num1 = scan.nextInt();

        System.out.println("Entre com o segundo numero:");
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("O numero 1 é maior: " +num1);
        } else {
            System.out.println("O numero 2 é maior: " +num2);
        }

    }
}

//Faça um programa que peça dois numeros e imprima o maior deles.