package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

public interface AlunoServiceFacade {

	/**
	 * M�todo respons�vel por incluir os Alunos.
	 * @param vo UsuarioVO
	 * @throws SQLException
	 */
	public void incluir(UsuarioVO vo) throws SQLException;
	
}
