package com.jefferson.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc14 {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a segunda nota:");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;
        System.out.println("A media do aluno é de: " +media);

        if (media >= 9.0 && media <= 10){
            System.out.println("A - Aluno Aprovado.");
        } else if (media >= 7.5 && media <= 9){
            System.out.println("B - Aluno Aprovado.");
        } else if (media >= 6 && media <= 7.5){
            System.out.println("C - Aluno em Depencia.");
        } else if (media >= 4 && media <= 6){
            System.out.println("D - Aluno Reprovado.");
        } else if (media >= 0 && media <= 4){
            System.out.println("E - Aluno Reprovado.");
        }


    }
}
