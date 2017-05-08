package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;

public interface AlunoServiceFacade {

	/**
	 * M�todo respons�vel por incluir os Alunos.
	 * @param vo GraduacaoVO
	 * @throws SQLException
	 */
	public void incluir(GraduacaoVO vo) throws SQLException;
	
}
