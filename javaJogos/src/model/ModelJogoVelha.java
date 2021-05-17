package model;

import java.util.Random;

public class ModelJogoVelha {
	
	public static String gerarPalavra() {
		
		String palavra = "";
		int index;
		
		String[] dados = new String[5];
		dados[0] = "Abacaxi";
		dados[1] = "Goiaba";
		dados[2] = "Berinjela";
		dados[3] = "Tomate";
		dados[4] = "Laranja";
		Random aleatorio = new Random();
		index = aleatorio.nextInt(4+1);
		palavra = dados[index];
		
		//git teste 2
		
		
		return palavra;
	}
	

}
