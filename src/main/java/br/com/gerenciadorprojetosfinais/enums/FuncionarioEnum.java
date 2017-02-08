package br.com.gerenciadorprojetosfinais.enums;

public enum FuncionarioEnum {

	//--> Campo com o nome da tabela de Funcionários
	FUNCIONARIOS("funcionarios"),
	
	//--> Campos da tabela de Funcionários
	CPF("cpf"),
	NOME("nome"),
	SOBRENOME("sobrenome"),
	EMAIL("email"),
	CARGO("cargo"),
	LOGRADOURO("logradouro"),
	CEP("cep"),
	BAIRRO("bairro"),
	MUNICIPIO("municipio"),
	ID_ESTADO("id_estado"),
	DDD_TELEFONE("ddd_telefone"),
	TELEFONE("telefone"),
	DDD_CELULAR("ddd_celular"),
	CELULAR("celular");
	
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
