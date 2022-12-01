package bytebankHerdadoConta.br.com.bytebank.banco.teste.especial;

import bytebankHerdadoConta.br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int agencia, int numero) {
		super(agencia, numero);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
	}

	
}
