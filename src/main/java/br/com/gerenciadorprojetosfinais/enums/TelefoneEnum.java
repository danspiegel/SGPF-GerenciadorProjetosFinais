package br.com.gerenciadorprojetosfinais.enums;

public enum TelefoneEnum {

	//--> Campo com o nome da tabela de Telefones
	TELEFONES("telefones"),
			
	//--> Campos da tabela de Telefones
	ID("id"),
	DDD("ddd"),
	NUMERO("numero");
	
	private String valor;
	
	//--> Construtor
	
	TelefoneEnum(String valor){
		this.valor = valor;
	}

	//--> Getters e Setters
	
	public String getValor() {
		return valor;
	}
	
}
