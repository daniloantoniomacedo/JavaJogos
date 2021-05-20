package model;

import java.util.Random;

import view.TelaJogoForca;

public class ModelJogoForca {

	public static int countVitorias;
	public static int countDerrotas;
	public static int countLetras;
	
	public static void executarJogoForca() {
		
		System.out.println("\nJogo da Forca selecionado!");

		char[] letras = gerarPalavra();

		while (countDerrotas <= 7){
			TelaJogoForca.gerarForca();
			TelaJogoForca.gerarTracejado(letras);
			if (verificarVitoria(letras) == true) {
				TelaJogoForca.imprimirResultado(true);
				break;
			}
			TelaJogoForca.obterResposta();
			validarCaracter(letras);	
			if (countDerrotas >= 7) {
				TelaJogoForca.gerarForca();
				TelaJogoForca.imprimirResultado(false);
				break;
			}
		}
		
	}

	public static char[] gerarPalavra() {

		int index;
		String palavra;

		String[] dados = new String[5];
		dados[0] = "Abacaxi";
		dados[1] = "Goiaba";
		dados[2] = "Berinjela";
		dados[3] = "Tomate";
		dados[4] = "Uva";
		Random aleatorio = new Random();
		index = aleatorio.nextInt(4+1);
		palavra = dados[index];	

		char[] letras = new char[palavra.length()];

		for (int i=0; i<palavra.length(); i++) {
			letras[i] = palavra.charAt(i);
		}

		countLetras = palavra.length();

		return letras;

	}

	public static void validarCaracter(char[] letras) {

		boolean acerto = false;

		for (int i=0; i<letras.length; i++) {
			if (Character.toLowerCase(letras[i]) == Character.toLowerCase(TelaJogoForca.resposta)) {
				acerto = true;
				break;
			}
		}
		
		if (acerto == true) {
			countVitorias++;
		}else {
			countDerrotas++;
		}
	}
	
	public static boolean verificarVitoria(char[] letras) {
		String resposta = " ";
		String gabarito = " ";
		boolean resultado = false;
		
		for (int i = 0; i<TelaJogoForca.tracejado.length; i++) {
			resposta += TelaJogoForca.tracejado[i].replace(" ", "");
		}
		
		for (int i = 0; i<letras.length; i++) {
			gabarito += letras[i];
		}
		
		if (resposta.toLowerCase().equals(gabarito.toLowerCase())) {
			resultado = true;
		}
		
		return resultado;
		
		
	}
}
