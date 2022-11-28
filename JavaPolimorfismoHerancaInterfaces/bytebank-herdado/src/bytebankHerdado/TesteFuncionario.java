package bytebankHerdado;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario jossany = new Funcionario();

		jossany.setNome("Jossany Moura");
		jossany.setCpf("165324575-1");
		jossany.setSalario(5000.0);

		System.out.println(jossany.getNome());
		System.out.println(jossany.getBonificacao());

	}

}
