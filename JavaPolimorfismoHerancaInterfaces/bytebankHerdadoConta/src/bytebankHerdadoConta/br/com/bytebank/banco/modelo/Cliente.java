package bytebankHerdadoConta.br.com.bytebank.banco.modelo;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author jossanymoura
 *
 */
public class Cliente implements Serializable{

	private String nome;

	public void setNome(String string) {
		this.nome = string;

	}

	public String getNome() {
		return this.nome;
	}

}
