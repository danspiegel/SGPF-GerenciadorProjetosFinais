package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.vo.ComboVO;

@Repository
public class EstadoDaoImpl extends BaseDao implements EstadoDao {

	//--> Nome da tabela de estados
	private static final String ESTADOS   = "estados";
	
	//--> Campos da tabela de estados
	private static final String ID             = "id";
	private static final String CODIGO_ESTADO  = "codigo_estado";
	private static final String NOME           = "nome";
	private static final String SIGLA          = "sigla";
	private static final String ID_PAIS        = "id_pais";
	
	/**
	 * {@inheritDoc}
	 */
	public List<ComboVO> carregarEstados() throws SQLException{
		
		try{
	
			StringBuilder sql = new StringBuilder();
			
			sql.append(SELECT + ID + VIRGULA + SIGLA);
			sql.append(FROM + ESTADOS);
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), new MapSqlParameterSource());
			List<ComboVO> lista = new ArrayList<ComboVO>();
			
			for(Map<String, Object> resultado: resultSet){
				
				ComboVO vo = new ComboVO();
				
				vo.setId(resultado.get(ID).toString());
				vo.setDescricao(resultado.get(SIGLA).toString());
				
				lista.add(vo);
				
			}
			
			return lista;
			
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	
}
