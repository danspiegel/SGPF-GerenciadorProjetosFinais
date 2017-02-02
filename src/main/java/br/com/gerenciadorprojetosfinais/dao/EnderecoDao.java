package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.EnderecoVO;

public interface EnderecoDao {

	/**
	 * Método responsável por incluir os endereços.
	 * @param vo EnderecoVO
	 * @throws SQLException
	 */
	public void incluir(EnderecoVO vo) throws SQLException;
	
}
