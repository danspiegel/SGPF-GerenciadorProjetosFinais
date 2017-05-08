package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

public interface LoginServiceFacade {

	public boolean validarUsuario(UsuarioVO vo) throws SQLException;
	
}
