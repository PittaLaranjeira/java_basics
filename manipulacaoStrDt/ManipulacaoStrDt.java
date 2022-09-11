package manipulacaostrdt;

public class ManipulacaoStrDt {

	public static void main(String[] args) {
		
		String nome = "Vitória";
		String nome2 = "vitória";
		
		// String.toUpperCase() -> deixa todas as letras em maiusculo
		System.out.println(nome.toUpperCase());
		
		// String.toLowerCase() -> deixa todas as letras em minusculo
		System.out.println(nome.toLowerCase());
		
		// String.lenght() -> exibe quantos caracteres/letras a string tem
		System.out.println(nome.length());
		
		/*
			String.equalsIgnoreCase(String2) -> compara as strings ignorando se
			estão em formas diferentes, letra maiuscula/minuscula
		*/
		System.out.println(nome.equalsIgnoreCase(nome2));	
	}
}
