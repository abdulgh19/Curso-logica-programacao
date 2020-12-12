package mz.co.devtec.aula03;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int variavel = 6;		
		boolean verifica;
		
		verifica = (variavel == 5);
		//false
		System.out.println(verifica);
		System.out.println();
		
		verifica = (variavel != 6);
		//false
		System.out.println(variavel);
		System.out.println();
		
		verifica = (variavel < 8);
		//true
		System.out.println(verifica);
		System.out.println();
		
		verifica = (variavel <= 4);
		//false
		System.out.println(verifica);
		System.out.println();
				
		verifica = (variavel <= 6);
		//true
		System.out.println(verifica);
		System.out.println();		
		
		verifica = (variavel > 8);
		//false
		System.out.println(verifica);
		System.out.println();
		
		verifica = (variavel >= 4);
		//false
		System.out.println(verifica);
		System.out.println();
		
		verifica = (variavel >= 6);
		//true
		System.out.println(verifica);
		System.out.println();
		
		
		
		
			
		

	}

}
