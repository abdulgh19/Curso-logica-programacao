package mz.co.devtec.aula04;
import java.util.Scanner;

import java.lang.Math;

public class Arredondando {

	public static void main(String[] args) {

		Scanner entradaPorTeclado = new Scanner(System.in);

// Uso da funcao .abs() para retorna o valor absoluto dum numero
		
		int numeroInteriro3, numeroInteiro3ValorAbsoluto;
		double numeroDecimal3, numeroDecimal3ValorAbsoluto;
		
		numeroInteriro3 = entradaPorTeclado.nextInt();
		numeroDecimal3 = entradaPorTeclado.nextDouble();

		numeroInteiro3ValorAbsoluto = Math.abs(numeroInteriro3);
		numeroDecimal3ValorAbsoluto = Math.abs(numeroDecimal3);
		
		System.out.println("Numero inteiro digitado: " +numeroInteriro3);
		System.out.println("Numero decimal digitado: " +numeroDecimal3);
		System.out.println();
		System.out.println("Numero inteiro absoluto: " +numeroInteiro3ValorAbsoluto);
		System.out.println("Numero decimal absoluto: " +numeroDecimal3ValorAbsoluto);
		
		entradaPorTeclado.close();
	}
}

/*

// Uso da funcao .round() para arredondar numeros
 
		int numeroInteriro, numeroInteiroArredondado;
		double numeroDecimal, numeroDecimalArredondado;
		
		numeroInteriro = entradaPorTeclado.nextInt();
		numeroDecimal = entradaPorTeclado.nextDouble();


		
		numeroInteiroArredondado = Math.round(numeroInteriro);
		numeroDecimalArredondado = Math.round(numeroDecimal);
		
		System.out.println("Numero inteiro digitado: " +numeroInteriro);
		System.out.println("Numero decimal digitado: " +numeroDecimal);
		System.out.println();
		System.out.println("Numero inteiro arredondado: " +numeroInteiroArredondado);
		System.out.println("Numero decimal arredondado: " +numeroDecimalArredondado);


// Uso da funcao .ceil() para arredondar numeros
		
		int numeroInteriro2, numeroInteiro2ArredondadoParaCima;
		double numeroDecimal2, numeroDecimal2ArredondadoParaCima;
		
		numeroInteriro2 = entradaPorTeclado.nextInt();
		numeroDecimal2 = entradaPorTeclado.nextDouble();

		numeroInteiro2ArredondadoParaCima = (int) Math.ceil(numeroInteriro2);
		numeroDecimal2ArredondadoParaCima = Math.ceil(numeroDecimal2);
		
		System.out.println("Numero inteiro digitado: " +numeroInteriro2);
		System.out.println("Numero decimal digitado: " +numeroDecimal2);
		System.out.println();
		System.out.println("Numero inteiro arredondado para cima: " +numeroInteiro2ArredondadoParaCima);
		System.out.println("Numero decimal arredondado para cima: " +numeroDecimal2ArredondadoParaCima);






*/