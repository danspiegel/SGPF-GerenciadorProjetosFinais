package br.com.gerenciadorprojetosfinais.enums;

public enum UniversidadeEnum {

	//--> Campo com nome da tabela de Universidades
	UNIVERSIDADES("universidades"),
			
	//--> Campos da tabela de Universidades
	CNPJ("cnpj"),
	RAZAO_SOCIAL("razaosocial"),
	NOME_FANTASIA("nomefantasia"),
	DESCRICAO("descricao"),
	MATRIZ("matriz"),
	LOGRADOURO("logradouro"),
	CEP("cep"),
	BAIRRO("bairro"),
	MUNICIPIO("municipio"),
	ID_ESTADO("id_estado"),
	DDD("ddd"),
	TELEFONE("telefone");
	
	private String valor;
	
	//--> Construtor
	
	UniversidadeEnum(String valor){
		this.valor = valor;
	}

	//--> Getters e Setters
	
	public String getValor() {
		return valor;
	}
	
}
