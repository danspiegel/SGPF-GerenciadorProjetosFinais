package br.com.gerenciadorprojetosfinais.enums;

public enum UniversidadeFuncionarioEnum {

	//--> Campo com o nome da tabela de universidade_curso
	UNIVERSIDADE_FUNCIONARIO("universidade_funcionario"),
					
	//--> Campos da tabela de universidade_curso
	ID("id"),
	ID_CURSO("id_curso"),
	CNPJ("cnpj"),
	CPF("cpf"),
	DT_INICIO("dt_inicio"),
	DT_FIM("dt_fim"),
	MATRICULA("matricula"),
	SENHA("senha");
		
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
