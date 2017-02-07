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
	
	private String cnpj;
	private String razaoSocial;
	private String nomeFantasia;
	private String descricao;
	private int matriz;
	private String logradouro;
	private String cep;
	private String bairro;
	private String municipio;
	private EstadoVO estado;
	private String ddd;
	private String telefone;
	
	//--> Getters e Setters
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getMatriz() {
		return matriz;
	}
	public void setMatriz(int matriz) {
		this.matriz = matriz;
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
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public EstadoVO getEstado() {
		return estado;
	}
	public void setEstado(EstadoVO estado) {
		this.estado = estado;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
