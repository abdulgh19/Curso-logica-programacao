package mz.co.devtec.aula03;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {

		Scanner entradaPorTeclado = new Scanner(System.in);

//Trabalhando com valores inteiros

		int totalAlunos;

		System.out.println("Informe o total de alunos da turma: ");

		totalAlunos = entradaPorTeclado.nextInt();

		System.out.println("Sao no total: " + totalAlunos + " alunos");

//Trabalanho com valores reais - double

		double mediaFinalDouble;

		mediaFinalDouble = entradaPorTeclado.nextDouble();

		System.out.println("A media obtida foi de: " + mediaFinalDouble + " valores.");

//Trabalanho com valores reais - float

		float mediaFinalFloat;

		mediaFinalFloat = entradaPorTeclado.nextFloat();

		System.out.println("A media obtida foi de: " + mediaFinalFloat + " valores.");

//Trabalhando com caracteres simples (sem uso da barra de espaco)

		String localDeFormacao;

		localDeFormacao = entradaPorTeclado.next();

		System.out.println("O curso teve lugar no: " + localDeFormacao);

//Trabalhando com caracteres compostos (com uso da barra de espaco)		

		String localDaFormacao;

		localDaFormacao = entradaPorTeclado.nextLine();

		System.out.println("O curso teve lugar no: " + localDaFormacao);

//Resolvendo o Problema do Buffer com nextLine()

		int totalAlunos2;
		double mediaDouble;
		float mediaFloat;
		String localParaFormacao;

		totalAlunos2 = entradaPorTeclado.nextInt();
		mediaDouble = entradaPorTeclado.nextDouble();
		mediaFloat = entradaPorTeclado.nextFloat();
		entradaPorTeclado.nextLine();
		localParaFormacao = entradaPorTeclado.nextLine();

		System.out.println("Sao no total: " + totalAlunos2 + " alunos");
		System.out.println("A media obtida foi de: " + mediaDouble + " valores.");
		System.out.println("A media obtida foi de: " + mediaFloat + " valores.");
		System.out.println("O curso teve lugar no: " + localParaFormacao);

//Resolvendo o Problema do Buffer com nextLine()

		int totalAlunos2U;
		double mediaDoubleU;
		float mediaFloatU;
		String localParaFormacaoU;

		totalAlunos2U = entradaPorTeclado.nextInt();
		mediaDoubleU = entradaPorTeclado.nextDouble();
		mediaFloatU = entradaPorTeclado.nextFloat();
		entradaPorTeclado.nextLine();
		localParaFormacaoU = entradaPorTeclado.nextLine();

		System.out.println("Sao no total: " + totalAlunos2U + " alunos");
		System.out.println("A media obtida foi de: " + mediaDoubleU + " valores.");
		System.out.println("A media obtida foi de: " + mediaFloatU + " valores.");
		System.out.println("O curso teve lugar no: " + localParaFormacaoU);

		entradaPorTeclado.close();
	}
}
