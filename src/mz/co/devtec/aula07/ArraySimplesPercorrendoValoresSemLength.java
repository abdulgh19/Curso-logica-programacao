package mz.co.devtec.aula07;

import java.util.Scanner;

public class ArraySimplesPercorrendoValoresSemLength {

	public static void main(String[] args) {

		Scanner entradaPorTeclado = new Scanner(System.in);
				
		int [] arrayPorPercorrer = new int [4];

		for (int posicaoNoArray = 0; posicaoNoArray < 4; posicaoNoArray++) {
			
			System.out.println("Digite o valor do array na posicao " + posicaoNoArray);
			arrayPorPercorrer[posicaoNoArray] = entradaPorTeclado.nextInt();			
		}
				
		for (int posicaoNoArray = 0; posicaoNoArray < 4; posicaoNoArray++) {
			
			System.out.println("Array ["+posicaoNoArray+"] = " +arrayPorPercorrer[posicaoNoArray]);			
		}
		entradaPorTeclado.close();
	}
}
