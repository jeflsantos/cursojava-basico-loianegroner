package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero:");
        int numero = scan.nextInt();
        System.out.println("O numero informado foi: " +numero);
    }
}



//Faça um programa que peça um numero e entao mostre a mensagem "O numero informado foi [numero]".