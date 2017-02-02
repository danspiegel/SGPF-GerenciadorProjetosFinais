package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

public class FilialVO extends UniversidadeVO implements Serializable {

	private static final long serialVersionUID = -756366766589585941L;
	
	//--> Atributos
	
	private String cnpj;
	private FuncionarioVO responsavel;
	private EnderecoVO endereco;
	private TelefoneVO telefone;
	
	//--> Getters e Setters
	
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public FuncionarioVO getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(FuncionarioVO responsavel) {
		this.responsavel = responsavel;
	}
	public EnderecoVO getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoVO endereco) {
		this.endereco = endereco;
	}
	public TelefoneVO getTelefone() {
		return telefone;
	}
	public void setTelefone(TelefoneVO telefone) {
		this.telefone = telefone;
	}
	
}
