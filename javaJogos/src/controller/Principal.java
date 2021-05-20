package controller;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.ModelJogoForca;
import model.ModelJogoVelha;
import view.TelaInicial;


public class Principal {

	public static void main(String[] args) {
		TelaInicial.nomeUsuario();
		obterOpcaoIncial();
	}
	public static void obterOpcaoIncial() {

		try {
			switch(TelaInicial.menuPrincipal()) {
			case 1: 
				ModelJogoForca.executarJogoForca();
				retornar();
				break;
			case 2: System.out.println("Batalha Naval selecionado!"); break;
			case 3: 
				ModelJogoVelha.executarDaVelha();
				retornar();
				break;
			case 4: 
				System.exit(0); 
				break;
			}
		} catch(InputMismatchException e) {
			System.out.println("Opção não existe. Tente novamente \n");
			obterOpcaoIncial();
		}
	}

	public static void retornar() {

		Scanner teclado = new Scanner(System.in);
		int opcao;

		System.out.println("\nDeseja voltar ao menu inicial? \n"
				+ "Digite 1 para voltar e 0 para encerrar o programa.");
		opcao = teclado.nextInt();

		if (opcao == 1) {
			obterOpcaoIncial();
		} else if (opcao == 0) {
			System.exit(0);
		}

	}

}
