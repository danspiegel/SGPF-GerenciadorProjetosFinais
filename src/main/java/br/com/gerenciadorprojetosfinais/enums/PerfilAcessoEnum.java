package br.com.gerenciadorprojetosfinais.enums;

public enum PerfilAcessoEnum {

	//--> Campo com nome da tabela de Perfil de Acesso
	PERFIS_ACESSO("perfisacesso"),
		
	//--> Campos da tabela de Perfil de Acesso
	ID("id"),
	DESCRICAO("descricao");
		
	private String valor;
		
	//--> Construtor
		
	PerfilAcessoEnum(String valor){
		this.valor = valor;
	}
		
	//--> Getters e Setters

	public String getValor() {
		return valor;
	}
	
}
