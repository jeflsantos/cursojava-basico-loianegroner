package com.jefferson.cursojava.aula11;

public class CuriosidadeInt {

    public static void main(String[] args) {
        int var1 = 2147483647;
        int var2 = 1;

        System.out.println(var1 + var2);

        // O resultado será "-2147483648", pq a numeração é como se fosse uma roleta. Pois o proximo numero
        //dps que eu exceto o valor da roleta ele volta para o menor valor limite da variavel inteiro.


    }
}
