package mz.co.devtec.aula07;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ArraySimplesAdicionandoValores {

	public static void main(String[] args) {

//Declarando e inicializando um Array
		
		int [] arrayDeInteiros = new int[5];
		
		String [] ArrayDeStrings = new String[2];
		
//Adicionando valores num array simples
		 
		//Nome do Array - arrayDeInteiros	
		arrayDeInteiros[0] = 38;
		arrayDeInteiros[1] = 7;
		arrayDeInteiros[2] = 10;
		arrayDeInteiros[3] = 345;
		arrayDeInteiros[6] = 22;
		
		//Nome do Array - arrayDeInteiros
		ArrayDeStrings[0] = "valor a ser guardado na primeira posicao";
		ArrayDeStrings[1] = "valor a ser guardado na segunda posicao";
		ArrayDeStrings[2] = "Esta posicao nao existe no nosso vector";
		ArrayDeStrings[3] = "Esta tambem nao existe porque o vector tem apenas 2 posicoes";
		
//Declarando, inicializando e adicionando valores num array
		
		double [] arrayDeDoubles = new double[] {17.8, 11.6, 5.0, 21.9};
		
		boolean arrayDeBoleanos [] = {true, false, false, true, true, false};
		
	}
}
