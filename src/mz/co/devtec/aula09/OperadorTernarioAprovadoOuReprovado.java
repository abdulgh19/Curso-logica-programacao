package mz.co.devtec.aula09;

import java.util.Scanner;

public class OperadorTernarioAprovadoOuReprovado {

	public static void main(String[] args) {
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		System.out.println("Digite a nota do teste 1:");		
		int teste1 = entradaPorTeclado.nextInt();
		
		System.out.println("Digite a nota do teste 2:");		
		int teste2 = entradaPorTeclado.nextInt();
		
		int media = (teste1 + teste2)/2;
		
		System.out.println(media >= 10 ? "Aprovado!" : "Reprovado");			

		entradaPorTeclado.close();
	}

}
