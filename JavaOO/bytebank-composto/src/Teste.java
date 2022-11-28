
public class Teste {

	public static void main(String[] args) {

		Conta contaDoCliente = new Conta(123, 456);
		contaDoCliente.setTitular(new Cliente());

		contaDoCliente.getTitular().setNome("Jossany Moura");
		
		System.out.println(Conta.getTotalDeContas());

	}
}
