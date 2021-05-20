package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TelaInicial {
	
	public static String nome;
	
	public static void nomeUsuario() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("########### MENU INICIAL ###########");
		System.out.println("Qual seu nome?");
		nome = teclado.nextLine();
		while (nome.equals("")) {
			System.out.println("Qual seu nome?");
			nome = teclado.nextLine().trim();
		}
	}

	public static int menuPrincipal() throws InputMismatchException{

		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		System.out.println("Esolha uma opção: \n"
				+ "Digite (1) para Jogo da Forca; \n"
				+ "Digite (2) Batalha Naval; \n"
				+ "Digite (3) Jogo da Velha ou \n"
				+ "Digite (4) Sair.");
		opcao = teclado.nextInt();
		while (opcao<1 || opcao>4) {
			System.out.println("Opção não existe. Tente novamente \n");
			System.out.println("Esolha uma opção: \n"
					+ "Digite (1) para Jogo da Forca; \n"
					+ "Digite (2) Batalha Naval; \n"
					+ "Digite (3) Jogo da Velha ou \n"
					+ "Digite (4) Sair.");
			opcao = teclado.nextInt();
		}
		return opcao;
	}

}
