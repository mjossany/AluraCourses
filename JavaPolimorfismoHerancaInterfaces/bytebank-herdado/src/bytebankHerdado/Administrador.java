package bytebankHerdado;

public class Administrador extends Funcionario implements Autenticavel {

	private AutenticacaoUtil autenticador;

	public Administrador() {
		this.autenticador = new AutenticacaoUtil();
	}

	@Override
	public double getBonificacao() {
		return 100.0;
	}

	@Override
	public void setSenha(int Senha) {
		this.autenticador.setSenha(Senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
