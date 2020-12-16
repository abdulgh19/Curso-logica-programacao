package mz.co.devtec.aula06;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		int numeroDigitado = entradaTeclado.nextInt();

//Ciclo de repeticao For
		for (int iteracao = 0; iteracao < numeroDigitado; iteracao ++) {
			
			System.out.println(numeroDigitado + iteracao);
			
		}	//Fim do ciclo de repeticao
		
		System.out.println();
		System.out.println("Fim da repeticao com FOR");
		
		entradaTeclado.close();	

	}

}
