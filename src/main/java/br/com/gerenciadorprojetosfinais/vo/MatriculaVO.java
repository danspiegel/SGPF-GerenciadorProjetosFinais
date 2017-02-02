package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

public class MatriculaVO implements Serializable {

	private static final long serialVersionUID = 2056467389032517680L;
	
	//--> Atributos
	
	private String id;
	private Long matricula;
	private int situacao;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

}
