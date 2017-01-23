package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;

import br.com.gerenciadorprojetosfinais.vo.ComboVO;

public class UniversidadeDaoImpl extends BaseDao implements UniversidadeDao {

	//--> Campo com nome da tabela de Universidades
	private static final String UNIVERSIDADES     = "universidades";
	
	//--> Campos da tabela de Universidades
	private static final String ID                = "id";
	private static final String RAZAO_SOCIAL      = "razaosocial";
	private static final String NOME_FANTASIA     = "nomefantasia";
	private static final String CNPJ              = "cnpj";
	private static final String ID_RESPONSAVEL    = "id_responsavel";
	
	/**
	 * {@inheritDoc}
	 */
	public List<ComboVO> carregarUniversidades(List<ComboVO> listaUniversidades) throws SQLException{
		
		try{
			
			StringBuilder sql = new StringBuilder();
			
			// SELECT
			sql.append(SELECT + ID + VIRGULA + NOME_FANTASIA);
			// FROM
			sql.append(FROM + UNIVERSIDADES);
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), new MapSqlParameterSource());
			
			for (Map<String, Object> resultado: resultSet){
				
				ComboVO vo = new ComboVO();
				
				vo.setId(resultado.get(ID).toString());
				vo.setDescricao(resultado.get(NOME_FANTASIA).toString());
				
				listaUniversidades.add(vo);
				
			}
			
			return listaUniversidades;
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
