package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.EstadoEnum;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;

@Repository
public class EstadoDaoImpl extends BaseDao implements EstadoDao {

	/**
	 * {@inheritDoc}
	 */
	public List<ComboVO> carregarEstados() throws SQLException{
		
		try{
	
			StringBuilder sql = new StringBuilder();
			
			sql.append(SELECT + EstadoEnum.ID.getValor() + VIRGULA + EstadoEnum.SIGLA.getValor());
			sql.append(FROM + EstadoEnum.ESTADOS.getValor());
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), new MapSqlParameterSource());
			List<ComboVO> lista = new ArrayList<ComboVO>();
			
			for(Map<String, Object> resultado: resultSet){
				
				ComboVO vo = new ComboVO();
				
				vo.setId(resultado.get(EstadoEnum.ID.getValor()).toString());
				vo.setDescricao(resultado.get(EstadoEnum.SIGLA.getValor()).toString());
				
				lista.add(vo);
				
			}
			
			return lista;
			
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	
}
