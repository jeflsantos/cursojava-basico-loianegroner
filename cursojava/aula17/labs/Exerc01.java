package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Informe uma nota:");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10){
                notaValida = true;
                System.out.println("O valor digitado foi: " +nota);
            } else {
                System.out.println("O valor digitado é inválido, digite novamente:");
        }
        } while (!notaValida);


        }
    }


/*
 * FAÇA UM PROGRAMA QUE UMA PEÇA UMA NOTA, ENTRE ZERO E DEZ. MOSTRE UMA MENSAGEM CASO O VALOR SEJA INVALIDO
 * E CONTINUE PEDINDO ATE QUE O USUARIO INFORME UM VALOR VALIDO.
 */