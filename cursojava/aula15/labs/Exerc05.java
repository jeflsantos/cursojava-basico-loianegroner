package com.jefferson.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc05 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a primeira nota");
    double nota1 = scan.nextDouble();

    System.out.println("Digite a segunda nota");
    double nota2 = scan.nextDouble();

    double media = (nota1 + nota2) / 2;



    if (media == 10){
        System.out.println("Aluno Aprovado com Distinção");
    } else if (media >= 7){
        System.out.println("Aluno Aprovado");
    } else {
        System.out.println("Aluno Reprovado");
    }


    }
}

//Faça um programa para a leitura de duas notas parciais de um aluno.
//O programa deve calcular a media alcançada por aluno e apresentar:
//* A mensagem "Aprovado", se a media for maior ou igual a sete;
//* A mensagem "Reprovado", se a media for menor do que sete;
//* A mensagem "Aprovado com Distinção", se a media for igual a dez;