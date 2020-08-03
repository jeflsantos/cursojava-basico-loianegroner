package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;


        do {
            System.out.println("Digite seu nome:");
            nome = scan.next();

            if (nome.length() >= 3){
            infoValidas = true;
            } else {
                System.out.println("O nome precisa de no minimo 3 caracteres!");
            }

        } while (!infoValidas);

    infoValidas = false;

        do {
            System.out.println("Digite a sua idade:");
            idade = scan.nextInt();

            if (idade >= 0 && idade <= 150 ){
                infoValidas = true;
            } else {
                System.out.println("A idade precisa ser entre 0 e 150!");
            }

        } while (!infoValidas);

        infoValidas = false;

        do {
            System.out.println("Digite seu salario:");
            salario = scan.nextDouble();

            if (salario >= 0){
                infoValidas = true;
            } else {
                System.out.println("O salario precisa ser maior que zero!");
            }

        } while (!infoValidas);

        infoValidas = false;

        do {
            System.out.println("Digite seu genero:");
            sexo = scan.next();

            if (sexo.equalsIgnoreCase("f") ||
                    sexo.equalsIgnoreCase("m")){
                infoValidas = true;
            } else {
                System.out.println("O genero precisa ser 'M' ou 'F'!");
            }

        } while (!infoValidas);

        infoValidas = false;

        do {
            System.out.println("Digite seu Estado Civil:");
            estadoCivil = scan.next();

            if (estadoCivil.equalsIgnoreCase("s") ||
                    estadoCivil.equalsIgnoreCase("c") ||
                    estadoCivil.equalsIgnoreCase("v") ||
                    estadoCivil.equalsIgnoreCase("d")){
                infoValidas = true;
            } else {
                System.out.println("O gEstado civil precisa ser 'S', 'C', 'V', 'D';");
            }

        } while (!infoValidas);

        System.out.println("As seguintes informações foram coletadas:");
        System.out.println();
        System.out.println("Nome: " +nome);
        System.out.println("Sdade: " +idade);
        System.out.println("salario: " +salario);
        System.out.println("Genero: " +sexo);
        System.out.println("Estado civil: " +estadoCivil);
    }
}

/*
 * FAÇA UM PROGRAMA QUE LEIA E VALIDE AS SEGUINTES INFORMAÇÕES:
 * A. NOME MAIOR DO QUE 3 CARACTERES;
 * B. IDADE ENTRE 0 E 150;
 * C. SALARIO MAIOR DO QUE ZERO;
 * D. SEXO "F" OU "M";
 * e. ESTADO CIVIL "S";"C";"V";"D";
 */