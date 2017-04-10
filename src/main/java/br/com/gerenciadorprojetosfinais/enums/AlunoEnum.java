package br.com.gerenciadorprojetosfinais.enums;

public enum AlunoEnum {

	//--> Campo com nome da tabela de Alunos
	ALUNOS("alunos"),
	
	//--> Campos da tabela de Alunos
	ID("id"),
	NOME("nome"),
	SOBRENOME("sobrenome"),
	EMAIL("email");
	
	private String valor;
	
	//--> Construtor
	
	AlunoEnum(String valor){
		this.valor = valor;
	}
	
	//--> Getters e Setters

	public String getValor() {
		return valor;
	}
	
}
