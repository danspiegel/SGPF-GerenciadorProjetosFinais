package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.AlunoVO;

public interface AlunoDao {

	/**
	 * M�todo respons�vel por validar os usu�rios do sistema.
	 * @param vo AlunoVO
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean validarUsuario(AlunoVO vo) throws SQLException;
	
	/**
	 * M�todo respons�vel por contar quantos registros existem no campo informado de acordo com o valor informado.
	 * @param valor String
	 * @param campo String
	 * @return Integer
	 * @throws SQLException
	 */
	public Integer contar(String valor, String campo) throws SQLException;
	
}
