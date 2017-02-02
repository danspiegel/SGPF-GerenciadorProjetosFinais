package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

public class FuncionarioUniversidadeVO implements Serializable {

	private static final long serialVersionUID = 3750716192988768243L;
	
	//--> Atributos
	
	private FuncionarioVO funcionario;
	private UniversidadeVO universidade;
	
	//--> Getters e Setters
	
	public FuncionarioVO getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(FuncionarioVO funcionario) {
		this.funcionario = funcionario;
	}
	public UniversidadeVO getUniversidade() {
		return universidade;
	}
	public void setUniversidade(UniversidadeVO universidade) {
		this.universidade = universidade;
	}
	
}
