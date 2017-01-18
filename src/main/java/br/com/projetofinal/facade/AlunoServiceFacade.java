package br.com.projetofinal.facade;

import java.sql.SQLException;

import br.com.projetofinal.vo.AlunoVO;

public interface AlunoServiceFacade {

	public boolean validarUsuario(AlunoVO vo) throws SQLException;
	
}
