package manipulacaostrdt;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class ManipulacaoStrDt2 {

	public static void main(String[] args) {
		
		String nome = "Vitória";
		String dia, saudacao;
		
		// definindo a localização -> linguagem = pt, país = BR (brasil)
		Locale brasil = new Locale("pt","BR");
		
		/*
			ISO 8601 - definiu regras para formatos de data
			* vou substituir o LocalDate pelo LocalDateTime *
				LocalDate -> trabalhar apenas com datas
				LocalDate.now() -> recebe a data atual do sistema
			LocalDateTime -> tabalha com datas e horas
			LocalDateTime.now() -> recebe dia e hora atual do sistema			
		*/
		LocalDateTime agora = LocalDateTime.now();
		
		/*
			dia -> recebe o dia atual do sistema
			.getDayOfWeek() -> recebe o dia da semana (em inglês)
			.getDisplayName() -> edita como a informação será exibida
			TextStyle.FULL -> exibe o texto em sua integra
			brasil -> localização / linguagem que queremos exibir
		*/
		dia = agora.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		
		/*
			definindo a saudação com base na hora atual
				 0h até 12h 	-> bom dia
				12h até 18h 	-> boa tarde
				18h até 24h 	-> boa noite
				em caso de erro -> formato incompatível
		*/
		if(agora.getHour() <= 12) {
			saudacao = "bom dia!";
		} else if(agora.getHour() > 12 && agora.getHour() <= 18) {
			saudacao = "boa tarde!";
		} else if(agora.getHour() > 18 && agora.getHour() <= 24) {
			saudacao = "boa noite!";
		} else {
			saudacao = "formato incompatível";
		}
		
		// %n -> pula linha | %s -> receber string
		System.out.printf("%n Olá %s, hoje é %s, %s", nome, dia, saudacao);	
	}
}
