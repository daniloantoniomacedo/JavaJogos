package controller;

import java.util.InputMismatchException;

import view.TelaInicial;

public class Principal {

	public static void main(String[] args) {
		TelaInicial.nomeUsuario();
		obterOpcaoIncial();
		
	}
	public static void obterOpcaoIncial() {
		try {
			switch(TelaInicial.menuPrincipal()) {
			case 1: System.out.println("Jogo da Forca selecionado!"); break;
			case 2: System.out.println("Batalha Naval selecionado!"); break;
			case 3: System.out.println("Jogo da Velha selecionado!"); break;
			case 4: System.exit(0); break;
			}
			} catch(InputMismatchException e) {
				System.out.println("Opção não existe. Tente novamente \n");
				obterOpcaoIncial();
			}
	}

}
