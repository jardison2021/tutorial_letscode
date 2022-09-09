package lacosnumericos;

public class LacosNumericos {
	public static void main(String[] args) {
		//1 2 3 4 5 6 7 8 9 10
		//para uma variável que inicia em 1 e vai até 10, mudando um por um, faça:
		for (int i = 1; i <= 10; i++) {
			System.out.println("Tabuada do " + i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(j + " * " + i + "= " + j * i);
			}
		}
	} 
}
