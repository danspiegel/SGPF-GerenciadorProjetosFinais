package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.List;

import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.UniversidadeVO;

public interface UniversidadeDao {

	/**
	 * Método responsável por carregar o combo de Universidades.
	 * @return List<ComboVO>
	 * @throws SQLException
	 */
	public List<ComboVO> carregarUniversidades() throws SQLException;
	
	/**
	 * Método responsável por incluir as universidades.
	 * @param vo UniversidadeVO
	 * @throws SQLException
	 */
	public void incluirUniversidade(UniversidadeVO vo) throws SQLException;
	
}
