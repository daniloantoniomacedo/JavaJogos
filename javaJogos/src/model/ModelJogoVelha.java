package model;

import java.util.Random;

public class ModelJogoVelha {

	public static char[] gerarPalavra() {

		String palavra = "";
		int index;

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
		
		return letras;
	
	}

}
