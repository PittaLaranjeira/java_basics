package funcoes;

public class Funcoes {

	public static void main(String[] args) {
		String nome = "Ricardo";
		
		// chamando a função de saudação passando a variavel nome.
		saudacao(nome);
	}
	
	// função de saudação, recebe uma string de nome, e imprime a saudação "Olá, *nome*!"
	public static void saudacao(String nome) {
		System.out.printf("Olá, %s!%n", nome);
	}
}
