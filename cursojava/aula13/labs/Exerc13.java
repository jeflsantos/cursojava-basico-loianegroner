package com.jefferson.cursojava.aula13.labs;

import java.util.Scanner;

public class Exerc13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite quanto voce ganha por hora:");
        double valorHora = scan.nextDouble();

        System.out.println("Digite quantas horas voce trabalha no mes:");
        double horasMensais = scan.nextDouble();

        double salarioBruto = valorHora * horasMensais;
        double inss = (salarioBruto /100) * 8;
        double sindicato = (salarioBruto /100) * 5;
        double ir = (salarioBruto /100) * 11;
        double totalDescontos = inss + sindicato +ir;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O seu salario bruto é de : " + salarioBruto);
        System.out.println("INSS: " +inss);
        System.out.println("Sindicato: " +sindicato);
        System.out.println("Imposto de Renda: " +ir);
        System.out.println("Total de Descontos: " +totalDescontos);
        System.out.println("Salario Liquido: " +salarioLiquido);


    }
}

/*
Faça um programa que pergunte quanto voce ganha por hora e o numero de horas trabalhadas no mes.
Calcule e mostre o total de seu salrio referido no mes, sabendo-se que sao descontados 11%
para o imposto de renda, 8% para o inss, e 5% para o sindicato, faça um programa que nos dê:

* salario bruto;
*desconto do inss;
*desconto sindicato;
*salario liquido;
*calcule os descontos e o salario liquido, conforme a tabela abaixo:

+ salario bruto :R$ - IR (11%) : R$ - INSS (8%) : - sindicato (5%) : R$ = salario liquido : R$
 */