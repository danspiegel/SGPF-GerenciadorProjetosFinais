package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;
import java.util.List;

import br.com.gerenciadorprojetosfinais.vo.ComboVO;

public interface EstadoServiceFacade {

	/**
	 * Método responsável por carregar os combos de estados nos cadastros.
	 * @return List<ComboVO>
	 * @throws SQLException
	 */
	public List<ComboVO> carregarEstados() throws SQLException;
	
}
