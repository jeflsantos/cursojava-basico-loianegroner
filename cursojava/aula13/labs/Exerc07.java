package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado:");
        double lado = scan.nextDouble();

        double area = Math.pow(lado, 2);

        System.out.println("A area do quadrado é: " +area);
        System.out.println("O dobro da area do quadrado é: " +(area * 2));


    }
}

//Faça um programa que calcule a area de um quadrado, e
// em seguida mostre o dobro desta area para o usuario.