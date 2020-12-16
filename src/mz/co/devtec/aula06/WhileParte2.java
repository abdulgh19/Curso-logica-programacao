package mz.co.devtec.aula06;

import java.util.Scanner;

public class WhileParte2 {

	public static void main(String[] args) {

		Scanner entradaTeclado = new Scanner(System.in);

		String senhaDefinida, senhaDigitada;

		senhaDefinida = "clp2020";
		
		System.out.println("Digite a senha de acesso!");
		senhaDigitada =  entradaTeclado.nextLine();
		
		while (!senhaDigitada.equals(senhaDefinida)) {
			
			System.out.println("Senha incorrecta. Digite novamente");
			senhaDigitada =  entradaTeclado.nextLine();			
		} 			
			System.out.println("ACESSO PERMITIDO!");
			System.out.println("BEM VINDO AO CURSO DE LÓGICA DE PROGRAMAÇÃO.");
				
		entradaTeclado.close();
	}
}
