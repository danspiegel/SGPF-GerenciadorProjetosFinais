package br.com.projetofinal.dao;

import java.sql.SQLException;

import br.com.projetofinal.vo.AlunoVO;

public interface AlunoDao {

	/**
	 * Método responsável por validar os usuários do sistema.
	 * 
	 * @param vo AlunoVO
	 * @return boolean
	 */
	public boolean validarUsuario(AlunoVO vo) throws SQLException;
	
}
