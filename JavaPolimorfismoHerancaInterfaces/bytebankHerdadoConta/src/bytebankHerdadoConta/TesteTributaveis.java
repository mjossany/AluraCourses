package bytebankHerdadoConta;

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
