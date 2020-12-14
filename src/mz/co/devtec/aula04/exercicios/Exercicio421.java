package mz.co.devtec.aula04.exercicios;

import java.util.Scanner;

public class Exercicio421 {

	public static void main(String[] args) {

// Funcao dada:  P(x) = x3 + 3x2 - 7x + 6
		
//Declaracao de variaveis
		
		int x;
		double resultado;
		
//Entrada de dados pelo teclado		
		
		Scanner entradaPorTeclado = new Scanner(System.in);		
		x = entradaPorTeclado.nextInt();

// Processamento da operacao
		
		resultado = Math.pow(x,3) + 3 * Math.pow(x,2) - 7 * x + 6;

//Saida na consola
		
		System.out.println(" o valor digitado: " +x);
		System.out.println("O resultado: " + resultado);
		
		entradaPorTeclado.close();		
	}

}
