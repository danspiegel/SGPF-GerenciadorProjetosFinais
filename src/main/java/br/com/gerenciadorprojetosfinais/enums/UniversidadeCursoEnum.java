package br.com.gerenciadorprojetosfinais.enums;

public enum UniversidadeCursoEnum {

	//--> Campo com o nome da tabela de universidade_curso
	UNIVERSIDADE_CURSO("universidade_curso"),
				
	//--> Campos da tabela de universidade_curso
	ID_CURSO("id_curso"),
	CNPJ("cnpj");
	
	private String valor;
				
	//--> Construtor
				
	UniversidadeCursoEnum(String valor){
		this.valor = valor;
	}

	//--> Getters e Setters
				
	public String getValor() {
		return valor;
	}
	
}
