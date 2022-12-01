package bytebankHerdadoConta.br.com.bytebank.banco.teste;

import bytebankHerdadoConta.br.com.bytebank.banco.modelo.CalculadorDeImposto;
import bytebankHerdadoConta.br.com.bytebank.banco.modelo.ContaCorrente;
import bytebankHerdadoConta.br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteTributaveis {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 22222);
		cc.deposita(100);
		
		SeguroDeVida sv = new SeguroDeVida();
		
		CalculadorDeImposto calc = new CalculadorDeImposto();
		
		calc.registra(sv);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());

	}

}
