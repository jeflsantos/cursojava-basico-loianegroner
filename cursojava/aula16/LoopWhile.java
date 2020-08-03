package com.jefferson.cursojava.aula16;

public class LoopWhile {

    public static void main(String[] args) {

        int i = 1; // variavel "i" usada para contagem;
        int max = 10;

        System.out.println("Contando ate: " +max);

        while (i <= max) {
            System.out.println("Valor de i: " + i);
            i++; // i = i+1; ou i +=1;
        }


    }
}
