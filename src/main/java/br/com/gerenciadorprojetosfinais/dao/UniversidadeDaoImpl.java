package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.vo.UniversidadeVO;

@Repository
public class UniversidadeDaoImpl extends BaseDaoImpl implements UniversidadeDao {
	
	/**
	 * {@inheritDoc}
	 */
	public List<UniversidadeVO> carregarUniversidades() throws SQLException{
		
		try{
			
			StringBuilder sql = new StringBuilder();
			
			
			
			List<Map<String, Object>> resultSet = getNamedParameterJdbcTemplate().queryForList(sql.toString(), new MapSqlParameterSource());
			List<UniversidadeVO> lista = new ArrayList<UniversidadeVO>();
			
			for (Map<String, Object> resultado: resultSet){
				
				
			}
			
			return lista;
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void incluirUniversidade(UniversidadeVO vo) throws SQLException{
		
		try{
			
			
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			
			StringBuilder sql = new StringBuilder();
			
			
			getNamedParameterJdbcTemplate().update(sql.toString(), params);	
			 
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	public Integer buscarMatriz(String cnpj) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			
			StringBuilder sql = new StringBuilder();
			
			Integer resultSet = getNamedParameterJdbcTemplate().queryForObject(sql.toString(), params, Integer.class);
			
			return resultSet;
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
