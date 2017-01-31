package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

public class FuncionarioUniversidadeVO implements Serializable {

	private static final long serialVersionUID = 3750716192988768243L;
	
	//--> Atributos
	
	private String idFuncionario;
	private String cnpjFilial;
	
	//--> Getters e Setters
	
	public String getIdFuncionario() {
		return idFuncionario;
	}
	public void setIdFuncionario(String idFuncionario) {
		this.idFuncionario = idFuncionario;
	}
	public String getCnpjFilial() {
		return cnpjFilial;
	}
	public void setCnpjFilial(String cnpjFilial) {
		this.cnpjFilial = cnpjFilial;
	}

}
