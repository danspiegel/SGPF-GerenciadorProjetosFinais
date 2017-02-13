package br.com.gerenciadorprojetosfinais.enums;

public enum EstadoEnum {

	//--> Nome da tabela de estados
	ESTADOS("estados"),
			
	//--> Campos da tabela de estados
	ID("id"),
	NOME("nome"),
	SIGLA("sigla"),
	ID_PAIS("id_pais");
	
	private String valor;
	
	//--> Construtor
	
	EstadoEnum(String valor){
		this.valor = valor;
	}

	//--> Getters e Setters
	
	public String getValor() {
		return valor;
	}
	
}
