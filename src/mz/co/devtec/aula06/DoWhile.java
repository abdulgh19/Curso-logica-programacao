package mz.co.devtec.aula06;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		int iteracao = 2;
		
		System.out.println("Digite um numero:");
		int numeroDigitado = entradaTeclado.nextInt();
		
		do  {
			
			System.out.println(numeroDigitado +" + "+ iteracao+ " = " + (numeroDigitado + iteracao));
			
			iteracao ++;
			
		} while (iteracao < numeroDigitado);
		
		System.out.println();
		System.out.println("Fim da repeticao com DO WHILE");
		
		entradaTeclado.close();
	}
}
