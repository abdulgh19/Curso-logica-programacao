package mz.co.devtec.aula09;

import java.util.Scanner;

public class OperadorTernarioParOuImpar {

	public static void main(String[] args) {
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		
		int numeroDigitado = entradaPorTeclado.nextInt();
		
		System.out.println(numeroDigitado % 2 == 0 ? "Numero Par" : "Numero Impar");			

		entradaPorTeclado.close();
	}

}
