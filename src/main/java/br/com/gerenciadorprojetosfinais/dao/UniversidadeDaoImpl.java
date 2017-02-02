package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.constantes.ConstantesEndereco;
import br.com.gerenciadorprojetosfinais.constantes.ConstantesTelefone;
import br.com.gerenciadorprojetosfinais.constantes.ConstantesUniversidade;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.FilialVO;

@Repository
public class UniversidadeDaoImpl extends BaseDao implements UniversidadeDao {

	@Autowired
	EnderecoDao enderecoDao;
	
	/**
	 * {@inheritDoc}
	 */
	public List<ComboVO> carregarUniversidades(List<ComboVO> listaUniversidades) throws SQLException{
		
		try{
			
			StringBuilder sql = new StringBuilder();
			
			// SELECT
			sql.append(SELECT + ConstantesUniversidade.ID + VIRGULA + ConstantesUniversidade.NOME_FANTASIA);
			// FROM
			sql.append(FROM + ConstantesUniversidade.UNIVERSIDADES);
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), new MapSqlParameterSource());
			
			for (Map<String, Object> resultado: resultSet){
				
				ComboVO vo = new ComboVO();
				
				vo.setId(resultado.get(ConstantesUniversidade.ID).toString());
				vo.setDescricao(resultado.get(ConstantesUniversidade.NOME_FANTASIA).toString());
				
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
	public void incluirUniversidade(FilialVO vo) throws SQLException{
		
		try{
			
			UUID idEndereco = UUID.randomUUID();
			
			String ddd = vo.getTelefone().getNumero().replaceAll("[()-]", "").substring(0, 2);
			String numero = vo.getTelefone().getNumero().replaceAll("[()-]", "").substring(2, 10);
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(ConstantesUniversidade.RAZAO_SOCIAL, vo.getRazaoSocial());
			params.addValue(ConstantesUniversidade.NOME_FANTASIA, vo.getNomeFantasia());
			params.addValue(ConstantesUniversidade.CNPJ, vo.getCnpj());
			params.addValue(ConstantesEndereco.LOGRADOURO, vo.getEndereco().getLogradouro());
			params.addValue(ConstantesEndereco.CEP, vo.getEndereco().getCep());
			params.addValue(ConstantesEndereco.BAIRRO, vo.getEndereco().getBairro());
			params.addValue(ConstantesEndereco.MUNICIPIO, vo.getEndereco().getMunicipio());
			params.addValue(ConstantesEndereco.ID_ESTADO, vo.getEndereco().getEstado().getId());
			params.addValue(ConstantesTelefone.DDD, ddd);
			params.addValue(ConstantesTelefone.NUMERO, numero);

			
			StringBuilder sql = new StringBuilder();
			
			sql.append(INSERT + ConstantesUniversidade.UNIVERSIDADES);
			sql.append(PARENTESE_ESQ);
			sql.append(ConstantesUniversidade.RAZAO_SOCIAL + VIRGULA + ConstantesUniversidade.NOME_FANTASIA + VIRGULA);
			sql.append(ConstantesUniversidade.CNPJ);
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + ConstantesUniversidade.RAZAO_SOCIAL + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesUniversidade.NOME_FANTASIA + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesUniversidade.CNPJ);
			sql.append(PARENTESE_DIR);
			
			jdbcTemplate.update(sql.toString(), params);
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
