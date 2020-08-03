package com.jefferson.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc03 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digito uma letra: (M ou F)");
        String input = scan.next();

        if (input.equalsIgnoreCase("f")){
            System.out.println("Feminino");
        } else if (input.equalsIgnoreCase("m")){
            System.out.println("Masculino");
        } else {
            System.out.println("Sexo invalido.");
        }



    }
}

//Faça um programa que verifique se uma letra é "F" ou "M".
//Conforme a letra escrever: F - feminino, M - masculino, Sexo invalido.