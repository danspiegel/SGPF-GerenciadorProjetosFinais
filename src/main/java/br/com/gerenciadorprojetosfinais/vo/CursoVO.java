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
	private String descricao;
	private UniversidadeVO universidade;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCodCurso() {
		return codCurso;
	}
	public void setCodCurso(String codCurso) {
		this.codCurso = codCurso;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public UniversidadeVO getUniversidade() {
		return universidade;
	}
	public void setUniversidade(UniversidadeVO universidade) {
		this.universidade = universidade;
	}
	
}
