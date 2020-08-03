package com.jefferson.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc02 {
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor:");
        int valor = scan.nextInt();

        if (valor >= 0){
            System.out.println("O numero é positivo.");
        } else {
            System.out.println("O numero é negativo.");
        }
    }
}

//Faça um programa que peça um valor e mostre na tela se o valor é negativo ou positivo.