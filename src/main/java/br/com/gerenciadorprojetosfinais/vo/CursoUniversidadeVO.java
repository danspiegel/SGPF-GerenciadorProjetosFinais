package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

/**
 * Classe de relacionamento da tabela cursos_universidades
 * 
 * @author daniel.spiegel
 *
 */
public class CursoUniversidadeVO implements Serializable {

	private static final long serialVersionUID = -1280022268962725579L;
	
	//--> Atributos
	
	private String idCurso;
	private String cnpjFilial;
	
	//--> Getters e Setters
	
	public String getIdCurso() {
		return idCurso;
	}
	public void setIdCurso(String idCurso) {
		this.idCurso = idCurso;
	}
	public String getCnpjFilial() {
		return cnpjFilial;
	}
	public void setCnpjFilial(String cnpjFilial) {
		this.cnpjFilial = cnpjFilial;
	}

}
