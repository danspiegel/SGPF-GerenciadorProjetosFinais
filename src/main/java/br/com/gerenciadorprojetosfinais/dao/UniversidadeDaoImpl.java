package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.EnderecoEnum;
import br.com.gerenciadorprojetosfinais.enums.TelefoneEnum;
import br.com.gerenciadorprojetosfinais.enums.UniversidadeEnum;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.FilialVO;

@Repository
public class UniversidadeDaoImpl extends BaseDao implements UniversidadeDao {

	@Autowired
	EnderecoDao enderecoDao;
	
	/**
	 * {@inheritDoc}
	 */
	public List<ComboVO> carregarUniversidades() throws SQLException{
		
		try{
			
			StringBuilder sql = new StringBuilder();
			
			// SELECT
			sql.append(SELECT + UniversidadeEnum.ID.getValor() + VIRGULA + UniversidadeEnum.NOME_FANTASIA.getValor());
			// FROM
			sql.append(FROM + UniversidadeEnum.UNIVERSIDADES.getValor());
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), new MapSqlParameterSource());
			List<ComboVO> lista = new ArrayList<ComboVO>();
			
			for (Map<String, Object> resultado: resultSet){
				
				ComboVO vo = new ComboVO();
				
				vo.setId(resultado.get(UniversidadeEnum.ID.getValor()).toString());
				vo.setDescricao(resultado.get(UniversidadeEnum.NOME_FANTASIA.getValor()).toString());
				
				lista.add(vo);
				
			}
			
			return lista;
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void incluirUniversidade(FilialVO vo) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(UniversidadeEnum.RAZAO_SOCIAL.getValor(), vo.getRazaoSocial());
			params.addValue(UniversidadeEnum.NOME_FANTASIA.getValor(), vo.getNomeFantasia());
			params.addValue(UniversidadeEnum.CNPJ.getValor(), vo.getCnpj());

			
			StringBuilder sql = new StringBuilder();
			
			sql.append(INSERT + UniversidadeEnum.UNIVERSIDADES.getValor());
			sql.append(PARENTESE_ESQ);
			sql.append(UniversidadeEnum.RAZAO_SOCIAL.getValor() + VIRGULA + UniversidadeEnum.NOME_FANTASIA.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.CNPJ.getValor());
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + UniversidadeEnum.RAZAO_SOCIAL.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.NOME_FANTASIA.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.CNPJ.getValor());
			sql.append(PARENTESE_DIR);
			sql.append(RETURNING + UniversidadeEnum.ID.getValor());
			
			String id = jdbcTemplate.queryForObject(sql.toString(), params, String.class);
			
			enderecoDao.incluir(id, UniversidadeEnum.UNIVERSIDADES.getValor(), vo.getEndereco());
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
