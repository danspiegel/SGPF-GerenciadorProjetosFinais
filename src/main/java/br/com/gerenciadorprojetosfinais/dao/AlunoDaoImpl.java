package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.AlunoEnum;
import br.com.gerenciadorprojetosfinais.enums.CursoEnum;
import br.com.gerenciadorprojetosfinais.enums.GraduacaoEnum;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

@Repository
public class AlunoDaoImpl extends BaseDao implements AlunoDao {
	
	//--> Campo genérico
	private static final String VALOR    = "valor";
	
	//--> Campos de apelido SQL
	private static final String A        = " A";
	private static final String G        = " G";
	private static final String C        = " C";
	private static final String U        = " U";
	
	/**
	 * {@inheritDoc}
	 */
	public boolean validarAluno(UsuarioVO vo) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(GraduacaoEnum.MATRICULA.getValor(), vo.getMatricula());
			params.addValue(GraduacaoEnum.SENHA.getValor(), vo.getSenha());
			
			StringBuilder sql = new StringBuilder();
		
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), params);
			Iterator<Map<String, Object>> iterator = resultSet.iterator();
			
			if (iterator.hasNext()){
				
				for (Map<String, Object> resultado: resultSet){
					/*
					vo.getAluno().setNome(resultado.get(A + PONTO + AlunoEnum.NOME.getValor()).toString());
					vo.getAluno().setSobrenome(resultado.get(A + PONTO + AlunoEnum.SOBRENOME.getValor()).toString());
					vo.getCurso().setId(resultado.get(C + PONTO + CursoEnum.ID.getValor()).toString());
					vo.getCurso().setDescricao(resultado.get(C + PONTO + CursoEnum.DESCRICAO.getValor()).toString());				
					*/
				}
				
				return true;
			}

		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
		return false;
	
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void incluir(GraduacaoVO vo) throws SQLException {
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			
			
			StringBuilder sql = new StringBuilder();

			
			jdbcTemplate.update(sql.toString(), params);
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Integer contar(String valor, String campo) throws SQLException{
		
		try{
		
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(VALOR, valor);
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(SELECT_COUNT + FROM + AlunoEnum.ALUNOS.getValor());
			sql.append(WHERE);
			sql.append(campo);
			sql.append(IGUAL + DOIS_PONTOS + VALOR);
			
			return jdbcTemplate.queryForObject(sql.toString(), params, Integer.class);
		
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
