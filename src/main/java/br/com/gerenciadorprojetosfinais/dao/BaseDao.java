package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

public interface BaseDao {

	/**
	 * Método responsável por validar a quantidade de vezes que um registro existe
	 * em uma determinada tabela e em um determinado campo.
	 * @param valor String
	 * @param coluna String
	 * @param tabela String
	 * @return Integer
	 * @throws SQLException
	 */
	public Integer validarCamposInternos(String valor, String coluna, String tabela) throws SQLException;
	
}
