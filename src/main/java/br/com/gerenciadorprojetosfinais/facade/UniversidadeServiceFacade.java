package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;
import java.util.List;

import br.com.gerenciadorprojetosfinais.vo.ComboVO;

public interface UniversidadeServiceFacade {

	/**
	 * Método responsável por carregar o combo de Universidades.
	 * @param listaUniversidades List<ComboVO>
	 * @return List<ComboVO>
	 * @throws SQLException
	 */
	public List<ComboVO> carregarUniversidades(List<ComboVO> listaUniversidades) throws SQLException;
	
}
