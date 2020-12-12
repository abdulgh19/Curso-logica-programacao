package mz.co.devtec.aula02;

public class VariavelETipos {

	public static void main(String[] args) {
	
//tipos basicos

		
		String  x;
		
		int  y;
		
		long r;
		
		double z;
		
		
//Inicializacao de variaveis		
		
		String apelido;
		
		apelido = "Abdul";
			
		int idade = 120;
		
		double altura;
		
		altura = 1.6;
		
		float peso = 302.65f;
		
		boolean estaPresente = true;
		
		
//Valores literais
		
		String outrosNomes = null;
		
	
//Casting de tipo inteiro para Long
		
		int numeroFuncionario = 1546575767;
		
		long nuitCarlos = numeroFuncionario;
		
	
		
//Tentativa de conversao de tipo long para inteiro
		
/*
		long nuit = 1546575767;
				
		int codigoEstudante = (int) nuit;
		
*/	
		
//Casting de tipo long para inteiro
		
		long nuit = 1546575767L;
				
		int codigoEstudante = (int) nuit;
		
	
//Conversao de String
	
		String moduloDoCurso = "1";
		
		int numeroDoModulo = Integer.parseInt(moduloDoCurso);

		
//Dando momes as variaveis
		
		int e;
		double d;
		int ds;
		
		
		int estudantes;
		double duracao;
		int diaSemana;
		
		
		int estudanteMatriculados;
		double duracaoDeCadaAula;
		int totalDeAulasPorSemana;
		
//Comentarios em JA
		
		//C - Linha

		/* C - Bloco
				
				*/

						
				String nome = "Momade Abdul";
				
				String referencia = "RefAE/08";	
					
				double peso2 = 121.56;				
				
				System.out.println("o seu apelido eh: " +nome);
				/*System.out.println("o seu apelido eh: " +peso);
				System.out.println("o seu apelido eh: " +referencia);
				*/		
				System.out.println("o nuit eh: " +nuit);
			

	}

}
