package com.jefferson.cursojava.apostilacaelum.labs.tiposprimitivos;

public class BalancoTrimestral {

    public static void main (String[] args){

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;

        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        System.out.println("Gastos Trimestral: "+gastosTrimestre);

        int mediaMensal = gastosTrimestre / 3;

        System.out.println("Valor da media mensal: " +mediaMensal);


    }
}


/*
 *Crie uma classe chamada BalancoTrimestral com um bloco main, como nos exemplos anteriores;
 *Dentro do main (o miolo do programa), declare uma variável inteira chamada gastosJaneiro e inicialize-a com 15000;
 *Crie também as variáveis gastosFevereiro e gastosMarco, inicializando-as com 23000 e 17000, respectivamente, utilize uma linha para cada declaração;
 *Crie uma variável chamada gastosTrimestre e inicialize-a com a soma das outras 3 variáveis:
 *int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
 *Imprima a variável gastosTrimestre.
 *Adicione código (sem alterar as linhas que já existem) na classe anterior para imprimir a média mensal de gasto,
 *criando uma variável mediaMensal junto com uma mensagem. Para isso, concatene a String com o valor, usando "Valor da média mensal = " + mediaMensal.
 */