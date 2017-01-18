package br.com.projetofinal.vo;

import java.io.Serializable;

public class PaisVO implements Serializable {

	private static final long serialVersionUID = 8401204189357088225L;

	//--> Atributos
	
	private String id;
	private String nome;
	private String sigla;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
