package mz.co.devtec.aula04;
import java.util.Scanner;
public class GeraNumeroAleatorio {
	
	public static void main(String[] args) {
		
		Scanner entradaPorTeclado = new Scanner(System.in);

		// Uso da .random() para gerar numeros aleatorios 
				
				double numeroAleatorioGerado;
				int numeroAleatorioDesejado;
				
				numeroAleatorioGerado = Math.random();
				
				numeroAleatorioDesejado = (int) (numeroAleatorioGerado*100);
				
				System.out.println("O numero aleatorio originalmente gerado foi: " +numeroAleatorioGerado);
				System.out.println("Entre 1 e 90, o numero aleatorio eh: " +numeroAleatorioDesejado);
				
				entradaPorTeclado.close();
			}
	}

