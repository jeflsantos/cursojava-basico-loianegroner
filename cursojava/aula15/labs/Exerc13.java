package com.jefferson.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc13 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um dia da semana (1-7):");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sabado");
            default -> System.out.println("Dia de semana inválido!");
        }

    }
}
