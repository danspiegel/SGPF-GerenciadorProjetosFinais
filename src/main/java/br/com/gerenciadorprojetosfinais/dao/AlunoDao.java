package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

public interface AlunoDao {

	/**
	 * M�todo respons�vel por validar os usu�rios do sistema.
	 * @param vo UsuarioVO
	 * @return UsuarioVO
	 * @throws SQLException
	 */
	public UsuarioVO validarAluno(UsuarioVO vo) throws SQLException;
	
	/**
	 * M�todo respons�vel por incluir os alunos.
	 * @param vo UsuarioVO
	 * @throws SQLException
	 */
	public void incluir(UsuarioVO vo) throws SQLException;
	
}
