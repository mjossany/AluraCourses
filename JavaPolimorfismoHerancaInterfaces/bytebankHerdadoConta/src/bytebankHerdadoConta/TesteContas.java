package bytebankHerdadoConta;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(4331, 12345);
		ContaPoupanca cp = new ContaPoupanca(4331, 67890);

		cc.deposita(200.0);
		cp.deposita(300.0);

		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());

		try {
			cp.transfere(350.0, cc);
			cc.saca(50.0);
		} catch (SaldoInsuficienteException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());

	}

}
