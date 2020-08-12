package com.jefferson.cursojava.aula24.labs;

import java.util.Date;

public class Exerc04 {

    public static void main(String[] args) {

        LivroDeBiblioteca livro = new LivroDeBiblioteca();

        livro.nome = "Mastering ExtJS";
        livro.autor = "Loiane Groner";
        livro.anoLancamento = 2015;

        livro.emprestado = true;
        livro.dataEntrega = new Date();
        livro.emprestadoA = "Loiane";

        System.out.println("Nome do livro: " +livro.nome);
        System.out.println("Nome do autor: " +livro.autor);
        System.out.println("Ano de lançamento: " +livro.anoLancamento);
        System.out.println("Esse livro esta emprestado: " +livro.emprestado);
        System.out.println("Data de entrega: " +livro.dataEntrega);
        System.out.println("Emprestado a: " +livro.emprestadoA);
    }
}
