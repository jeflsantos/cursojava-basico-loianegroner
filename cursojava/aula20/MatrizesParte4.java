package com.jefferson.cursojava.aula20;

import java.util.Scanner;

public class MatrizesParte4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com o numero de pessaos que serão entrevistadas:");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i=0; i< nomesFilhos.length; i++){

            System.out.println("Entre com a quantidade de filhos:");
            int qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j=0; j<nomesFilhos[i].length; j++){
                System.out.println("Digite o nome do filho: " +(j+1));
                nomesFilhos[i][j] = scan.next();


            }
        }

        for (int i=0; i< nomesFilhos.length; i++){
            System.out.println("Pessoa " +i +" tem " + nomesFilhos[i].length +" filhos");
            for (int j=0; j<nomesFilhos[i].length; j++){
                System.out.println(nomesFilhos[i][j]);
            }
        }

    }
}

/*
 * Ex: Matrizes Irregulares
 *
 * ESCREVA UM PROGRAMA PARA GUARDAR DADOS DE UMA PESQUISA FEITA COM UMA AMOSTRA DE PESSOAS DA AVENIDA MAIS MOVIMENTADA DA CIDADE ONDE VOCE MORA.
 * A PESQUISA CONSISTE EM PERGUNTAR AO CIDADAO A QUANTIDADE DE FILHOS E O NOME DE CADA FILHO. GUARDE ESSAS INFORMAÇÕES EM UMA MATRIZ DE FORMA QUE CADA PESSOA
 * ENTREVISTADA OCUPE SOMENTE O ESPAÇO NECESSARIO NA MEMORIA PARA GUARDAR OS NOMES DOS FILHOS.
 * IMPRIMA A QUANTIDADE DE PESSOAS ENTREVISTADAS, A QUANTIDADE DE FILHOS DE CADA ENTREVISTADO E OS RESPECTIVOS NOMES DOS FILHOS.
 */