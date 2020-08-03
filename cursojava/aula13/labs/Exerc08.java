package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc08 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto voce ganha por hora:");
        double salarioHora = scan.nextDouble();

        System.out.println("Digite quantas horas voce trabalha no mes:");
        double horasMensais = scan.nextDouble();

        System.out.println("O seu salario mensal é de : " + (salarioHora * horasMensais));



    }
}

//Faça um programa que pergunte quanto voce ganha por hora e o numero de horas trabalhadas no mes.
//Calcule e mostre o total do seu salario no referido mes.