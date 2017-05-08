package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.UniversidadeFuncionarioEnum;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

@Repository
public class DocenteDaoImpl extends BaseDao implements DocenteDao {

	/**
	 * {@inheritDoc}
	 */
	public boolean validarDocente(UsuarioVO vo) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(UniversidadeFuncionarioEnum.MATRICULA.getValor(), vo.getMatricula());
			params.addValue(UniversidadeFuncionarioEnum.SENHA.getValor(), vo.getSenha());
			
			StringBuilder sql = new StringBuilder();
		
			
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
	
}
