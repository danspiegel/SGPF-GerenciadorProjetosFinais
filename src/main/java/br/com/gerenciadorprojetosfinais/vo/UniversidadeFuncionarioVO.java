package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;
import java.util.Date;

public class UniversidadeFuncionarioVO implements Serializable {

	private static final long serialVersionUID = 2529610285184729379L;

	//--> Atributos
	
	private CursoVO curso;
	private UniversidadeVO universidade;
	private FuncionarioVO funcionario;
	private Date dataInicio;
	private Date dataFim;
	
	//--> Atributo interno (não existe no banco)
	private Integer tipoUsuario;
	
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
	public FuncionarioVO getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(FuncionarioVO funcionario) {
		this.funcionario = funcionario;
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
	public Integer getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(Integer tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
}
