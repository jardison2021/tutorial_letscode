package operadoresbooleanos;

public class OperadoresBooleanos {
	public static void main(String[] args) {
		boolean fimDeSemana = true;
		boolean fazendoSol = true;
		boolean vamosAPraia = fimDeSemana && fazendoSol;
		System.out.println(vamosAPraia);
		
		/*tabela verdade
		Operador && (AND)
		true && true = true
		true && false = false
		false && treu = false
		false && false = false*/
		
		/*Operador || (OR)
		 * true || true = true
		 * true || false = true
		 * false || true = true
		 * false || false = false*/
		
		//Operador ternário
		String mensagem = fimDeSemana ? "É fim de sema" : "Não é fim de semana";
		System.out.println(mensagem);
	}
}
