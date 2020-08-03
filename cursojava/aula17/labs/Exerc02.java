package com.jefferson.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String usuario;
        String senha;

        do {

            System.out.println("Digite seu usuario:");
            usuario = scan.next();

            System.out.println("Digite a sua senha:");
            senha = scan.next();

            if (usuario.equalsIgnoreCase(senha)){
                //infoValida = false;
                System.out.println("Senha igual ao usuario, digite novamente:");
            } else {
                infoValida = true;
                System.out.println("Usuario e senha validos.");
            }

        } while (!infoValida);
    }
}

/*
 *FAÇA UM PROGRAMA QUE LEIA UM NOME DE USUARIO E A SUA SENHA E NAO ACEITE  A SENHA IGUAL
 * AO NOME DE USUARIO, MOSTRANDO UMA MENSAGEM DE ERRO E VOLTANDO A PEDIR AS INFORMAÇÕES.
 */