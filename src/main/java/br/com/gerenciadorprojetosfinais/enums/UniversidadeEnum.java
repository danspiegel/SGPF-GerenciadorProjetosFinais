package br.com.gerenciadorprojetosfinais.enums;

public enum UniversidadeEnum {

	//--> Campo com nome da tabela de Universidades
	UNIVERSIDADES("universidades"),
			
	//--> Campos da tabela de Universidades
	ID("id"),
	RAZAO_SOCIAL("razaosocial"),
	NOME_FANTASIA("nomefantasia");
	
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
