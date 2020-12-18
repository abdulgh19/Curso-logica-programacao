package mz.co.devtec.aula08;

import java.util.Scanner;

public class DeclarandoEAdicionandoEVisualizandoValoresNoArrayMultiDimensionalDeDifentesTamanhos {

	public static void main(String[] args) {

		Scanner entradaPorTeclado = new Scanner(System.in);

		
//Declarando e inicializando Arays multidimenssionais de tamanhos diferentes
		
		int [] [] arrayDeTamanhoDiferente = new int[5][];
		
		arrayDeTamanhoDiferente[0] = new int [2];
		arrayDeTamanhoDiferente[1] = new int [3];
		arrayDeTamanhoDiferente[2] = new int [4];
		arrayDeTamanhoDiferente[3] = new int [1];
		arrayDeTamanhoDiferente[4] = new int [3];
		
//Adicionando valores a arrays multidimenssionais de diferentes tamanhos

//Linha 0
		arrayDeTamanhoDiferente[0][0] = 34;
		arrayDeTamanhoDiferente[0][1] = 51;
		
//LInha 1		
		arrayDeTamanhoDiferente[1][0] = 23;
		arrayDeTamanhoDiferente[1][1] = 54;
		arrayDeTamanhoDiferente[1][2] = 65;
		
//linha 2
		arrayDeTamanhoDiferente[2][0] = 76;
		arrayDeTamanhoDiferente[2][1] = 76;
		arrayDeTamanhoDiferente[2][2] = 345;
		arrayDeTamanhoDiferente[2][3] = 98765;
		
//Linha 3	
		arrayDeTamanhoDiferente[3][0] = 15;

//Linha 4		
		arrayDeTamanhoDiferente[4][0] = 9;
		arrayDeTamanhoDiferente[4][1] = 16;
		arrayDeTamanhoDiferente[4][2] = 255;		
		
//Mesma procedimento, mas numa unica linha
		int [] [] outroArrayDeTamanhoDiferente = {{34,51},{23,54,65},{76,76,345,98765},{15},{9,16,255}};
	
		//PERCORRENDO O ARRAY MULTIDIMENSSIONAL DE TAMANHO VARIAVEL

				System.out.println("Saida do array");
				
				for (int linha = 0; linha < arrayDeTamanhoDiferente.length; linha++) {
					for (int coluna = 0; coluna < arrayDeTamanhoDiferente[linha].length; coluna++) {						
						//System.out.println(arrayDeTamanhoDiferente[linha][coluna]);
						System.out.println(" linha "+linha +" coluna " + coluna +" = " +arrayDeTamanhoDiferente[linha][coluna]);
					}
				}
				
				entradaPorTeclado.close();		
	}

}
