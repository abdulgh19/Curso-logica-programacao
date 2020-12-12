package mz.co.devtec.aula03;
import java.util.Locale;

public class SaidaDeDados {
	public static void main(String[] args) {
		
		//Locale.setDefault(Locale.US);
		
		String s = "Eh uma String";
		
		int i = 45;
		
		double d = 234.9875453;
		
		System.out.print(s);
		
		System.out.println(i);
		
//Uso do printf para valores double indicando no numero de casas decimais (no caso 2 casas)
		
		System.out.printf("%.2f%n", d);
		
	}

}
