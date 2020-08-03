package com.jefferson.cursojava.exercicios;

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = scan.nextInt();

        System.out.println("Qual a idade da sua mãe?");
        int idadeMae = scan.nextInt();

        int resultado = (idadeMae - idade);

        System.out.println("Sua mãe é " +resultado +" anos mais velha do que você.");
    }
}


/*
EXERCÍCIO RESOLVIDO
import java.util.Scanner;

public class J0100 {

    //Diferença de idade
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // 1) é obter a idade do nosso do usuário
        System.out.println("Digite a sua idade: ");
        int idadeUsu = in.nextInt();
        // 2) é obter a idade da mãe do nosso usuário
        System.out.println("Informe a idade da sua mãe: ");
        int idadeMae = in.nextInt();
        // 3) subtrair a idade da mãe pela idade do usuário
        int diff = idadeMae - idadeUsu;
        // 4) é imprimir o texto e substituir a tag <anos>
        System.out.printf("Minha mãe é %d anos mais velha do que eu!", diff);
    }
}
 */