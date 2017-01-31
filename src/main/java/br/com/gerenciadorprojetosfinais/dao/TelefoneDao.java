package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.UUID;

import br.com.gerenciadorprojetosfinais.vo.TelefoneVO;

public interface TelefoneDao {

	/**
	 * Método responsável por realizar a inclusão de telefones.
	 * @param vo TelefoneVO
	 * @return UUID
	 * @throws SQLException
	 */
	public UUID incluir(TelefoneVO vo) throws SQLException;
	
}
