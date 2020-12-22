package mz.co.devtec.aula09;
public class FuncoesEstudantesInscritos {

	public static void main(String[] args) {

//Lista de estudantes inscritos no modulo de logica de programacao

		String[] alunosLogicaProgramacao = { "Lúcia Armando Mutombene", "Célia Angelica António Milice",
				"Albertina Inácio Nhamoneque Cossa", "Nataniel Tanda Malene", "Danúbio Arbanosse Simione",
				"Ruchia Salvador" };

		departamentoDeFormacaoCabelhaco();
		
		inscritosEmLogicaDeProgramacao();
		
		for (int i = 0; i < alunosLogicaProgramacao.length; i++) {
			
			System.out.println( i+1 +" - " +alunosLogicaProgramacao[i]);				
		}
		
		departamentoDeFormacaoRodape();
		

//Lista de estudantes inscritos no modulo de introducao a base de dados

		String[] alunosIntroducaoBaseDeDados = { "Igor Maposse", "Sifisso Muianga", "Helton Jossias", "Marcos Banze" };

	}
	
//FORA DO METODO MAIN
	
	// Cabecalho do departamento de formacao
	static void departamentoDeFormacaoCabelhaco() {
		System.out.println("# ----------------- UNIVERSIDADE EDUARDO MONDLANE -----------------  #");
		System.out.println("                        CENTRO DE INFORMATICA    					 ");
		System.out.println("                       Departamento de formacao   					 ");
		System.out.println();
	}

	// Rodape do departamento de formacao
	static void departamentoDeFormacaoRodape() {
		System.out.println();
		System.out.println(
				"Universidade Eduardo Mondlane -  Av. Julius Nyerere, Campus Universitário Principal da UEM, 3453, Maputo – Moçambique");
		System.out.println("Contactos: 21 493 724  --- João Zibia – zibia@uem.mz         ");
	};

	// Modulo de logica de programacao
	static void inscritosEmLogicaDeProgramacao() {

		System.out.println("                     Curso Java OO e Web Completo 	             ");
		System.out.println("                   Modulo I - Logica de programacao                ");
		System.out.println("                 Instrutor: Momade Marcos Henrique Abdul         ");
		System.out.println();
		System.out.println("Lista de estudantes inscritos:");
		System.out.println();
	};

	// Modulo de introducao a base de dados
	static void inscritosEmBaseDeDados() {
		System.out.println("                     Curso de Base de dados Completo 	             ");
		System.out.println("                   Modulo I - Introducao a base de dados                ");
		System.out.println("                 Instrutor: Momade Marcos Henrique Abdul         ");
		System.out.println();
		System.out.println("Lista de estudantes inscritos:");
	};
}
