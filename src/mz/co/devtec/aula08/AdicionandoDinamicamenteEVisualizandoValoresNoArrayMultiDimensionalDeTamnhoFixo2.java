package mz.co.devtec.aula08;

import java.util.Scanner;

public class AdicionandoDinamicamenteEVisualizandoValoresNoArrayMultiDimensionalDeTamnhoFixo2 {

	public static void main(String[] args) {

//Declaracao e inicializacao de Arrays de duas dimensoes array[X][Y]. Onde X - Linhas e Y - Colunas

		Scanner entradaPorTeclado = new Scanner(System.in);

		System.out.println("Informe a quantidade de linhas para o array multidimenssional de tamanho fixo");
		int linhasDoArray = entradaPorTeclado.nextInt();

		int[][] arrayBidimenssiocional = new int[linhasDoArray][];

//PERCORRENDO O ARRAY MULTIDIMENSSIONAL DE TAMANHO FIXO

		for (int linha = 0; linha < arrayBidimenssiocional.length; linha++) {
			arrayBidimenssiocional[linha] = new int[4];
		}

		for (int linha = 0; linha < arrayBidimenssiocional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidimenssiocional[linha].length; coluna++) {
				arrayBidimenssiocional[linha][coluna] = (linha + 1) + (coluna + 2);
			}
		}
		
		System.out.println("Mostrando os valores");
		for (int linha = 0; linha < arrayBidimenssiocional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidimenssiocional[linha].length; coluna++) {
				//System.out.println(arrayBidimenssiocional[linha][coluna]);
				System.out.println(" linha "+linha +" coluna " + coluna +" = " +arrayBidimenssiocional[linha][coluna]);

			}
		}
		
		entradaPorTeclado.close();

	}

}


