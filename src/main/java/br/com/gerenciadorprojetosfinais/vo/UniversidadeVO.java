package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;
import java.util.List;

/**
 * Classe VO de Universidade
 * 
 * @author daniel.spiegel
 *
 */
public class UniversidadeVO implements Serializable {

	private static final long serialVersionUID = -6706436938854484376L;

	//--> Atributos
	
	private String id;
	private String razaoSocial;
	private String nomeFantasia;
	private List<FilialVO> listaFiliais;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public List<FilialVO> getListaFiliais() {
		return listaFiliais;
	}
	public void setListaFiliais(List<FilialVO> listaFiliais) {
		this.listaFiliais = listaFiliais;
	}
	
}
