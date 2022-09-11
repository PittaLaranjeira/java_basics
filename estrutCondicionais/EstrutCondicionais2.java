package estrutcondicionais;

public class EstrutCondicionais2 {

	public static void main(String[] args) {
		
		int nota = 85;
		String graduacao;
		
		/*
			GRADUAÇÃO:			
				 A >= 80
			80 > B >  70
			70 > C >  60
			60 > D >  40
			40 > E >  20
			20 > F >   0 		
		*/
		if(nota >= 80) {
			graduacao = "A";
		} else if(80 > nota && nota > 70) {
			graduacao = "B";
		} else if(70 > nota && nota > 60) {
			graduacao = "C";
		} else if(60 > nota && nota > 40) {
			graduacao = "D";
		} else if(40 > nota && nota > 20) {
			graduacao = "E";
		} else {
			graduacao = "F";
		}

		/* 
			verifica se a graduação do aluno/nota obtida é:
				suficiente para aprovação do mesmo (acima ou igual a 70)
				insuficiente para aprovação (abaixo de 70)
			caso seja suficiente imprime a graduação e status Aluno Aprovado!
			caso insuficiente imprime a graduação e status Aluno Reprovado!
			caso graduação seja diferente de A a F imprime Graduação Inválida.
		*/
		switch(graduacao) {
			case "A":
			case "B":
				System.out.println("Graduação: " + graduacao 
						+ " - Aluno Aprovado!");
				break;
			case "C":
			case "D":
			case "E":
			case "F":
				System.out.println("Graduação: " + graduacao 
						+ " - Aluno Reprovado!");
				break;
			default:
				System.out.println("Graduação Inválida.");
		}	
	}
}
