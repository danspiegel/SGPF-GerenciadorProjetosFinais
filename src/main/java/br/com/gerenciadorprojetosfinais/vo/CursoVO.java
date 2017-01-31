package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

/**
 * Classe VO de Curso
 * 
 * @author daniel.spiegel
 *
 */
public class CursoVO implements Serializable {

	private static final long serialVersionUID = 2640644046819879623L;

	//--> Atributos
	
	private String id;
	private String codCurso;
	private String curso;
	
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
	public String getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}
	
}
