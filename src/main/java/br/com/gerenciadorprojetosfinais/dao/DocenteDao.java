package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

public interface DocenteDao {

	/**
	 * M�todo respons�vel por validar os usu�rios do sistema.
	 * @param vo UsuarioVO
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean validarDocente(UsuarioVO vo) throws SQLException;
	
}
