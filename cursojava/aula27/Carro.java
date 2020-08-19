package com.jefferson.cursojava.aula27;

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

    double calcularCombustivel(double km){

        double qtdCombustivel = km/consumocombustivel;

        return qtdCombustivel;
    }
}