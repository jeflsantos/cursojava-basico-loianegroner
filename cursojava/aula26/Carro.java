package com.jefferson.cursojava.aula26;

public class Carro {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumocombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é: " +capCombustivel * consumocombustivel +" km.");
    }

    double obterAutonomia(){

        System.out.println("Metodo obterAutonomia foi chamado!");

        return capCombustivel * consumocombustivel;

   }
}
