package bytebankHerdadoConta.br.com.bytebank.banco.teste;

import bytebankHerdadoConta.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankHerdadoConta.br.com.bytebank.banco.modelo.ContaPoupanca;
import bytebankHerdadoConta.br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {

		ContaCorrente cc = new ContaCorrente(4331, 12345);
		ContaPoupanca cp = new ContaPoupanca(4331, 67890);

		System.out.println(cc);
		System.out.println(cp);

	}

}
