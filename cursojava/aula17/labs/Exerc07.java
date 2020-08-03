package com.jefferson.cursojava.aula17.labs;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.Scanner;

public class Exerc07 {

    public static void main(String[] args) {

        int num;
        int maior = Integer.MIN_VALUE;

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i<5; i++){

            System.out.println("Entre com um numero:");
            num = scan.nextInt();

            if (num > maior){
                maior = num;
            }
        }

        System.out.println("O maior numero é: " +maior);
    }
}

/*
 * FAÇA UM PROGRAMA QUE LEIA 5 NUMEROS E INFORME O MAIOR NUMERO.
 */