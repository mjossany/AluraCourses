package bytebankHerdado;

public class TesteSistema {

	public static void main(String[] args) {
		
		Autenticavel g1 = new Gerente();
		g1.setSenha(2222);
		
		Autenticavel adm1 = new Administrador();
		adm1.setSenha(222);
		
		SistemaInterno sistema = new SistemaInterno();
		sistema.autentica(g1);
		sistema.autentica(adm1);

	}

}
