package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciadorprojetosfinais.dao.AlunoDao;
import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;

@Service
public class AlunoServiceFacadeImpl implements AlunoServiceFacade {

	@Autowired
	private AlunoDao dao;
	
	/**
	 * {@inheritDoc}
	 */
	public void incluir(GraduacaoVO vo) throws SQLException{
		
	}
	
}
