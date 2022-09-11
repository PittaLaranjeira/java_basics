package opbooleanos;

public class OpBoleeanos {

	public static void main(String[] args) {

		String msg1, msg2, resultado;
		boolean fimDeSemana = true;
		boolean fazSol = true;
		boolean vouAPraia = fimDeSemana && fazSol;
		
		/*
			operadores booleanos: true/false
			variaveis do tipo string recebendo operadores ternários
			operador ternário => condição ? true : false;
		*/
		msg1 = fimDeSemana ? "É fim de semana" : "Não é fim de semana"; 
		msg2 = fazSol ? "Faz sol" : "Não faz sol";
		resultado = vouAPraia ? "Vou a praia" : "Não vou a praia";
		
		// imprimindo a proposição baseado no resultado da tabela verdade
		System.out.println("\n" + msg1 + " && " + msg2 + " ENTÃO " + resultado);	
	}
}
