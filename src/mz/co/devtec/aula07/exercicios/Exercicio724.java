package mz.co.devtec.aula07.exercicios;

public class Exercicio724 {

	public static void main(String[] args) {

//Declarando, inicializando e adicionando valores no array
		
		String [] verdurasELeguminosas = {"papaia", "couve", "alface", "laranja", "morango", "uva", "folha de abóbora"};
		
			
//Primeira forma de mostrar na saida todos valores armazenados num array
		System.out.println("Primeira Forma dde Mostrar na Saida");
		System.out.println(verdurasELeguminosas[0]);
		System.out.println(verdurasELeguminosas[1]);
		System.out.println(verdurasELeguminosas[2]);
		System.out.println(verdurasELeguminosas[3]);
		System.out.println(verdurasELeguminosas[4]);
		System.out.println(verdurasELeguminosas[5]);
		System.out.println(verdurasELeguminosas[6]);
	
		
//Segunda forma de mostrar na saida todos valores armazenados num array
		
		System.out.println();
		System.out.println("Segunda Forma dde Mostrar na Saida:");
		for (int i = 0; i < verdurasELeguminosas.length; i++) {
			System.out.println(verdurasELeguminosas[i]);
		}
		
		verdurasELeguminosas[3] = "goiaba";
				
		System.out.println();
		System.out.println("Segunda Forma dde Mostrar na Saida:");
		for (int i = 0; i < verdurasELeguminosas.length; i++) {
			System.out.println(verdurasELeguminosas[i]);
		}		

	}

}
