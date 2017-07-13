package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

public interface UsuarioServiceFacade {

	/**
	 * M�todo respons�vel por validar os usu�rios da aplica��o.
	 * @param vo UsuarioVO
	 * @return UsuarioVO
	 * @throws SQLException
	 */
	public UsuarioVO validarUsuario(UsuarioVO vo) throws SQLException, BusinessException;
	
}
