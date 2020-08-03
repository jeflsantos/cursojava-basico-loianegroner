package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double popA, popB, taxaA, taxaB;
        boolean valido = false;
        int i = 0;

    do {
        System.out.println("Entre com a População A:");
        popA = scan.nextDouble();

        if (popA > 0){
            valido = true;
        } else {
            System.out.println("População A precisa ser maior que 0!");
        }

    } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a População B:");
            popB = scan.nextDouble();

            if (popB > 0){
                valido = true;
            } else {
                System.out.println("População B precisa ser maior que 0!");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a taxa de crescimento da População A:");
            taxaA = scan.nextDouble();

            if (taxaA > 0){
                valido = true;
            } else {
                System.out.println("A taxa de crescimento População A precisa ser maior que 0!");
            }

        } while (!valido);

        valido = false;

        do {
            System.out.println("Entre com a taxa de crescimento População B:");
            taxaB = scan.nextDouble();

            if (taxaB > 0){
                valido = true;
            } else {
                System.out.println("A taxa de crescimento População B precisa ser maior que 0!");
            }

        } while (!valido);

        while (popA <= popB){
            popA += (popA/100) *taxaA;
            popB += (popB/100) *taxaB;
            i++;
        }

        System.out.println("População A: " +popA);
        System.out.println("População B: " +popB);
        System.out.println("Qntd de anos: " +i);

    }
}

/*
 * ALTERE O PROGRAMA ANTERIOR PERMITINDO AO USUARIO INFORMAR AS POPULAÇÕES E AS TAXAS DE CRESCIMENTO INICIAIS.
 * VALIDE A ENTRADA E PERMITA REPETIR A OPERAÇÃO.
 */