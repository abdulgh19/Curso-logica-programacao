package mz.co.devtec.aula08;

public class DeclarandoEAdicionandoValoresNoArrayMultiDimensionalDeTamanhoFixo {

	public static void main(String[] args) {
	
//Declaracao e inicializacao de Arrays de duas dimensoes array[X][Y]. Onde X - Linhas e Y - Colunas
		
		int [] [] arrayBidimenssiocional = new int [3][4];
		
//Lina 0
		arrayBidimenssiocional[0][0] = 2;
		arrayBidimenssiocional[0][1] = 45;
		arrayBidimenssiocional[0][2] = 34;
		arrayBidimenssiocional[0][3] = 51;
		
//Lina 1
		arrayBidimenssiocional[1][0] = 23;
		arrayBidimenssiocional[1][1] = 54;
		arrayBidimenssiocional[1][2] = 65;
		arrayBidimenssiocional[1][3] = 76;
		
//Lina 2
		arrayBidimenssiocional[2][0] = 76;
		arrayBidimenssiocional[2][1] = 76;
		arrayBidimenssiocional[2][2] = 345;
		arrayBidimenssiocional[2][3] = 98765;
				
//Mesma procedimento, mas numa unica linha
		int [] [] outroArrayBidimenssional = {{2,45,34,51},{23,54,65,76},{76,76,345,98765}};

		
	}

}
