package vetores;

import java.util.Arrays;

public class Vetores2 {

	public static void main(String[] args) {
		
		// vetor/array do tipo string de 10 posições, sendo elas de 0 a 9
		String[] letras = {"A", "B", "C", "J", "O", "X", "Q", "R", "Z", "I"};
				
		/*
			for(int j = 0; j < letras.length; j++) {
				System.out.println(letras[j]);
			} -> ou:
		*/
		
		//Arrays.toString(String) -> imprimir o array em forma de uma String
		System.out.println(Arrays.toString(letras));
	}
}
