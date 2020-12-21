package mz.co.devtec.aula08.exercicios;

public class Exercicio821 {

	public static void main(String[] args) {
			
//PERCORRENDO O ARRAY MULTIDIMENSSIONAL DE TAMANHO FIXO

//declaracao e inicializacao do array com 3 linhas para ele
		int [][] testearray = new int [3][];

//Para cada linha (i) do array, crie outro array de 4. Que corresponde a 4 colunas na linha i do array
		for (int i = 0; i < testearray.length; i++) {
			testearray[i] = new int[4];
		}

//Agora para cada linha i do array, preencha a coluna com um valor que coresponda ao resultado da oprecao '(i+1) + j'
		for (int i = 0; i < testearray.length; i++) {
			for (int j = 0; j < testearray[i].length; j++) {
				testearray[i][j]= (i+1) + j;
			}
			
		}
//Mostra na saida os valores armazenados nas 3X4 posicoes do array
		
		for (int i = 0; i < testearray.length; i++) {
			for (int j = 0; j < testearray[i].length; j++) {
				System.out.println(+testearray[i][j]);

			}
		}

		
	}

}
