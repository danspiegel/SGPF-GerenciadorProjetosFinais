package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

/**
 * Classe VO para carregar combobox
 * 
 * @author daniel.spiegel
 *
 */
public class ComboVO implements Serializable {

	private static final long serialVersionUID = -6978358076235461922L;

	//--> Atributos
	
	private String id;
	private String descricao;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
