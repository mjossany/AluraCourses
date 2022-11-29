package bytebankHerdado;

public class Cliente implements Autenticavel {

	private int senha;

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
