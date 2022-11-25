
public class DesafioMultiplos3 {

	public static void main(String[] args) {
		
		// Resolução1
		for (int multiplo = 3; multiplo <= 100; multiplo += 3) {
			System.out.println(multiplo);
		}
		
		// Resolução2
		for (int numero = 1; numero <= 100; numero++) {
			if (numero % 3 == 0) {
				System.out.println(numero);
			}
		}
	}
}
