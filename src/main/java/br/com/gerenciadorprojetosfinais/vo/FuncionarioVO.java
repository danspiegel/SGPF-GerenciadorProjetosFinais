package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

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
	private String cpf;
	private String email;
	private String cargo;
	private String senha;
	private EnderecoVO endereco;
	private MatriculaVO matricula;
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
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
	public EnderecoVO getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoVO endereco) {
		this.endereco = endereco;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public MatriculaVO getMatricula() {
		return matricula;
	}
	public void setMatricula(MatriculaVO matricula) {
		this.matricula = matricula;
	}
	
}
