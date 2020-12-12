package mz.co.devtec.aula03;

public class ConcatenandoStrings {

	public static void main(String[] args) {
		
//declaraco de variaveis 
		
		double teste1, valor2, soma;

		
//inicializcao de variaveis
		
		teste1  = 38.0;
		
		valor2 = 17.0;	

		
//Processamento
		
		soma = teste1 + valor2;
		
//Saida de dados	
		System.out.println("O valor 1 : " +teste1 );
		System.out.println();
		System.out.println("O valor 2:  " +valor2 );
		System.out.println();
		System.out.println("A soma:     " +soma );
		System.out.println();

		
//declaraco de variaveis		
		double multiplicacao, divisao, modulo;
		

//Processamento
		
		multiplicacao = teste1 * valor2;
		
		divisao = teste1 / valor2;
		
		modulo = teste1 % valor2;
		

//Saida de dados
		
		System.out.println("A multiplicacao: " +multiplicacao);
		System.out.println();
		System.out.println("A Divisao: " +divisao);
		System.out.println();
		System.out.println("O resto da divisao (modulo): " +modulo);
		System.out.println();


//Concatenacao de Strings
		
		String nome, completo, doCurso;
		
		nome = "Logica";
		
		completo = " de ";
		
		doCurso = "Programacao";
		
		System.out.println(nome + completo + doCurso);
		System.out.println();

		
//Concatenacao de Strings - outra forma
		
		String concatenadas = nome + completo + doCurso;
		
		System.out.println("Curso de : " +concatenadas);
		

	}

}
