package mz.co.devtec.aula05.exercicios;

import java.util.Scanner;

public class Exercicio521 {

	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		String senhaDefinida, senhaDigitada;
		
		senhaDefinida = "clp2020";
		
		System.out.println("Digite a senha de acesso!");
		senhaDigitada =  entradaTeclado.nextLine();
		
		if (senhaDigitada.equals(senhaDefinida)) {
			
			System.out.println("BEM VINDO AO CURSO DE LÓGICA DE PROGRAMAÇÃO.");
			
		} else {
			
			System.out.println("ACESSO NEGADO!");

		}
				
		entradaTeclado.close();
	}

}