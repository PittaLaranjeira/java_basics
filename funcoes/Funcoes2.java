package funcoes;

public class Funcoes2 {

	public static void main(String[] args) {
		int num1 = 2,
			num2 = 3,
			// resultado da soma de num1 e num2, utilizando a função de soma
			resultado = soma(num1,num2);
		
		// imprime as variáveis num1 e num2 e o resultado da soma das mesmas
		System.out.printf("%nA soma de %s com %s é igual a %s.", num1, num2, resultado);
	}
	
	// funçao que soma dois valores inteiros e retorna o resultado dos mesmos.
	public static int soma(int a, int b) {
		return a + b;
	}
}
