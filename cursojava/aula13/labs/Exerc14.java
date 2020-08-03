package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc14 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do arquivo:");
        double tamArquivo = scan.nextDouble();

        System.out.println("Digite a velocidade da internet:");
        double velInternet = scan.nextDouble();

        double tempo = tamArquivo / velInternet;

        System.out.println("O tempo de download é de: " +tempo);
    }
}

/*
Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de internet
(em Mbps), calcule e informe o tepo aproximado de download do arquivo usando este link (em minutos).
 */