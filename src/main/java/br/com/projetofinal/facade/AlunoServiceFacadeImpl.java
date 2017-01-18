package br.com.projetofinal.facade;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetofinal.dao.AlunoDao;
import br.com.projetofinal.vo.AlunoVO;

@Service
public class AlunoServiceFacadeImpl implements AlunoServiceFacade {

	@Autowired
	private AlunoDao dao;
	
	public boolean validarUsuario(AlunoVO vo) throws SQLException{
		return dao.validarUsuario(vo);
	}
	
}
