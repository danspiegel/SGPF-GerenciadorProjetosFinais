package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciadorprojetosfinais.dao.UniversidadeDao;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.FilialVO;

@Service
public class UniversidadeServiceFacadeImpl implements UniversidadeServiceFacade {

	@Autowired
	UniversidadeDao dao;
	
	/**
	 * {@inheritDoc}
	 */
	public List<ComboVO> carregarUniversidades(List<ComboVO> listaUniversidades) throws SQLException{
		return  dao.carregarUniversidades(listaUniversidades);
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void incluirUniversidade(FilialVO vo) throws SQLException {
		dao.incluirUniversidade(vo);
	}
	
}
