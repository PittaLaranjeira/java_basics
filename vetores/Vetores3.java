package vetores;

import java.util.Arrays;

public class Vetores3 {

	public static void main(String[] args) {
	
		int[] numeros = {9, 10, 12, 25, 2};
		int maior = numeros[0], 
			menor = numeros[0], 
			media = 0;
	
		//percorrendo o vetor numeros
		for(int i = 0; i < numeros.length; i++) {
			//identificando o maior elemento do vetor
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
			//identificando o menor elemento do vetor
			if(numeros[i] < menor) {
				menor = numeros[i];
			}
			//somando todos os numeros do vetor - parte 1 do cálculo da média
			media += numeros[i];
		}
		
		//dividindo a somatória pela numero de posições do vetor - parte 2 do cálculo da média 
		media = media/numeros.length;
		
		//imprimindo o vetor, o maior elemento, o menor elemento e a média dos valores do vetor
		System.out.printf("Vetor: %s%n", Arrays.toString(numeros));
		System.out.printf("Maior: %s%n", maior);
		System.out.printf("Menor: %s%n", menor);
		System.out.printf("Média: %s%n", media);
	}
}
