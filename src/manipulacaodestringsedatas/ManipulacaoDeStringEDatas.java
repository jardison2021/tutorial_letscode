package manipulacaodestringsedatas;

public class ManipulacaoDeStringEDatas {
	public static void main(String[] args) {
		//manipulação de strings
		String nome = "Jardison";
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());
		System.out.println(nome.length());
		
		String nomeOutro="jardison";
		System.out.println(nome.equals(nomeOutro));
		System.out.println(nome.equalsIgnoreCase(nomeOutro));
	}
}
