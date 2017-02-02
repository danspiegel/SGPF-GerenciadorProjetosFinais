package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.FilialVO;

public interface UniversidadeDao {

	/**
	 * Método responsável por carregar o combo de Universidades.
	 * @param listaUniversidades List<ComboVO>
	 * @return List<ComboVO>
	 * @throws SQLException
	 */
	public List<ComboVO> carregarUniversidades(List<ComboVO> listaUniversidades) throws SQLException;
	
	/**
	 * Método responsável por incluir as universidades.
	 * @param vo FilialVO
	 * @throws SQLException
	 */
	public void incluirUniversidade(FilialVO vo) throws SQLException;
	
}
