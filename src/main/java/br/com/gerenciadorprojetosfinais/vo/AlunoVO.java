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
	private Long matricula;
	private String nome;
	private String sobrenome;
	private String cpf;
	private String email;
	private String senha;
	private CursoVO curso;
	private EnderecoVO endereco;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public CursoVO getCurso() {
		return curso;
	}
	public void setCurso(CursoVO curso) {
		this.curso = curso;
	}
	public EnderecoVO getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoVO endereco) {
		this.endereco = endereco;
	}
	
}
