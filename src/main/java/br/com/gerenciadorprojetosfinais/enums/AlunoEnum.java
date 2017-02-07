package br.com.gerenciadorprojetosfinais.enums;

public enum AlunoEnum {

	//--> Campo com nome da tabela de Alunos
	ALUNOS("alunos"),
	
	//--> Campos da tabela de Alunos
	ID("id"),
	MATRICULA("matricula"),
	SENHA("senha"),
	NOME("nome"),
	SOBRENOME("sobrenome"),
	CPF("cpf"),
	EMAIL("email"),
	ID_CURSO("id_curso"),
	ID_ENDERECO("id_endereco");
	
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
