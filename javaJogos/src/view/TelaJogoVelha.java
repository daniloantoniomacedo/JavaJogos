package view;

import model.ModelJogoVelha;

public class TelaJogoVelha {

	public static void main(String[] args) {
		gerarForca();
		gerarTracejado(ModelJogoVelha.gerarPalavra());
		
	}
	
	public static void gerarForca() {
		
		System.out.println("  __________");
		System.out.println(" |          |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println(" |");
		System.out.println("_|______________");
		
		System.out.println("  __________");
		System.out.println(" |          |");
		System.out.println(" |          0");
		System.out.println(" |         /|\\");
		System.out.println(" |          |  ");
		System.out.println(" |         / \\");
		System.out.println("_|______________");
		
	}
	
	
	public static void gerarTracejado(char[] letras) {
				
		for (int i=0; i<letras.length; i++) {
			System.out.print("_ ");
		}
		
	}
	
	


}

