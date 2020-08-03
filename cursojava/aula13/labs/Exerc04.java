package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota do primeiro bimestre:");
        double bim1 = scan.nextDouble();

        System.out.println("Digite a nota do segundo bimestre:");
        double bim2 = scan.nextDouble();

        System.out.println("Digite a nota do terceiro bimestre:");
        double bim3 = scan.nextDouble();

        System.out.println("Digite a nota do quarto bimestre:");
        double bim4 = scan.nextDouble();

        double media = (bim1 + bim2 + bim3 + bim4) /4;

        System.out.println("A media de nota dos 4 bimestres é de: " +media);



    }
}


//Faça um programa que peça as 4 notas bimestrais e mostre a media.