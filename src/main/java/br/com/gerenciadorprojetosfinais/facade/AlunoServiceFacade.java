package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;

public interface AlunoServiceFacade {

	/**
	 * Método responsável por validar os dados do usuário.
	 * @param vo GraduacaoVO
	 * @return boolean
	 * @throws SQLException
	 * @throws BusinessException
	 */
	public boolean validarUsuario(GraduacaoVO vo) throws SQLException, BusinessException;
	
}
