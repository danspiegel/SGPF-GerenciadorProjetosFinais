package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.UUID;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.TelefoneEnum;
import br.com.gerenciadorprojetosfinais.vo.TelefoneVO;

@Repository
public class TelefoneDaoImpl extends BaseDao implements TelefoneDao {

	/**
	 * {@inheritDoc}
	 */
	public UUID incluir(TelefoneVO vo) throws SQLException{
		
		try{
			
			UUID idTelefone = UUID.randomUUID();
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(TelefoneEnum.ID.getValor(), idTelefone.toString());
			params.addValue(TelefoneEnum.DDD.getValor(), vo.getDdd());
			params.addValue(TelefoneEnum.NUMERO.getValor(), vo.getNumero());
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(INSERT + TelefoneEnum.TELEFONES.getValor());
			sql.append(PARENTESE_ESQ);
			sql.append(TelefoneEnum.ID.getValor() + VIRGULA + TelefoneEnum.DDD.getValor() + VIRGULA + TelefoneEnum.NUMERO.getValor());
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + TelefoneEnum.ID.getValor());
			sql.append(DOIS_PONTOS + TelefoneEnum.DDD.getValor());
			sql.append(DOIS_PONTOS + TelefoneEnum.NUMERO.getValor());
			sql.append(PARENTESE_DIR);
			
			jdbcTemplate.update(sql.toString(), params);
			
			return idTelefone;
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	
}
