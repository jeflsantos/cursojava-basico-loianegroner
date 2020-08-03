package com.jefferson.cursojava.aula17;

public class LoopFor {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++){
            System.out.println(+i);
        } // FOR (INICIALIZAÇÃO; CONDIÇÃO; INCREMENTO)



        for (int i = 0, j = 10; i <= j; i++, j--){
            System.out.println("i tem o valor: " +i +" e j tem o valor: " +j);

        } // FOR PODE SER UTILIZADO COM MAIS DE UMA VARIAVEL, SENDO SEPARADO PELA VIRGULA;
    }
}
