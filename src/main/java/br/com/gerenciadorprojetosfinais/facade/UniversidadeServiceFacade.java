package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;
import java.util.List;

import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.UniversidadeVO;

public interface UniversidadeServiceFacade {

	/**
	 * Método responsável por carregar o combo de Universidades.
	 * @param listaUniversidades List<ComboVO>
	 * @return List<ComboVO>
	 * @throws SQLException
	 */
	public List<ComboVO> carregarUniversidades(List<ComboVO> listaUniversidades) throws SQLException;
	
	/**
	 * Método responsável por incluir as universidades.
	 * @param vo UniversidadeVO
	 * @throws SQLException
	 */
	public void incluir(UniversidadeVO vo) throws SQLException;
	
}
