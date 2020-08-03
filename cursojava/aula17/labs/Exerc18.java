package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc18 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System. in);

        System.out.println("Digite um numero inteiro:");
        int num = scan.nextInt();

        boolean primo = true;

        for (int i=2; i<num; i++){
            if (num % i == 0){
                System.out.println("Não é numero primo -- Divisivel por: " +i);
                primo = false;
            }
        }

        if (primo){
            System.out.println("É numero primo!");
        }
    }
}

/*
 * FAÇA UM PROGRAMA QUE PEÇA UM NUMERO INTEIRO E DETERMINE SE ELE É OU NÃO UM NUMERO PRIMO.
 * UM NUMERO PRIMO É AQUELE QUE É DIVISIVEL SOMENTE POR ELE MESMO OU POR UM.
 */