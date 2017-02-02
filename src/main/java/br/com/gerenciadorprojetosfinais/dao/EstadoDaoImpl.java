package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.constantes.ConstantesEstado;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;

@Repository
public class EstadoDaoImpl extends BaseDao implements EstadoDao {

	/**
	 * {@inheritDoc}
	 */
	public List<ComboVO> carregarEstados() throws SQLException{
		
		try{
	
			StringBuilder sql = new StringBuilder();
			
			sql.append(SELECT + ConstantesEstado.ID + VIRGULA + ConstantesEstado.SIGLA);
			sql.append(FROM + ConstantesEstado.ESTADOS);
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), new MapSqlParameterSource());
			List<ComboVO> lista = new ArrayList<ComboVO>();
			
			for(Map<String, Object> resultado: resultSet){
				
				ComboVO vo = new ComboVO();
				
				vo.setId(resultado.get(ConstantesEstado.ID).toString());
				vo.setDescricao(resultado.get(ConstantesEstado.SIGLA).toString());
				
				lista.add(vo);
				
			}
			
			return lista;
			
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	
}
