package mz.co.devtec.aula06;

import java.util.Scanner;

public class WhileParte1 {
	
	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		int iteracao = 0;
		
		System.out.println("Digite um numero:");
		int numeroDigitado = entradaTeclado.nextInt();
		
		while (iteracao < numeroDigitado) {
			
			System.out.println(numeroDigitado + iteracao);
			
			iteracao ++;
		}
		
		System.out.println();
		System.out.println("Fim da repeticao com WHILE");
		
		entradaTeclado.close();
	}
}
