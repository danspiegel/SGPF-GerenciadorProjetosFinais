package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.AlunoVO;

public interface AlunoDao {

	/**
	 * Método responsável por validar os usuários do sistema.
	 * @param vo AlunoVO
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean validarUsuario(AlunoVO vo) throws SQLException;
	
}
