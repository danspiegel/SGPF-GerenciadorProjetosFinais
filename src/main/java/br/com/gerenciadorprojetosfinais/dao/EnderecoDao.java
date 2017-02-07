package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.EnderecoVO;

public interface EnderecoDao {

	/**
	 * Método responsável por incluir os endereços.
	 * @param id String
	 * @param tabela String
	 * @param vo EnderecoVO
	 * @throws SQLException
	 */
	public void incluir(String id, String tabela, EnderecoVO vo) throws SQLException;
	
}
