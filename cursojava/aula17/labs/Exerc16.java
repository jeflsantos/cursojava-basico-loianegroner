package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc16 {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        System.out.println(primeiro);
        System.out.println(segundo);

        while (proximo <= 500){
            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
    }
}

/*
 * A SERIE DE FIBONACCI É FORMADA PELA SEQUENCIA 1,1,2,3,5,8,13,21,34,55,... FAÇA UM PROGRAMA QUE GERE A SERIE ATE
 * QUE O VALOR SEJA MAIOR OU IGUAL A 500.
 */