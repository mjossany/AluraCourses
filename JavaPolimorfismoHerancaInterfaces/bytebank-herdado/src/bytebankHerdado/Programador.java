package bytebankHerdado;

public class Programador extends Funcionario {

	private int senha;

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public double getBonificacao() {
		return 3000.0;
	}

}
