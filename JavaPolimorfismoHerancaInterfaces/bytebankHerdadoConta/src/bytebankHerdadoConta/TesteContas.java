package bytebankHerdadoConta;

public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(4331, 12345);
		ContaPoupanca cp = new ContaPoupanca(4331, 67890);

		cc.deposita(200.0);
		cp.deposita(300.0);

		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());
		
		cp.transfere(150.0, cc);
		cc.saca(50.0);

		System.out.println("Saldo CC: " + cc.getSaldo());
		System.out.println("Saldo CP: " + cp.getSaldo());

	}

}
