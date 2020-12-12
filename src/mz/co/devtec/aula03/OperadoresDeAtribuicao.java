package mz.co.devtec.aula03;

public class OperadoresDeAtribuicao {

	public static void main(String[] args) {

//Operadores de atribuicao
		
		int dado = 1;
		//dado = 1
		System.out.println("Dado [=]: "+dado);
		
		dado += 4;
		//dado = dado + 4;
		//dado = 5
		System.out.println("Dado [+=]: "+dado);
			
		dado -= 6;
		//dado 
		System.out.println("Dado [-=]: "+dado);

	
		dado *= 4;
		//dado 
		System.out.println("Dado [*=]: "+dado);
	
				
		dado /= -2;
		//dado = 9
		System.out.println("Dado [/=]: "+dado);
	
		dado ++;
		// dado = 10
		System.out.println("Dado [++]: "+dado);
	
			
		dado --;
		//dado = 9
		System.out.println("Dado [--]: "+dado);
				
	
	}

}
