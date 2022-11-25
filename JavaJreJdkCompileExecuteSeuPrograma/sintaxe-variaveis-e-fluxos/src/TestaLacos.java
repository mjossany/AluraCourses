
public class TestaLacos {

	public static void main(String[] args) {
		
		for (int multiplicando = 1; multiplicando <= 10; multiplicando++) {
			for (int multiplicador = 0; multiplicador <= 10; multiplicador++) {
				System.out.print(multiplicando * multiplicador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
