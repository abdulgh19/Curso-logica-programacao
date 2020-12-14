package mz.co.devtec.aula04.exercicios;

import java.util.Scanner;

public class Exercicio423 {

	public static void main(String[] args) {

		Scanner entradaPorTeclado = new Scanner(System.in);		

// Funcao dada:  F(x) = ax^2 - bx + c 

		
//Declaracao de variaveis
		
		double a, b, c, delta, x1, x2;
		
//Entrada de dados pelo teclado		
		
		System.out.println("Informe o valor de 'a'");
		a = entradaPorTeclado.nextDouble();
		
		System.out.println("Informe o valor de 'b'");
		b = entradaPorTeclado.nextDouble();
		
		System.out.println("Informe o valor de 'c'");
		c = entradaPorTeclado.nextDouble();

// Processamento da operacao
		
		delta = b*b - 4*a+c;	//Outra forma de calculo de delta seria: delta = Math.pow(b, 2) - 4*a*c;
		
		x1 = (-b + Math.sqrt(delta))/2*a;
		x2 = (-b - Math.sqrt(delta))/2*a;

//Saida na consola
		
		System.out.println("Dados: A = " +a+ " , B = " +b+ " e C = "+c);
		System.out.println("X1 = " +x1+ " e X2 = " +x2);
		
		entradaPorTeclado.close();		
	}

}
