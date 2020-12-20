package mz.co.devtec.aula07.exercicios;

public class Exercicio722 {

	public static void main(String[] args) {

		
		String [] verdurasELegumes = new String [7];

//Primeira forma aprendida
		verdurasELegumes[0] = "papaia";
		verdurasELegumes[1] = "couve";
		verdurasELegumes[2] = "alface";
		verdurasELegumes[3] = "laranja";
		verdurasELegumes[4] = "morango";
		verdurasELegumes[5] = "uva";
		verdurasELegumes[6] = "floha de abobora";
		

//Segunda forma aprendida
		String [] verdurasELeguminosas = {"papaia", "couve", "alface", "laranja", "morango", "uva", "folha de abóbora"};
		

		System.out.println("Segundo elemento: '" +verdurasELegumes[1] +"' e quarto elemento '" +verdurasELegumes[3] +"' do primeiro Array.");
		System.out.println();
		System.out.println("Segundo elemento: '" +verdurasELeguminosas[1] +"' e quarto elemento '" +verdurasELeguminosas[3] +"' do segundo Array.");

	}

}
