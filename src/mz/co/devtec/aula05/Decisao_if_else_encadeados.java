package mz.co.devtec.aula05;
import java.util.Scanner;

public class Decisao_if_else_encadeados {

	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		double teste1, teste2, media;
		
		System.out.println("Qual foi a nota do primeiro teste?");
		teste1 = entradaTeclado.nextDouble();
		
		System.out.println("Qual foi a nota do segundo teste?");
		teste2 = entradaTeclado.nextDouble();
			
		media = (teste1 + teste2)/2;
		
		if (media >= 14) {
			
			System.out.println("DESPENSADO!");
			
		} else {			
			
			if (media < 14 && media >= 10) {
				
				System.out.println("ADMITIDO!");
				
			} else {				
								
				System.out.println("EXCLUIDO!");
			}
			
		}
		
		entradaTeclado.close();		
	}
}


