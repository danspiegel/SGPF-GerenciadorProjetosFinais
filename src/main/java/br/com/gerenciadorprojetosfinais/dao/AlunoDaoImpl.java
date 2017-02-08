package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.AlunoEnum;
import br.com.gerenciadorprojetosfinais.enums.GraduacaoEnum;
import br.com.gerenciadorprojetosfinais.enums.UniversidadeEnum;
import br.com.gerenciadorprojetosfinais.vo.AlunoVO;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;

@Repository
public class AlunoDaoImpl extends BaseDao implements AlunoDao {
	
	//--> Campo genérico
	private static final String VALOR    = "valor";
	
	//--> Campos de apelido SQL
	private static final String A        = " A";
	private static final String B        = " B";
	
	/**
	 * {@inheritDoc}
	 */
	public boolean validarUsuario(GraduacaoVO vo) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(UniversidadeEnum.UNIVERSIDADES.getValor(), vo.getUniversidade());
			params.addValue(GraduacaoEnum.MATRICULA.getValor(), vo.getMatricula());
			params.addValue(GraduacaoEnum.SENHA.getValor(), vo.getSenha());
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(SELECT + A + PONTO + ASTERISCO);
			sql.append(FROM);
			sql.append(AlunoEnum.ALUNOS.getValor() + A);
			sql.append(INNER_JOIN);
			sql.append(GraduacaoEnum.GRADUACAO.getValor() + B);
			sql.append(ON);
			sql.append(PARENTESE_ESQ);
			sql.append(A + PONTO + AlunoEnum.CPF.getValor() + IGUAL + B + PONTO + GraduacaoEnum.CPF.getValor());
			sql.append(PARENTESE_DIR);
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), params);
			Iterator<Map<String, Object>> iterator = resultSet.iterator();
			
			if (iterator.hasNext()){
				
				for (Map<String, Object> resultado: resultSet){
					
					
					
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
	public void incluir(AlunoVO vo) throws SQLException {
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			
			StringBuilder sql = new StringBuilder();

			
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
