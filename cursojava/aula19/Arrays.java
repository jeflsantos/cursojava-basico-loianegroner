package com.jefferson.cursojava.aula19;

public class Arrays {
    public static void main(String[] args) {

       /* double tempDia0001 = 31.3;
        double tempDia0002 = 32;
        double tempDia0003 = 33.7;
        double tempDia0004 = 34;
        double tempDia0005 = 33.1;
        */

        double[] temperaturas = new double[365];
        temperaturas[0] = 31.3;
        temperaturas[1] = 32;
        temperaturas[2] = 33.7;
        temperaturas[3] = 34;
        temperaturas[4] = 31.1;

        System.out.println("O valor da temperatura do dia 3 é: " +temperaturas[2]);

        System.out.println("O tamanho do array: " +temperaturas.length);

        for (int i=0; i< temperaturas.length; i++){
            System.out.println("O valor da temperatura do dia " +(i+1) +" é: " +temperaturas[i]);
        }

        //FOR "MELHORADO:

        for (double temp : temperaturas){
            System.out.println(temp);
        }

    }
}
