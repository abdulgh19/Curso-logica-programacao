package mz.co.devtec.aula06;

public class WhileEncadeado {

	public static void main(String[] args) {
		
		int numeroMesa = 1;
		
		while (numeroMesa <= 8) {
			
			int numeroCadeira = 1;

			while (numeroCadeira <= 10) {

				System.out.println("Seja bem vindo a primeira gala da DEVTEC: Pode acomodar-se na cadeira "+ numeroCadeira + " da mesa " + numeroMesa);				
				
				numeroCadeira++;
			}			
			numeroMesa ++;			
		}
	}
}




