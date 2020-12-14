package mz.co.devtec.aula05.exercicios;

import java.util.Scanner;

public class Exercicio522 {

	public static void main(String[] args) {
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		int menuPrincipal, menuHamburguer, menuPizza;
		
		System.out.println("    -- BEM VINDO AO DEVTEC TAKE AWAY --    ");
		System.out.println("| Escolha uma refeicao:");
		System.out.println("--------------------------------------------");
		System.out.println("| 1 - Hamburguer");
		System.out.println("| 2 - Pizza");
		System.out.println("| 0 - Encerrar");
		System.out.println("--------------------------------------------");
		System.out.println();
		
		menuPrincipal =  entradaTeclado.nextInt();
		
		if (menuPrincipal == 1) {
			
			System.out.println();
			System.out.println("| Escolha o HAMBURGUER que deseja:");
			System.out.println("--------------------------------------------");
			System.out.println("| 1 - Hamburguer simples");
			System.out.println("| 2 - Hamburguer duplo");
			System.out.println("--------------------------------------------");
			
			menuHamburguer =  entradaTeclado.nextInt();
			
			if (menuHamburguer == 1) {
				
				System.out.println("Aqui esta o seu Hamburguer Simples. Bom apetite!");
				
			} else {
				
				if (menuHamburguer == 2) {
					
					System.out.println("Receba o seu Hamburguer duplo. Bom apetite!");
					
				} else {
									
					System.out.println();
					System.out.println("Apenas sao valido os numeros 1 e 2 para escolher um hamburguer. Obrigado pela preferencia!");
					System.out.println();
					System.out.println("DEVTEC take away, volte sempre!");

				}

			}
						
		} else {
			
			if (menuPrincipal == 2) {
				
				System.out.println();
				System.out.println("| Escolha a PIZZA de sua preferencia:");
				System.out.println("--------------------------------------------");
				System.out.println("| 1 - Vegetariana");
				System.out.println("| 2 - Mexicana");
				System.out.println("--------------------------------------------");
				
				menuPizza =  entradaTeclado.nextInt();
				
				if (menuPizza == 1) {
					
					System.out.println("Aqui esta a sua Pizza Vegetariana. Bom apetite!");
					
				} else {
					
					if (menuPizza == 2) {
						
						System.out.println("Receba a sua Pizza Mexicana. Bom apetite!");
						
					} else {
						
						System.out.println();
						System.out.println("Apenas sao valido os numeros 1 e 2 para escolher uma pizza. Obrigado pela preferencia!");
						System.out.println();
						System.out.println("DEVTEC take away, volte sempre!");

					}
					
				}
				
			} else {
				
				if (menuPrincipal == 0) {
					
					System.out.println();
					System.out.println("0");
					System.out.println();
					System.out.println("Obrigado pela preferencia!");
					System.out.println();
					System.out.println("DEVTEC take away, volte sempre!");
					
				} else {
					System.out.println();
					System.out.println("Apenas sao valido os numeros 0, 1 e 2. Obrigado pela preferencia!");
					System.out.println();
					System.out.println("DEVTEC take away, volte sempre!");

				}

			}

		}
				
		entradaTeclado.close();
	}

}
