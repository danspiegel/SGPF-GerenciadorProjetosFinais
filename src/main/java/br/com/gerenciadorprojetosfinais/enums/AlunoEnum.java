package br.com.gerenciadorprojetosfinais.enums;

public enum AlunoEnum {

	//--> Campo com nome da tabela de Alunos
	ALUNOS("alunos"),
	
	//--> Campos da tabela de Alunos
	CPF("cpf"),
	NOME("nome"),
	SOBRENOME("sobrenome"),
	NOMEPAI("nomepai"),
	NOMEMAE("nomemae"),
	LOGRADOURO("logradouro"),
	CEP("cep"),
	BAIRRO("bairro"),
	MUNICIPIO("municipio"),
	ID_ESTADO("id_estado"),
	DDD_TELEFONE("ddd_telefone"),
	TELEFONE("telefone"),
	DDD_CELULAR("ddd_celular"),
	CELULAR("celular"),
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
