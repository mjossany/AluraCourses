package bytebankHerdado;

public class Administrador extends Funcionario implements Autenticavel {

	private int senha;

	@Override
	public double getBonificacao() {
		return 100.0;
	}

	@Override
	public void setSenha(int Senha) {
		this.senha = Senha;

	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}
