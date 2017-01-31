package br.com.gerenciadorprojetosfinais.vo;

import java.io.Serializable;

/**
 * Classe de relacionamento da tabela telefone_pessoa
 * 
 * @author daniel.spiegel
 *
 */
public class TelefonePessoaVO implements Serializable {

	private static final long serialVersionUID = 5684193322325920418L;
	
	//--> Atributos
	
	private String id;
	private AlunoVO aluno;
	private FuncionarioVO funcionario;
	private TelefoneVO telefone;
	
	//--> Getters e Setters
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public AlunoVO getAluno() {
		return aluno;
	}
	public void setAluno(AlunoVO aluno) {
		this.aluno = aluno;
	}
	public FuncionarioVO getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(FuncionarioVO funcionario) {
		this.funcionario = funcionario;
	}
	public TelefoneVO getTelefone() {
		return telefone;
	}
	public void setTelefone(TelefoneVO telefone) {
		this.telefone = telefone;
	}

}
