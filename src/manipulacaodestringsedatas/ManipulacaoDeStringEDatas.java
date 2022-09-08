package manipulacaodestringsedatas;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.time.LocalDateTime;
public class ManipulacaoDeStringEDatas {
	public static void main(String[] args) {
		/*manipulação de strings
		String nome = "Jardison";
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.length());
		
		String nomeOutro="jardison";
		System.out.println(nome.equals(nomeOutro));
		System.out.println(nome.equalsIgnoreCase(nomeOutro));
		*/
		// manipulação de datas
		String nome = "Jardison";
		// ISO 8601 padrão de data mundial
		LocalDate hoje = LocalDate.now();
		//System.out.println(hoje);
		Locale brasil = new Locale("pt","BR");
		//System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
		String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
		String saudacao;
		LocalDateTime agora = LocalDateTime.now();
		
		if (agora.getHour() >= 0 && agora.getHour() < 12) {
			saudacao = "Bom dia";
		} else if (agora.getHour() >= 12 && agora.getHour() < 18) {
			saudacao = "Boa tarde";
		} else if (agora.getHour() >= 18 && agora.getHour() < 24) {
			saudacao = "Boa noite";
		} else {
			saudacao = "Olá!";
		}
		
		System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toLowerCase());
	}
}
