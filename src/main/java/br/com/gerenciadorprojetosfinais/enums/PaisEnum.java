package br.com.gerenciadorprojetosfinais.enums;

public enum PaisEnum {

	//--> Campo com o nome da tabela de Países
	PAISES("paises"),
			
	//--> Campos da tabela de Países
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
