package br.com.projetofinal.vo;

import java.io.Serializable;

public class EnderecoVO implements Serializable {

	private static final long serialVersionUID = -7484956393966539092L;

	//--> Atributos
	
	private String id;
	private String logradouro;
	private String cep;
	private String bairro;
	private String cidade;
	private EstadoVO estado;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public EstadoVO getEstado() {
		return estado;
	}
	public void setEstado(EstadoVO estado) {
		this.estado = estado;
	}
	
}
