package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import br.com.gerenciadorprojetosfinais.vo.AlunoVO;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;

public interface AlunoDao {

	/**
	 * Método responsável por validar os usuários do sistema.
	 * @param vo GraduacaoVO
	 * @return boolean
	 * @throws SQLException
	 */
	public boolean validarUsuario(GraduacaoVO vo) throws SQLException;
	
	/**
	 * Método responsável por contar quantos registros existem no campo informado de acordo com o valor informado.
	 * @param valor String
	 * @param campo String
	 * @return Integer
	 * @throws SQLException
	 */
	public Integer contar(String valor, String campo) throws SQLException;
	
	/**
	 * Método responsável por incluir os alunos.
	 * @param vo GraduacaoVO
	 * @throws SQLException
	 */
	public void incluir(GraduacaoVO vo) throws SQLException;
	
}
