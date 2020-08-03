package com.jefferson.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc07 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo numero:");
        int num2 = scan.nextInt();

        System.out.println("Digite o terceiro numero:");
        int num3 = scan.nextInt();

        if (num1 >= num2 && num1 >= num3){
            System.out.println("O primeiro numero é maior: " +num1);
        } else if (num2 >= num1 && num2 >= num3){
            System.out.println("O segundo numero é maior: " +num2);
        } else if (num3 >= num1 && num3 >= num2){
            System.out.println("O terceiro numero é maior: " +num3);
        }

        if (num1 <= num2 && num1 <= num3){
            System.out.println("O primeiro numero é menor: " +num1);
        } else if (num2 <= num1 && num2 <= num3){
            System.out.println("O segundo numero é menor: " +num2);
        } else if (num3 <= num1 && num3 <= num2){
            System.out.println("O terceiro numero é menor: " +num3);
        }


    }
}

/*
Faça um programa que leia tres numeros e mostre o maior e o menor deles.
 */