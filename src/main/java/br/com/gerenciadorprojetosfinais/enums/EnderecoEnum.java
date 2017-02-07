package br.com.gerenciadorprojetosfinais.enums;

public enum EnderecoEnum {

	//--> Campo com o nome da tabela de Endereços
	ENDERECOS("enderecos"),
				
	//--> Campos da tabela de Endereços
	ID("id"),
	LOGRADOURO("logradouro"),
	CEP("cep"),
	BAIRRO("bairro"),
	MUNICIPIO("municipio"),
	ID_ESTADO("id_estado"),
	ID_ALUNO("id_aluno"),
	ID_FUNCIONARIO("id_funcionario"),
	CNPJ_FILIAL("cnpj_filial");
		
	private String valor;
		
	//--> Construtor
		
	EnderecoEnum(String valor){
		this.valor = valor;
	}

	//--> Getters e Setters
		
	public String getValor() {
		return valor;
	}
	
}
