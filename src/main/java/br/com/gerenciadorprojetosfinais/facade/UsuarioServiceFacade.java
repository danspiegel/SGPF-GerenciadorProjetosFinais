package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

public interface UsuarioServiceFacade {

	/**
	 * Método responsável por validar os usuários da aplicação.
	 * @param vo UsuarioVO
	 * @return UsuarioVO
	 * @throws SQLException
	 */
	public UsuarioVO validarUsuario(UsuarioVO vo) throws SQLException, BusinessException;
	
}
