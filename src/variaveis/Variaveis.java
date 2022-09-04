package variaveis;

public class Variaveis {
	public static void main(String[] args) {
		//tipo string
		String nome;
		nome = "Jardison";
		System.out.println("Olá, " + nome);
		
		//tipo numérico
		int numero1, numero2, soma, multiplicacao, subtracao;
		float divisao;
		numero1=30;
		numero2=4;
		//soma
		soma = numero1 + numero2;
		//multiplicação
		multiplicacao = numero1 * numero2;
		//subtração
		subtracao = numero1 - numero2;
		//divisão
		divisao = (float) numero1 / (float) numero2;
		System.out.println(soma);
		System.out.println(multiplicacao);
		System.out.println(subtracao);
		System.out.println(divisao);
	}
}
