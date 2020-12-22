package mz.co.devtec.aula09;

import java.util.Scanner;

public class FuncoesComOperadores {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		int valor1, valor2;
		
		System.out.println("digite o valor 1");
		valor1 = entradaPorTeclado.nextInt();
		
		
		System.out.println("digite o valor 2");		
		valor2 = entradaPorTeclado.nextInt();
		
		System.out.println("A soma: "+	soma(valor1, valor2));	
		
		
		System.out.println("A media: " + media(valor1, valor2, 2));
		
		
		entradaPorTeclado.close();

	}
	
	static int soma(int a, int b) {
		return a+b;
	};
	
	static int media(int a, int b, int c) {
		return (a+b)/c;
	};

}
