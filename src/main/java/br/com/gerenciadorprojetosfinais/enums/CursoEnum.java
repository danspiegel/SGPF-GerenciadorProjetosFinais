package br.com.gerenciadorprojetosfinais.enums;

public enum CursoEnum {

	//--> Campo com nome da tabela de Cursos
	CURSOS("cursos"),
	
	//--> Campos da tabela de Cursos
	ID("id"),
	CODIGO_CURSO("codigo_curso"),
	DESCRICAO("descricao");
	
	private String valor;
	
	//--> Construtor
	
	CursoEnum(String valor){
		this.valor = valor;
	}
	
	//--> Getters e Setters

	public String getValor() {
		return valor;
	}
	
}
