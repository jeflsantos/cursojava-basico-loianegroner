package com.jefferson.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc04 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com uma letra:");
        String letra = scan.next();

        if (letra.length() > 1){
            System.out.println("Não é uma letra válida!");
        } else {
            switch (letra){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("Vogal"); break;
                default:
                    System.out.println("Consoante");
            }
        }


    }
}

//Faça um programa que verifique se uma letra digitada é vogal ou consoante.