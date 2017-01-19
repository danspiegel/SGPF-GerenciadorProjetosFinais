package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.vo.EnderecoVO;

@Repository
public class EnderecoDaoImpl extends BaseDao implements EnderecoDao {

	//--> Campo com o nome da tabela de Endereços
	private static final String ENDERECOS      = "enderecos";
	
	//--> Campos da tabela de Endereços
	private static final String ID             = "id";
	private static final String LOGRADOURO     = "logradouro";
	private static final String CEP            = "cep";
	private static final String BAIRRO         = "bairro";
	private static final String CIDADE         = "cidade";
	private static final String ID_ESTADO      = "id_estado";
	
	/**
	 * {@inheritDoc}
	 */
	public void incluir(EnderecoVO vo) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(LOGRADOURO, vo.getLogradouro());
			params.addValue(CEP, vo.getCep());
			params.addValue(BAIRRO, vo.getBairro());
			params.addValue(CIDADE, vo.getCidade());
			params.addValue(ID_ESTADO, vo.getEstado().getId());
			
			StringBuilder sql = new StringBuilder();
			sql.append(INSERT + ENDERECOS);
			sql.append(PARENTESE_ESQ);
			sql.append(LOGRADOURO + VIRGULA + CEP + VIRGULA + BAIRRO + VIRGULA + CIDADE + VIRGULA + ID_ESTADO);
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + LOGRADOURO + VIRGULA);
			sql.append(DOIS_PONTOS + CEP + VIRGULA);
			sql.append(DOIS_PONTOS + BAIRRO + VIRGULA);
			sql.append(DOIS_PONTOS + CIDADE + VIRGULA);
			sql.append(DOIS_PONTOS + ID_ESTADO);
			sql.append(PARENTESE_DIR);
			
			getJdbcTemplate().update(sql.toString(), params);
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
