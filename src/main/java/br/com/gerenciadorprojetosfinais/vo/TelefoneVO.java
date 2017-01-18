package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

public class TelefoneVO implements Serializable {

	private static final long serialVersionUID = 1698948147621821283L;

	//--> Atributos
	
	private String id;
	private String numeroDdd;
	private String telefone;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNumeroDdd() {
		return numeroDdd;
	}
	public void setNumeroDdd(String numeroDdd) {
		this.numeroDdd = numeroDdd;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
}
