package mz.co.devtec.aula06;

public class ForEncadeadoComWhile {

	public static void main(String[] args) {

		for (int numeroMesa = 1; numeroMesa <= 8; numeroMesa ++) {
			
			int numeroCadeira = 1;

			while (numeroCadeira <= 10) {

				System.out.println("Seja bem vindo a primeira gala da DEVTEC: Pode acomodar-se na cadeira "+ numeroCadeira + " da mesa " + numeroMesa);				
				
				numeroCadeira++;
			}
		}
	}
}



