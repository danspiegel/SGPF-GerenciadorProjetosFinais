package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * Classe VO de Funcion�rio
 *
 * @author daniel.spiegel
 *
 */
public class FuncionarioVO implements Serializable {

	private static final long serialVersionUID = 3603083372894900855L;

	//--> Atributos
	
	private String id;
	private String nome;
	private String sobrenome;
	private String email;
	private String cargo;
	private Integer perfil;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Integer getPerfil() {
		return perfil;
	}
	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}
	
}
