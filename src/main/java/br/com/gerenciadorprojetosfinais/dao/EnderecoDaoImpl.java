package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.constantes.ConstantesEndereco;
import br.com.gerenciadorprojetosfinais.vo.EnderecoVO;

@Repository
public class EnderecoDaoImpl extends BaseDao implements EnderecoDao {
	
	/**
	 * {@inheritDoc}
	 */
	public void incluir(EnderecoVO vo) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(ConstantesEndereco.LOGRADOURO, vo.getLogradouro());
			params.addValue(ConstantesEndereco.CEP, vo.getCep().replace("-", ""));
			params.addValue(ConstantesEndereco.BAIRRO, vo.getBairro());
			params.addValue(ConstantesEndereco.MUNICIPIO, vo.getMunicipio());
			params.addValue(ConstantesEndereco.ID_ESTADO, vo.getEstado().getId());
			
			StringBuilder sql = new StringBuilder();
			sql.append(INSERT + ConstantesEndereco.ENDERECOS);
			sql.append(PARENTESE_ESQ);
			sql.append(ConstantesEndereco.LOGRADOURO + VIRGULA + ConstantesEndereco.CEP + VIRGULA);
			sql.append(ConstantesEndereco.BAIRRO + VIRGULA + ConstantesEndereco.MUNICIPIO + VIRGULA + ConstantesEndereco.ID_ESTADO);
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + ConstantesEndereco.LOGRADOURO + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesEndereco.CEP + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesEndereco.BAIRRO + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesEndereco.MUNICIPIO + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesEndereco.ID_ESTADO);
			sql.append(PARENTESE_DIR);
			
			jdbcTemplate.update(sql.toString(), params);
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
