package br.com.gerenciadorprojetosfinais.enums;

public enum PaisEnum {

	//--> Campo com o nome da tabela de Pa�ses
	PAISES("paises"),
			
	//--> Campos da tabela de Pa�ses
	ID("id"),
	NOME("nome"),
	SIGLA("sigla");
	
	private String valor;
			
	//--> Construtor
			
	PaisEnum(String valor){
		this.valor = valor;
	}

	//--> Getters e Setters
			
	public String getValor() {
		return valor;
	}
	
}
