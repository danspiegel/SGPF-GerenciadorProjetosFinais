package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciadorprojetosfinais.dao.UniversidadeDao;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.UniversidadeVO;

@Service
public class UniversidadeServiceFacadeImpl implements UniversidadeServiceFacade {

	@Autowired
	UniversidadeDao dao;
	
	/**
	 * {@inheritDoc}
	 */
	public List<ComboVO> carregarUniversidades() throws SQLException{
		return  dao.carregarUniversidades();
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void incluirUniversidade(UniversidadeVO vo) throws SQLException {
		dao.incluirUniversidade(vo);
	}
	
}
