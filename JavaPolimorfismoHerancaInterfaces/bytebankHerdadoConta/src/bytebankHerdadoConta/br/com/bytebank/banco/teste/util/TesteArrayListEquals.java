package bytebankHerdadoConta.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import bytebankHerdadoConta.br.com.bytebank.banco.modelo.Conta;
import bytebankHerdadoConta.br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc1 = new ContaCorrente(11, 111);
		Conta cc2 = new ContaCorrente(11, 111);

		lista.add(cc1);

		boolean contaExiste = lista.contains(cc2);
		System.out.println(contaExiste);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

	}

}
