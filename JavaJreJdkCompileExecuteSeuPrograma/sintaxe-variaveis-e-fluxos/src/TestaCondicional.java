
public class TestaCondicional {

	public static void main(String[] args) {

		System.out.println("testando condicionais");

		int idade = 17;
		int quantidadePessoas = 3;

		if (idade >= 18) {
			System.out.println("Você é maior de idade.");
			System.out.println("Entrada liberada!");
		} else {
			if (quantidadePessoas > 2) {
				System.out.println("Você é menor de idade, mas está acompanhado.");
				System.out.println("Entrada liberada!");
			} else {
				System.out.println("Você é menor de idade");
				System.out.println("Entrada não permitida.");
			}
		}
	}
}
