package mz.co.devtec.aula07.exercicios;

import java.util.Scanner;

public class Exercicio726 {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		System.out.println("Informe o tamanho do array");
		
		int tamanhoArray = entradaPorTeclado.nextInt();
		
		int [] armazenaArray =  new int[tamanhoArray];
		
		int itera = 0;
		
		while (itera < tamanhoArray) {
			
			System.out.println("Informe um  numero inteiro: ");
			
			armazenaArray[itera] = entradaPorTeclado.nextInt();
			
			itera ++;		
		}
		
		for (int i = 0; i < armazenaArray.length; i++) {
			System.out.println("Elemento da posicao/indice  " +i+ " eh " +armazenaArray[i]);
		}		

		entradaPorTeclado.close();
	}

}
