package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.vo.TelefoneVO;

@Repository
public class TelefoneDaoImpl extends BaseDao implements TelefoneDao {

	//--> Campo com o nome da tabela de Telefones
	private static final String TELEFONES   = "telefones";
	
	//--> Campos da tabela de Telefones
	private static final String ID          = "id";
	private static final String DDD         = "ddd";
	private static final String NUMERO      = "numero";
	
	/**
	 * {@inheritDoc}
	 */
	public UUID incluir(TelefoneVO vo) throws SQLException{
		
		try{
			
			UUID idTelefone = UUID.randomUUID();
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(ID, idTelefone.toString());
			params.addValue(DDD, vo.getDdd());
			params.addValue(NUMERO, vo.getNumero());
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(INSERT + TELEFONES);
			sql.append(PARENTESE_ESQ);
			sql.append(ID + VIRGULA + DDD + VIRGULA + NUMERO);
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + ID);
			sql.append(DOIS_PONTOS + DDD);
			sql.append(DOIS_PONTOS + NUMERO);
			sql.append(PARENTESE_DIR);
			
			jdbcTemplate.update(sql.toString(), params);
			
			return idTelefone;
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	public List<TelefoneVO> buscar(String id) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			
			StringBuilder sql = new StringBuilder();
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), params);
			List<TelefoneVO> lista = new ArrayList<TelefoneVO>();
			
			
			return lista;
				
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
