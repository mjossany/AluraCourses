package br.com.alura.java.io.teste;

import java.io.Serializable;

/**
 * Classe que representa um cliente no Bytebank.
 * 
 * @author jossanymoura
 *
 */
public class Cliente implements Serializable{

	private static final long serialVersionUID = 1L;
	private String nome;

	public void setNome(String string) {
		this.nome = string;

	}

	public String getNome() {
		return this.nome;
	}

}
