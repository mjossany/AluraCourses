
public class Teste {

	public static void main(String[] args) {

		Conta contaDoCliente = new Conta();
		contaDoCliente.setTitular(new Cliente());

		contaDoCliente.getTitular().setNome("Jossany Moura");

	}
}
