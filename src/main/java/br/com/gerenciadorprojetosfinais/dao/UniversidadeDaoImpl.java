package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.UniversidadeVO;

@Repository
public class UniversidadeDaoImpl extends BaseDao implements UniversidadeDao {

	//--> Campo com nome da tabela de Universidades
	private static final String UNIVERSIDADES     = "universidades";
	
	//--> Campos da tabela de Universidades
	private static final String ID                  = "id";
	private static final String RAZAO_SOCIAL        = "razaosocial";
	private static final String NOME_FANTASIA       = "nomefantasia";
	private static final String CNPJ                = "cnpj";
	private static final String ID_RESPONSAVEL      = "id_responsavel";
	private static final String ID_TELEFONE_PESSOA  = "id_telefone_pessoa";
	
	@Autowired
	EnderecoDao enderecoDao;
	
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
	
	/**
	 * {@inheritDoc}
	 */
	public void incluir(UniversidadeVO vo) throws SQLException{
		
		try{
			
			UUID idEndereco = UUID.randomUUID();
			vo.getResponsavel().setId(idEndereco.toString());
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(RAZAO_SOCIAL, vo.getRazaoSocial());
			params.addValue(NOME_FANTASIA, vo.getNomeFantasia());
			params.addValue(CNPJ, vo.getCnpj().replaceAll("[./-]", ""));
			params.addValue(ID_RESPONSAVEL, vo.getResponsavel().getId());
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(INSERT + UNIVERSIDADES);
			sql.append(PARENTESE_ESQ);
			sql.append(RAZAO_SOCIAL + VIRGULA + NOME_FANTASIA + VIRGULA + CNPJ);
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + RAZAO_SOCIAL + VIRGULA + DOIS_PONTOS + NOME_FANTASIA + VIRGULA + DOIS_PONTOS + CNPJ);
			sql.append(PARENTESE_DIR);
			
			enderecoDao.incluir(vo.getEndereco());
			
			jdbcTemplate.update(sql.toString(), params);
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
