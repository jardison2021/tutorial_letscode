package estruturascondicionais;

public class EstruturasCondicionais {
	public static void main(String[] args) {
		//média para aprovação de um aluno
		int nota = 70;
		String graduacao;
		//se nota for maior ou igual que 70, aluno aprovado
		//se nota for menor que 70, aluno repovado
		
		/*if (nota >= 70) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
		*/
		// A 80 B 70 C 60 D 0
		if (nota >= 70) {
			graduacao = "A";
		} else if (nota < 80 && nota >= 70 ) {
			graduacao = "B";
		} else if (nota < 70 && nota >= 60) {
			graduacao = "C";
		} else if (nota < 60 && nota >= 0) {
			graduacao = "D";
		} else {
			graduacao = "";
		}
		
		switch (graduacao) {
		case "A":
		case "B":
			System.out.println("Aluno aprovado");
			break;
		case "C":
		case "D":
			System.out.println("Aluno reprovado");
			break;
		default:
			System.out.println("Graduação inválida");
		}
	}
}
