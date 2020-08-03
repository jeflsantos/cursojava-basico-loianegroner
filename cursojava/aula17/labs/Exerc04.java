package com.jefferson.cursojava.aula17.labs;

public class Exerc04 {
    public static void main(String[] args) {

        int popA = 80000;
        int popB = 200000;
        int i = 0;

        while (popA <= popB){
            popA += (popA/100) *3;
            popB += (popB/100) *1.5;
            i++;
        }

        System.out.println("População A: " +popA);
        System.out.println("População B: " +popB);
        System.out.println("Qntd de anos: " +i);

    }
}

/*
 * SUPONDO QUE A POPULAÇÃO DE UM PAIS 'A' SEJA DE 80000 HABITANTES COM UMA TAXA ANUAL DE CRESCIMENTO DE 3%
 * E QUE A POPULAÇÃO 'B' SEJA DE 200000 HABITANTES COM UMA TAXA DE CRESCIMENTO DE 1.5%. FAÇA UM PROGRAMA
 * QUE CALCULE E ESCREVA O NUMERO DE ANOS NECESSARIO PARA QUE A POPULAÇÃO 'A' ULTRAPASSE OU IGUALE A POPULAÇÃO
 * 'B', MANTIDAS AS TAXAS DE CRESCIMENTO.
 */