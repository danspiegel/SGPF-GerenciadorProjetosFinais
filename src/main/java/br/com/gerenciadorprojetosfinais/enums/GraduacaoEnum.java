package br.com.gerenciadorprojetosfinais.enums;

public enum GraduacaoEnum {

	//--> Campo com o nome da tabela de Graduação
	GRADUACAO("graduacao"),
		
	//--> Campos da tabela de Graduação
	ID_CURSO("id_curso"),
	ID_UNIVERSIDADE("id_universidade"),
	ID_ALUNO("id_aluno"),
	ID_ORIENTADOR("id_orientador"),
	MATRICULA("matricula"),
	SENHA("senha"),
	DT_INICIO("dt_inicio"),
	DT_FIM("dt_fim");
		
	private String valor;
		
	//--> Construtor
		
	GraduacaoEnum(String valor){
		this.valor = valor;
	}

	//--> Getters e Setters
		
	public String getValor() {
		return valor;
	}
	
}
