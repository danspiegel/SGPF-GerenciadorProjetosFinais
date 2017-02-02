package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.UUID;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.constantes.ConstantesTelefone;
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
			params.addValue(ConstantesTelefone.ID, idTelefone.toString());
			params.addValue(ConstantesTelefone.DDD, vo.getDdd());
			params.addValue(ConstantesTelefone.NUMERO, vo.getNumero());
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(INSERT + ConstantesTelefone.TELEFONES);
			sql.append(PARENTESE_ESQ);
			sql.append(ConstantesTelefone.ID + VIRGULA + ConstantesTelefone.DDD + VIRGULA + ConstantesTelefone.NUMERO);
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + ConstantesTelefone.ID);
			sql.append(DOIS_PONTOS + ConstantesTelefone.DDD);
			sql.append(DOIS_PONTOS + ConstantesTelefone.NUMERO);
			sql.append(PARENTESE_DIR);
			
			jdbcTemplate.update(sql.toString(), params);
			
			return idTelefone;
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	
}
