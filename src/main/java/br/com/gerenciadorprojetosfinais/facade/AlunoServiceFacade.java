package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.vo.AlunoVO;

public interface AlunoServiceFacade {

	/**
	 * Método responsável por validar os dados do usuário.
	 * @param vo AlunoVO
	 * @return boolean
	 * @throws SQLException
	 * @throws BusinessException
	 */
	public boolean validarUsuario(AlunoVO vo) throws SQLException, BusinessException;
	
}
