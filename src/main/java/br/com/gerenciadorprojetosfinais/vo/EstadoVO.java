package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

/**
 * Classe VO de Estado
 * 
 * @author daniel.spiegel
 *
 */
public class EstadoVO implements Serializable {

	private static final long serialVersionUID = -6006004430112522504L;

	//--> Atributos
	
	private String id;
	private int codEstado;
	private String nome;
	private String sigla;
	private PaisVO pais;
	
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
	public PaisVO getPais() {
		return pais;
	}
	public void setPais(PaisVO pais) {
		this.pais = pais;
	}
	public int getCodEstado() {
		return codEstado;
	}
	public void setCodEstado(int codEstado) {
		this.codEstado = codEstado;
	}
	
}
