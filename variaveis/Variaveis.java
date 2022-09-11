package variaveis;

public class Variaveis {

	public static void main(String[] args) {

		// variavel nome do tipo String (texto) que recebe o valor "Vitória"
		String nome = "Vitória";
		// declarando variaveis a,b e soma do tipo inteiro
		int a, b, soma, subtracao, multiplicacao;
		double divisao;
		
		// atribuindo valores as variáveis
		a = 3;
		b = 2;
		soma = a + b;
		subtracao = a - b;
		multiplicacao = a * b;
		
		/*
			casting (double) para que a divisão receba um valor double, 
			pois o java entende que a divisão de dois numeros inteiros 
			tbm é um inteiro
		*/
		divisao =  (double) a / b;
	
		// imprime "Olá Vitória!"
		System.out.println("Olá " + nome + "!");
		
		// imprime uma quebra de linha (pula 1 linha)
		System.out.println("\n");
		
		// imprime as variáveis e as operações básicas
		System.out.println("A = " + a);
		System.out.println("B = " + b);
		System.out.println("A + B = " + soma);
		System.out.println("A - B = " + subtracao);
		System.out.println("A * B = " + multiplicacao);
		System.out.println("A / B = " + divisao);	
	}
}
