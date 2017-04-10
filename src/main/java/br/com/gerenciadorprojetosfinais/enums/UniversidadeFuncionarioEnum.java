package br.com.gerenciadorprojetosfinais.enums;

public enum UniversidadeFuncionarioEnum {

	//--> Campo com o nome da tabela de universidade_curso
	UNIVERSIDADE_FUNCIONARIO("universidade_funcionario"),
					
	//--> Campos da tabela de universidade_curso
	ID_CURSO("id_curso"),
	ID_UNIVERSIDADE("id_universidade"),
	ID_FUNCIONARIO("id_funcionario"),
	MATRICULA("matricula"),
	SENHA("senha"),
	DT_INICIO("dt_inicio"),
	DT_FIM("dt_fim");
		
	private String valor;
					
	//--> Construtor
					
	UniversidadeFuncionarioEnum(String valor){
		this.valor = valor;
	}

	//--> Getters e Setters
					
	public String getValor() {
		return valor;
	}
	
}
