package mz.co.devtec.aula07.exercicios;

import java.util.Scanner;

public class Exercicio725 {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		int [] armazenaArray =  new int[3];
		int itera = 0;
		
		while (itera < 3) {
			
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
