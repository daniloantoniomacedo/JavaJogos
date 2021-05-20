package view;

import java.util.Scanner;

import model.ModelJogoForca;

public class TelaJogoForca {

	public static char resposta;
	public static String[] tracejado = new String[ModelJogoForca.countLetras];


	public static void gerarForca() {

		System.out.printf("Você deverá acertar a palavra \n"
				+ "em %d tentativas para vencer o jogo. \n", 7-ModelJogoForca.countDerrotas);	

		switch (ModelJogoForca.countDerrotas) {
		case 0: 

			System.out.println("  __________");
			System.out.println(" |          |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("_|______________");

			break;
		case 1: 
			System.out.println("  __________");
			System.out.println(" |          |");
			System.out.println(" |          0");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("_|______________");

			break;
		case 2: 
			System.out.println("  __________");
			System.out.println(" |          |");
			System.out.println(" |          0");
			System.out.println(" |          |");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("_|______________");

			break;
		case 3: 
			System.out.println("  __________");
			System.out.println(" |          |");
			System.out.println(" |          0");
			System.out.println(" |         /|");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("_|______________");

			break;
		case 4: 
			System.out.println("  __________");
			System.out.println(" |          |");
			System.out.println(" |          0");
			System.out.println(" |         /|\\");
			System.out.println(" |");
			System.out.println(" |");
			System.out.println("_|______________");

			break;
		case 5:
			System.out.println("  __________");
			System.out.println(" |          |");
			System.out.println(" |          0");
			System.out.println(" |         /|\\");
			System.out.println(" |          |");
			System.out.println(" |");
			System.out.println("_|______________");

			break;
		case 6: 
			System.out.println("  __________");
			System.out.println(" |          |");
			System.out.println(" |          0");
			System.out.println(" |         /|\\");
			System.out.println(" |          |");
			System.out.println(" |         / ");
			System.out.println("_|______________");

			break;
		case 7:
			System.out.println("  __________");
			System.out.println(" |          |");
			System.out.println(" |          0");
			System.out.println(" |         /|\\");
			System.out.println(" |          |");
			System.out.println(" |         / \\");
			System.out.println("_|______________");

			break;
		}

	}


	public static void gerarTracejado(char[] letras) {

		if (ModelJogoForca.countVitorias < 1) {
			for (int i=0; i < letras.length; i++) {
				tracejado[i] = "_ ";
			}

		}else{

			for (int i=0; i<letras.length; i++) {
				if (i == 0 && Character.toLowerCase(letras[i]) == Character.toLowerCase(resposta)) {
					tracejado[i] = Character.toUpperCase(resposta) + " ";
				}
				if(i != 0 && Character.toLowerCase(letras[i]) == Character.toLowerCase(resposta)) {
					tracejado[i] = Character.toLowerCase(resposta) + " ";
				}

			}
		}
		for (int i=0; i<letras.length; i++) {
			System.out.print(tracejado[i]);
		}

	}

	public static void obterResposta() {

		Scanner teclado = new Scanner(System.in);

		System.out.println();
		System.out.println("Digite uma letra:");
		resposta = teclado.next().charAt(0);

	}
	
	public static void imprimirResultado(boolean retorno) {
		if (retorno == true) {
			
			System.out.println();
			System.out.printf("Parabéns, %s! Você ganhou. \n", TelaInicial.nome);
			
		}else {
			
			System.out.printf("%s, Você perdeu. \n", TelaInicial.nome);
			
		}
	}

}

