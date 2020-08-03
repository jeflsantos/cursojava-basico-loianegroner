package com.jefferson.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc10 {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o turno em que voce estuda: (M - Matutino; V - Vespertino; N - Noturno)");
        String input = scan.next();


        if (input.equalsIgnoreCase("m")){
            System.out.println("Bom dia.");
        } else if (input.equalsIgnoreCase("v")){
            System.out.println("Boa tarde.");
        } else if (input.equalsIgnoreCase("n")){
            System.out.println("Boa noite.");
        } else {
            System.out.println("Valor inválido.");
        }


    }
}
