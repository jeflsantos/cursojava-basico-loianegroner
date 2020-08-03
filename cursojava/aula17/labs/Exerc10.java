package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1, num2;

        System.out.println("Entre com primeiro numero:");
        num1 = scan.nextInt();

        System.out.println("Entre com segundo numero:");
        num2 = scan.nextInt();

        for (int i=num1; i<=num2; i++){
            System.out.println(i);
        }

    }
}

/*
 * FAÇA UM PROGRAMA QUE RECEBA DOIS NUMEROS INTEIROS E GERE OS NUMEROS INTEIROS QUE ESTAO NO INTERVALO
 * COMPREENDIDO POR ELES.
 */