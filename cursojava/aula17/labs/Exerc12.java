package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero para gerar a tabuada:");
        int num = scan.nextInt();

        System.out.println("Tabuada de " +num +":");

        for (int i=0; i<=10; i++){
            System.out.println(num +" x " +i +" = " +(num*i));
        }



    }
}

/*
 * DESENVOLVA UM GERADOR DE TABUADA, CAPAZ DE GERAR A TABUADA DE QUALQUER NUMERO INTEIRO ENTRE 1 A 10.
 * O USUARIO DEVE INFORMAR DE QUAL NUMERO ELE DESEJA VER A TABUADA. A SAIDA DEVE SER CONFORME O EXEMPLO ABAIXO:
 *
 *  ° TABUADA DE 5:
 *  ° 5X1 = 5
 *  ° 5X2 = 10
 *  ° 5X3 = 15
 *  ...
 *  ° 5X10 = 50
 */