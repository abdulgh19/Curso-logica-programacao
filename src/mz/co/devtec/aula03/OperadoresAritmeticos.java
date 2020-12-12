package mz.co.devtec.aula03;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
//declaraco de variaveis 
		
		double valor1, valor2, soma, subtrai;

		
//inicializcao de variaveis
		
		valor1  = 5.0;
		
		valor2 = 11.0;	

	
//Processamento
		
		soma = valor1 + valor2;
		
		subtrai = valor1 - valor2;
		
//Saida de dados	
		System.out.println("O valor 1 : " +valor1 );
		System.out.println();
		System.out.println("O valor 2:  " +valor2 );
		System.out.println();
		System.out.println("A soma:     " +soma );
		System.out.println();
		System.out.println("A subtracao:     " +subtrai );
		System.out.println();

		
//declaraco de variaveis		
		
		double multiplicacao, divisao, modulo;
		

//Processamento
		
		multiplicacao = valor1 * valor2;
		
		divisao = valor1 / valor2;
		
		modulo = valor1 % valor2;
		

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
		
		completo = " de";
		
		doCurso = " Programacao";
		
		System.out.println(nome + completo + doCurso);
		System.out.println();

		
//Concatenacao de Strings - outra forma
		
		String concatenadas = nome + completo + doCurso;
		
		System.out.println("Curso de : " +concatenadas);
		

	}

}
