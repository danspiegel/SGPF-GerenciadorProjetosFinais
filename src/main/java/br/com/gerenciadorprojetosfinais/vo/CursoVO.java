package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

public class CursoVO implements Serializable {

	private static final long serialVersionUID = 2640644046819879623L;

	//--> Atributos
	
	private String id;
	private String curso;
	private UniversidadeVO universidade;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public UniversidadeVO getUniversidade() {
		return universidade;
	}
	public void setUniversidade(UniversidadeVO universidade) {
		this.universidade = universidade;
	}
	
}
