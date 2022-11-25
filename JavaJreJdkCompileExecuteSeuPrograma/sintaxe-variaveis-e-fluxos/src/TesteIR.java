
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3751.1;

		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("IR de 7.5%");
			System.out.println("Deduza R$ 142.0");
		} else if (salario >= 2800.1 && salario <= 3751.0) {
			System.out.println("IR de 15%");
			System.out.println("Deduza R$ 350.0");
		} else {
			System.out.println("IR de 22.5%");
			System.out.println("Deduza R$ 636.0");
		}

	}
}
