package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

public class UsuarioVO implements Serializable {

	private static final long serialVersionUID = -7065972851571432166L;

	//--> Atributos
	
	private Integer tipoUsuario;
	private Long matricula;
	private String senha;
	private GraduacaoVO aluno;
	private UniversidadeFuncionarioVO docente;
	
	//--> Getters e Setters
	
	public Long getMatricula() {
		return matricula;
	}
	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Integer getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	public GraduacaoVO getAluno() {
		return aluno;
	}
	public void setAluno(GraduacaoVO aluno) {
		this.aluno = aluno;
	}
	public UniversidadeFuncionarioVO getDocente() {
		return docente;
	}
	public void setDocente(UniversidadeFuncionarioVO docente) {
		this.docente = docente;
	}
	
}
