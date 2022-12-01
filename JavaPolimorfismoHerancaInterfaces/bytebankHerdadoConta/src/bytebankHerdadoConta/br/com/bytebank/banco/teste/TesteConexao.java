package bytebankHerdadoConta.br.com.bytebank.banco.teste;

import bytebankHerdadoConta.br.com.bytebank.banco.modelo.Conexao;

public class TesteConexao {

	public static void main(String[] args) throws Exception {

		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
			conexao.fecha();
		} catch (IllegalStateException ex) {
			System.out.println("Deu erro na conexão");
		}
	}
}
