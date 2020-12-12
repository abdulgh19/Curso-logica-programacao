package mz.co.devtec.aula04;
import java.util.Scanner;

public class MinimoEMaximo {
	
	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);

		// Uso da .min() e .max() para retornar os valores minimos e maximos 
				
				int primeiroNumero, segundoNumero, maximo, minimo;
				
				primeiroNumero = entradaPorTeclado.nextInt();
				segundoNumero = entradaPorTeclado.nextInt();

				maximo = Math.max(primeiroNumero,segundoNumero);
				minimo = Math.min(primeiroNumero,segundoNumero);
				
				System.out.println("Primeiro numero digitado: " +primeiroNumero);
				System.out.println("Segundo numero digitado: " +segundoNumero);
				System.out.println();
				System.out.println("Numero maximo : " +maximo);
				System.out.println("Numero minimo : " +minimo);
				
				entradaPorTeclado.close();
			}
	}