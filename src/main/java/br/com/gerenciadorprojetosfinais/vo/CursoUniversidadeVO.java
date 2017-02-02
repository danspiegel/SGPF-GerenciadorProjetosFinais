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
	
	private CursoVO curso;
	private UniversidadeVO universidade;
	
	//--> Getters e Setters
	
	public CursoVO getCurso() {
		return curso;
	}
	public void setCurso(CursoVO curso) {
		this.curso = curso;
	}
	public UniversidadeVO getUniversidade() {
		return universidade;
	}
	public void setUniversidade(UniversidadeVO universidade) {
		this.universidade = universidade;
	}

	
}
