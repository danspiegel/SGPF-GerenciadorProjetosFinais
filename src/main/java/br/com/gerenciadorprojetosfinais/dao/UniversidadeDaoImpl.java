package br.com.gerenciadorprojetosfinais.dao;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.UniversidadeEnum;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.UniversidadeVO;

@Repository
public class UniversidadeDaoImpl extends BaseDao implements UniversidadeDao {
	
	/**
	 * {@inheritDoc}
	 */
	public List<ComboVO> carregarUniversidades() throws SQLException{
		
		try{
			
			StringBuilder sql = new StringBuilder();
			
			// SELECT
			sql.append(SELECT + UniversidadeEnum.CNPJ.getValor() + VIRGULA + UniversidadeEnum.NOME_FANTASIA.getValor());
			// FROM
			sql.append(FROM + UniversidadeEnum.UNIVERSIDADES.getValor());
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), new MapSqlParameterSource());
			List<ComboVO> lista = new ArrayList<ComboVO>();
			
			for (Map<String, Object> resultado: resultSet){
				
				ComboVO vo = new ComboVO();
				
				vo.setId(resultado.get(UniversidadeEnum.CNPJ.getValor()).toString());
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
	public void incluirUniversidade(UniversidadeVO vo) throws SQLException{
		
		try{
			
			Integer matriz = null;
			
			if (buscarMatriz(vo.getCnpj().replace("[./-]", "")) == 0){
				matriz = 1;
			}
			else if (buscarMatriz(vo.getCnpj().replace("[./-]", "")) > 0){
				matriz = 0;
			}
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(UniversidadeEnum.CNPJ.getValor(), vo.getCnpj().replaceAll("[./-]", ""));
			params.addValue(UniversidadeEnum.RAZAO_SOCIAL.getValor(), vo.getRazaoSocial());
			params.addValue(UniversidadeEnum.NOME_FANTASIA.getValor(), vo.getNomeFantasia());
			params.addValue(UniversidadeEnum.DESCRICAO.getValor(), vo.getDescricao());
			params.addValue(UniversidadeEnum.MATRIZ.getValor(), matriz);
			params.addValue(UniversidadeEnum.LOGRADOURO.getValor(), vo.getLogradouro());
			params.addValue(UniversidadeEnum.CEP.getValor(), vo.getCep());
			params.addValue(UniversidadeEnum.BAIRRO.getValor(), vo.getBairro());
			params.addValue(UniversidadeEnum.MUNICIPIO.getValor(), vo.getMunicipio());
			params.addValue(UniversidadeEnum.ID_ESTADO.getValor(), Integer.parseInt(vo.getEstado().getId()));
			params.addValue(UniversidadeEnum.DDD.getValor(), vo.getTelefone().replaceAll("[()-]", "").substring(0, 2));
			params.addValue(UniversidadeEnum.TELEFONE.getValor(), vo.getTelefone().replaceAll("[()-]", "").substring(2, 10));
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(INSERT + UniversidadeEnum.UNIVERSIDADES.getValor());
			sql.append(PARENTESE_ESQ);
			sql.append(UniversidadeEnum.CNPJ.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.RAZAO_SOCIAL.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.NOME_FANTASIA.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.DESCRICAO.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.MATRIZ.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.LOGRADOURO.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.CEP.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.BAIRRO.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.MUNICIPIO.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.ID_ESTADO.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.DDD.getValor() + VIRGULA);
			sql.append(UniversidadeEnum.TELEFONE.getValor());
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + UniversidadeEnum.CNPJ.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.RAZAO_SOCIAL.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.NOME_FANTASIA.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.DESCRICAO.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.MATRIZ.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.LOGRADOURO.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.CEP.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.BAIRRO.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.MUNICIPIO.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.ID_ESTADO.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.DDD.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + UniversidadeEnum.TELEFONE.getValor());
			sql.append(PARENTESE_DIR);
			
			jdbcTemplate.update(sql.toString(), params);	
			 
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	public Integer buscarMatriz(String cnpj) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(UniversidadeEnum.CNPJ.getValor(), cnpj.replaceAll("[./-]", "").substring(0, 8));
			params.addValue(UniversidadeEnum.MATRIZ.getValor(), 1);
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(SELECT_COUNT + FROM + UniversidadeEnum.UNIVERSIDADES.getValor());
			sql.append(WHERE);
			sql.append(UniversidadeEnum.CNPJ.getValor() + IGUAL + DOIS_PONTOS + UniversidadeEnum.CNPJ.getValor() + AND);
			sql.append(UniversidadeEnum.MATRIZ.getValor() + IGUAL + DOIS_PONTOS + UniversidadeEnum.MATRIZ.getValor());
			
			Integer resultSet = jdbcTemplate.queryForObject(sql.toString(), params, Integer.class);
			
			return resultSet;
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
