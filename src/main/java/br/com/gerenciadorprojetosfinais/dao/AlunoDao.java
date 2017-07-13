package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

public interface AlunoDao {

	/**
	 * Método responsável por validar os usuários do sistema.
	 * @param vo UsuarioVO
	 * @return UsuarioVO
	 * @throws SQLException
	 */
	public UsuarioVO validarAluno(UsuarioVO vo) throws SQLException;
	
	/**
	 * Método responsável por incluir os alunos.
	 * @param vo UsuarioVO
	 * @throws SQLException
	 */
	public void incluir(UsuarioVO vo) throws SQLException;
	
}
