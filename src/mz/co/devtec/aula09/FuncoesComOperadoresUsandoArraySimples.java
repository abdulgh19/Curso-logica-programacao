package mz.co.devtec.aula09;

import java.util.Scanner;

public class FuncoesComOperadoresUsandoArraySimples {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		int [] valores = new int [3];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite o valor da posicao " +i);
			valores[i] = entradaPorTeclado.nextInt();
		}
		
		System.out.println(	soma(valores[0], valores[2]));	
		
		System.out.println(media(valores[0], valores[1], valores[2], valores.length));
		
		
		entradaPorTeclado.close();

	}
	
	static int soma(int a, int b) {
		return a+b;
	};
	
	static int media(int a, int b, int c, int d) {
		return (a+b+c)/d;
	};
	
	

}
