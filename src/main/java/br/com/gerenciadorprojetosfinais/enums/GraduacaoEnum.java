package br.com.gerenciadorprojetosfinais.enums;

public enum GraduacaoEnum {

	//--> Campo com o nome da tabela de Graduação
	GRADUACAO("graduacao"),
		
	//--> Campos da tabela de Graduação
	ID_CURSO("id_curso"),
	CNPJ("cnpj"),
	CPF("cpf"),
	MATRICULA("matricula"),
	SENHA("senha"),
	DT_INICIO("dt_inicio"),
	DT_FIM("dt_fim"),
	ID_ORIENTADOR("id_orientador");
		
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
