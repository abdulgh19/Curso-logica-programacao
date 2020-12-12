package mz.co.devtec.aula04;
import java.util.Scanner;
public class RaizQuadradaEPotencia {
	
	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);

		// Uso da .sqrt() e .pow() para retornar a raiz quadra de um numero e a potencia respectivamente 
				
				int umNumeroQualquer, raizQuadrada, resultadoDaPotencia, outroNumeroQualquer;
				
				System.out.println("Digite um numero inteiro qualquer");
				umNumeroQualquer = entradaPorTeclado.nextInt();
				
				System.out.println("Digite outro numero inteiro qualquer");
				outroNumeroQualquer = entradaPorTeclado.nextInt();

				raizQuadrada = (int) Math.sqrt(umNumeroQualquer);
				resultadoDaPotencia = (int) Math.pow(umNumeroQualquer, outroNumeroQualquer );
				
				System.out.println("Primeiro numero digitado: " +umNumeroQualquer);
				System.out.println("Segundo numero digitado: " +outroNumeroQualquer);
				System.out.println();
				System.out.println("A raiz quadrada de: " +umNumeroQualquer +" = " +raizQuadrada);
				System.out.println(+umNumeroQualquer +" elevado a "+outroNumeroQualquer+ " = "  +resultadoDaPotencia);
				
				entradaPorTeclado.close();
			}
	}