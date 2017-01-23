package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciadorprojetosfinais.dao.EstadoDao;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;

@Service
public class EstadoServiceFacadeImpl implements EstadoServiceFacade {

	@Autowired
	EstadoDao dao;
	
	/**
	 * {@inheritDoc}
	 */
	public List<ComboVO> carregarEstados() throws SQLException{
		return dao.carregarEstados();
	}
	
}
