package com.jefferson.cursojava.aula24.labs;

import java.util.Date;

public class LivroDeBiblioteca {

    String nome;
    String autor;
    int qtdPaginas;
    int anoLancamento;
    String isbn;
    double preco;

    boolean emprestado;
    Date dataEntrega;
    String emprestadoA;
}

/*
 * USANDO O RESULTADO DO MODELO "LIVRO" COMO BASE, CRIE UMA CLASSE "LIVRODEBIBLIOTECA" QUE REPRESENTE OS DADOS BASICOS
 * DE UM LIVRO DE UMA BIBLIOTECA, QUE PODE SER EMPRESTADO A LEITORES.
 */