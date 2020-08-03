package com.jefferson.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = scan.nextLine();

        System.out.println("Qual sua idade?");
        int idade = scan.nextInt();

        System.out.println("Qual sua cidade?");
        String cidade = scan.next();

        System.out.print("Ola. Meu nome é "+nome);
        System.out.print(", sou natural de "+cidade);
        System.out.print(", tenho "+idade);
        System.out.print(" anos, e estou aprendendo a programar.");
    }
}

/*
EXERCÍCIO
Faça um programa que peça o nome, idade e cidade de nascimento do usuário.
Em seguida, imprima a frase abaixo trocando as tag’s <nome>, <idade>, <cidade>, pelo nome, idade e cidade informado pelo usuário.

"Ola. Meu nome é <nome>, sou natural de <cidade>, tenho <idade> anos e estou aprendendo a programar."
 */

/*
EXERCÍCIO RESOLVIDO
import java.util.Scanner;

public class J0011 {

    //Lendo e imprimindo textos e números
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 1) pedir pro usuário informar:
        //1) Nome
        System.out.println("Digite o seu nome: ");
        String nome = in.nextLine();
        //2) Idade
        System.out.println("Informe a sua idade: ");
        int idade = in.nextInt();
        //3) Cidade
        System.out.println("Informe a sua cidade de nascimento: ");
        String cidade = in.next();

        // 2) armazenar as informações do usuário em variáveis
        // 3) alterar a frase do enunciado
        // Ola. Meu nome é <nome>, sou natural de <cidade>,
        //  tenho <idade> anos, e estou aprendendo a programar.
        System.out.print("Ola. Meu nome é "+nome);
        System.out.print(", sou natural de "+cidade);
        System.out.print(", tenho "+idade);
        System.out.print(" anos, e estou aprendendo a programar.");
    }
}
 */