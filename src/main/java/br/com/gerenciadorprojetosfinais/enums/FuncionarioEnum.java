package br.com.gerenciadorprojetosfinais.enums;

public enum FuncionarioEnum {

	//--> Campo com o nome da tabela de Funcionários
	FUNCIONARIOS("funcionarios"),
	
	//--> Campos da tabela de Funcionários
	ID("id"),
	NOME("nome"),
	SOBRENOME("sobrenome"),
	CPF("cpf"),
	EMAIL("email"),
	CARGO("cargo"),
	SENHA("senha");
	
	private String valor;
	
	//--> Construtor
	
	FuncionarioEnum(String valor){
		this.valor = valor;
	}

	//--> Getters e Setters
	
	public String getValor() {
		return valor;
	}
	
}
