package vetores;

public class Vetores {

	public static void main(String[] args) {
		
		// vetor/array do tipo inteiro de 5 posições, sendo elas de 0 a 4
		int[] numeros = new int[5];
		
		// atribuindo valores para o vetor
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
				
		// percorrendo o vetor e imprimindo item a item
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}
