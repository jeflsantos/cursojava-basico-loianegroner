package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a base:");
        int base = scan.nextInt();

        System.out.println("Entre com a potencia:");
        int pot = scan.nextInt();

        int resultado = base;

        for (int i=1; i<pot; i++){
            resultado *= base;
        }

        System.out.println("Resultado: " +resultado);
    }
}

/*
 * FAÇA UM PROGRAMA QUE PEÇA DOIS NUMEROS, BASE E EXPOENTE, CALCULE E MOSTRE O PRIMEIRO NUMERO ELEVADO AO SEGUNDO NUMERO.
 * NÃO UTILIZE A FUNÇÃO DE POTENCIA DA LINGUAGEM.
 */