package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.AlunoVO;

public interface AlunoServiceFacade {

	public boolean validarUsuario(AlunoVO vo) throws SQLException;
	
}
