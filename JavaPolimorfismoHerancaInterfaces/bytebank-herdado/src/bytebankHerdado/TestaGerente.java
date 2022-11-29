package bytebankHerdado;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		
		g1.setNome("Andréia Moura");
		g1.setCpf("123456789-00");
		g1.setSalario(15000.0);
		g1.setSenha(1234);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.autentica(1234));
		
		System.out.println(g1.getBonificacao());
	}

}
