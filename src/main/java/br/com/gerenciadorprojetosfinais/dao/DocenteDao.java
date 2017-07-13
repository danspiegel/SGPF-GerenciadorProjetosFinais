package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

public interface DocenteDao {

	/**
	 * Método responsável por validar os usuários do sistema.
	 * @param vo UsuarioVO
	 * @return UsuarioVO
	 * @throws SQLException
	 */
	public UsuarioVO validarDocente(UsuarioVO vo) throws SQLException;
	
}
