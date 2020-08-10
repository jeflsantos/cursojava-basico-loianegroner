package com.jefferson.cursojava.aula21;

import java.util.Random;

public class ForEach {
    public static void main(String[] args) {

        int[] notas = new int[10];

        Random random = new Random();

        for (int i=0; i< notas.length; i++){
            notas[i] = random.nextInt(10);
        }

        for (int i=0; i< notas.length; i++){
            System.out.print(notas[i] +" ");
        }

        System.out.println();
        System.out.println("USANDO O FOR EACH:");


        for (int nota : notas){
            System.out.print(nota +" ");

            /*
             *          É o mesmo que:
             *
             *          for (int i=0; i< notas.length; i++){
             *          int nota = notas[i];
             *          System.out.println(nota);
             *          }
             */
        }

    }
}
