package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.EnderecoVO;

public interface EnderecoDao {

	/**
	 * M�todo respons�vel por incluir os endere�os.
	 * @param vo EnderecoVO
	 * @throws SQLException
	 */
	public void incluir(EnderecoVO vo) throws SQLException;
	
}
