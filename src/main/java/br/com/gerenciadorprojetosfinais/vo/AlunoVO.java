package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

/**
 * Classe VO de Aluno
 * 
 * @author daniel.spiegel
 *
 */
public class AlunoVO implements Serializable {


	private static final long serialVersionUID = -1766959210171336292L;
	
	//--> Atributos
	
	private String id;
	private String nome;
	private String sobrenome;
	private String email;
	private PerfilAcessoVO perfil;
	
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
	public PerfilAcessoVO getPerfil() {
		return perfil;
	}
	public void setPerfil(PerfilAcessoVO perfil) {
		this.perfil = perfil;
	}
	
}
