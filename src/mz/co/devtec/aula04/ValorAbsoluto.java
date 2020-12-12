package mz.co.devtec.aula04;
import java.util.Scanner;

public class ValorAbsoluto {

	public static void main(String[] args) {
		Scanner entradaPorTeclado = new Scanner(System.in);

		// Uso da funcao .abs() para retorna o valor absoluto dum numero

		int numeroInteriro3, numeroInteiro3ValorAbsoluto;
		double numeroDecimal3, numeroDecimal3ValorAbsoluto;

		numeroInteriro3 = entradaPorTeclado.nextInt();
		numeroDecimal3 = entradaPorTeclado.nextDouble();

		numeroInteiro3ValorAbsoluto = Math.abs(numeroInteriro3);
		numeroDecimal3ValorAbsoluto = Math.abs(numeroDecimal3);

		System.out.println("Numero inteiro digitado: " + numeroInteriro3);
		System.out.println("Numero decimal digitado: " + numeroDecimal3);
		System.out.println();
		System.out.println("Numero inteiro absoluto: " + numeroInteiro3ValorAbsoluto);
		System.out.println("Numero decimal absoluto: " + numeroDecimal3ValorAbsoluto);

		entradaPorTeclado.close();

	}

}
