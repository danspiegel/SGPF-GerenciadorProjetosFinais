package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.gerenciadorprojetosfinais.vo.ComboVO;

public interface EstadoDao {

	/**
	 * Método responsável por carregar os combos de estados nos cadastros.
	 * @return List<ComboVO>
	 * @throws SQLException
	 */
	public List<ComboVO> carregarEstados() throws SQLException;
	
}
