package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int numero01 = scan.nextInt();

        System.out.println("Digite o segundo numero:");
        int numero02 = scan.nextInt();

        System.out.println("A soma dos dois numeros é igual a: " + (numero01 + numero02));


    }
}


//Faça um progrma que peça dois numeros e imprima a soma.