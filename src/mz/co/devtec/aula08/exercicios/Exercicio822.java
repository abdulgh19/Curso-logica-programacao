package mz.co.devtec.aula08.exercicios;

import java.util.Scanner;

public class Exercicio822 {

	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);
		
		int [][] array = new int [4][4];
		
		for (int linha = 0; linha < array.length; linha++) {
			for (int coluna = 0; coluna < array[linha].length; coluna++) {
				
				if ((linha == 0 & coluna!=1) || ((linha == 1 & coluna != 0) && (linha == 1 & coluna != 3)) || ((linha == 2 & coluna != 0) && (linha == 2 & coluna != 1) && (linha == 2 & coluna != 2)) || ((linha == 3 & coluna != 2) && (linha == 3 & coluna != 3)) ) {
					
					System.out.println("intoduza o valor do array na posicao ["+linha+"]["+coluna+"]");
					array[linha][coluna] = entradaPorTeclado.nextInt();	
				}
			}
		}
			
		for (int linha = 0; linha < array.length; linha++) {
			for (int coluna = 0; coluna < array.length; coluna++) {	
				
				if ((linha == 0 & coluna!=1) || ((linha == 1 & coluna != 0) && (linha == 1 & coluna != 3)) || ((linha == 2 & coluna != 0) && (linha == 2 & coluna != 1) && (linha == 2 & coluna != 2)) || ((linha == 3 & coluna != 2) && (linha == 3 & coluna != 3)) ) {
				
				System.out.println("["+linha+"]["+coluna+"] = " +array[linha][coluna]);					
				}
				
			}
		}
 
		entradaPorTeclado.close();
	}
}
