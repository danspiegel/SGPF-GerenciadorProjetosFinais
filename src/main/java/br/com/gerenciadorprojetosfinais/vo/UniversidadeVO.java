package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

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
	private String cnpj;
	private FuncionarioVO responsavel;
	private EnderecoVO endereco;
	private TelefonePessoaVO telefonePessoa;
	
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
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public EnderecoVO getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoVO endereco) {
		this.endereco = endereco;
	}
	public FuncionarioVO getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(FuncionarioVO responsavel) {
		this.responsavel = responsavel;
	}
	public TelefonePessoaVO getTelefonePessoa() {
		return telefonePessoa;
	}
	public void setTelefonePessoa(TelefonePessoaVO telefonePessoa) {
		this.telefonePessoa = telefonePessoa;
	}
	
}
