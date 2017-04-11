package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

public class PerfilAcessoVO implements Serializable {

	private static final long serialVersionUID = 1655812081026654475L;

	//--> Atributos
	
	private Integer id;
	private String descricao;
	
	//--> Getters e Setters
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
}
