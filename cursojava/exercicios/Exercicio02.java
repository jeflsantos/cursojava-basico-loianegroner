package com.jefferson.cursojava.exercicios;

public class Exercicio02 {

    public static void main(String[] args) {
        System.out.println("Seja bem-vindo ao meu programa!");
        System.out.println(); // --> Linha em branco

        int operacao = 90;
        int operacao1 = 8;
        int operacao2 = 30;
        int operacao3 = 9;

        System.out.println("O pruduto de 8 por 90 é igual a: " + operacao * operacao1);
        System.out.println("O quociente de 90 por 30 é igual a: " + operacao / operacao2);
        System.out.println("O quadrado de 9 é : " + operacao3 * operacao3);

    }
}
// EXERCICIO RESOLVIDO:

    /*public static void main(String[] args) {


        //        1) imprimir a frase: "Seja bem-vindo ao meu programa."
        System.out.println("Seja bem-vindo ao meu programa.");
//        2) calcular o produto de 8 por 90
        System.out.print("O produto de 8 por 90 é: ");
        System.out.println(8 * 90);
//        3) calcular o quociente 90 por 30
        System.out.println("O quociente de 90 por 30 é: " + 90 / 30);
//        4) calcular o quadrado de 9
        System.out.print("O quadrado de 9 é: ");
        System.out.print(9 * 9);
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("\n");

    }
}

/* Exercicio 02:
Agora, vamos resolver o exercício que pede: Faça um programa que imprima a frase:
"Seja bem-vindo ao meu programa!"

Em seguida, imprima uma linha em branco e na na sequência, imprima as frases e o resultado da
expressões matemáticas.

Cada frase e seu resultado devem estar na mesma linha.

"O produto de 8 por 90 é igual a:"
"O quociente de 90 por 30 é igual a:"
"O quadrado de 9 é:"

Nota(s): Em cada expressão matemática, você deve imprimir o
resultado de uma expressão na qual o compilador é quem resolveu.
Ou seja, é para concatenar a frase sugerida no enunciado com o resultado.
 */