package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;
import java.util.Date;

public class GraduacaoVO implements Serializable {

	private static final long serialVersionUID = 8566207624133109053L;
	
	//--> Atributos
	
	private CursoVO curso;
	private UniversidadeVO universidade;
	private AlunoVO aluno;
	private FuncionarioVO orientador;
	private Long matricula;
	private String senha;
	private Date dataInicio;
	private Date dataFim;
	
	//--> Getters e Setters
	
	public CursoVO getCurso() {
		return curso;
	}
	public void setCurso(CursoVO curso) {
		this.curso = curso;
	}
	public UniversidadeVO getUniversidade() {
		return universidade;
	}
	public void setUniversidade(UniversidadeVO universidade) {
		this.universidade = universidade;
	}
	public AlunoVO getAluno() {
		return aluno;
	}
	public void setAluno(AlunoVO aluno) {
		this.aluno = aluno;
	}
	public FuncionarioVO getOrientador() {
		return orientador;
	}
	public void setOrientador(FuncionarioVO orientador) {
		this.orientador = orientador;
	}
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
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

}
