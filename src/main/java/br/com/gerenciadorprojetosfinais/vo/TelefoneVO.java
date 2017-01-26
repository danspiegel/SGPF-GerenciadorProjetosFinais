package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

/**
 * Classe VO de Telefone
 * 
 * @author daniel.spiegel
 *
 */
public class TelefoneVO implements Serializable {

	private static final long serialVersionUID = 1698948147621821283L;

	//--> Atributos
	
	private String id;
	private String ddd;
	private String numero;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDdd() {
		return ddd;
	}
	public void setDdd(String ddd) {
		this.ddd = ddd;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
