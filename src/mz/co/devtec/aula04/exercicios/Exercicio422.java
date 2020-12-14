package mz.co.devtec.aula04.exercicios;

import java.util.Scanner;

public class Exercicio422 {

	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner (System.in);
		
// Uso da .random() para gerar numeros aleatorios 
		
		double numeroAleatorioGerado;
		int numeroAleatorioDesejado, limiteDeIntervalo;
		
		System.out.println("Informe um numero (inteiro) limite!");
		limiteDeIntervalo = entradaTeclado.nextInt();
		
// Gerando o numero aleatorio
		
		numeroAleatorioGerado = Math.random();

//Definindo o limite desejado para o intervalo
		
		numeroAleatorioDesejado = (int) (numeroAleatorioGerado*limiteDeIntervalo);
		
		System.out.println("O numero aleatorio originalmente gerado foi: " +numeroAleatorioGerado);
		System.out.println("Entre 1 e " +limiteDeIntervalo+" , o numero aleatorio eh: " +numeroAleatorioDesejado);
				
		entradaTeclado.close();
	}

}
