package bytebankHerdadoConta.br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import bytebankHerdadoConta.br.com.bytebank.banco.modelo.Conta;
import bytebankHerdadoConta.br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(11, 111);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(22, 222);
		lista.add(cc2);

		System.out.println("Tamanho: " + lista.size());

		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(33, 333);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(44, 444);
		lista.add(cc4);

		for (Object oRef : lista) {
			System.out.println(oRef);
		}

	}

}
