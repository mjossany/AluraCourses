package bytebankHerdadoConta.br.com.bytebank.banco.teste;

import bytebankHerdadoConta.br.com.bytebank.banco.modelo.Conta;
import bytebankHerdadoConta.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankHerdadoConta.br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		Conta[] contas = new Conta[5];
		
		ContaCorrente cc1 = new ContaCorrente(4331, 12345);
		ContaPoupanca cc2 = new ContaPoupanca(4331, 12346);
		
		contas[0] = cc1;
		contas[1] = cc2;
		
		ContaPoupanca ref = (ContaPoupanca) contas[1];
		
		
		System.out.println(contas[0].getNumero());

	}

}
