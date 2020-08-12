package com.jefferson.cursojava.aula24.labs;

public class Exerc06 {
    public static void main(String[] args) {

        Contato contato1 = new Contato();
        contato1.nome = "João";
        contato1.endereco = "Av Paulista, 1000";
        contato1.email = "joao@email.com";

        contato1.telefones = new String[5];
        contato1.telefones[0] = "91111-1111";
        contato1.telefones[1] = "92222-2222";
        contato1.telefones[2] = "93333-3333";
        contato1.telefones[3] = "94444-4444";
        contato1.telefones[4] = "95555-5555";

        
    }
}
