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
	private static final String ID                   = "id";
	private static final String DDD                  = "ddd";
	private static final String NUMERO               = "numero";
	
	//--> Campo com nome da tabela telefones_pessoas
	private static final String TELEFONES_PESSOAS    = "telefones_pessoas";
	
	//--> Campos da tabela de telefones_pessoas
	private static final String ID_TELEFONE_PESSOA   = "id";
	private static final String ID_ALUNO             = "id_aluno";
	private static final String ID_FUNCIONARIO       = "id_funcionario";
	private static final String ID_TELEFONE          = "id_telefone";
	
	//--> Campo genérico para representar os IDs de Alunos, Funcionários e Universidades
	private static final String ID_PESSOA            = "idPessoa";
	
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
			params.addValue(ID_PESSOA, id);
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(SELECT + ID + VIRGULA + DDD + VIRGULA + NUMERO);
			sql.append(FROM + TELEFONES);
			sql.append(WHERE);
			sql.append(ID + IGUAL + PARENTESE_ESQ);
			sql.append(SELECT + ID_TELEFONE);
			sql.append(FROM + TELEFONES_PESSOAS);
			sql.append(WHERE);
			sql.append(PARENTESE_DIR);
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), params);
			List<TelefoneVO> lista = new ArrayList<TelefoneVO>();
			
			for (Map<String, Object> resultado: resultSet){
				
				TelefoneVO vo = new TelefoneVO();
				
				vo.setId(resultado.get(ID).toString());
				vo.setDdd(resultado.get(DDD).toString());
				vo.setNumero(resultado.get(NUMERO).toString());
				
				lista.add(vo);
				
			}
			
			return lista;
				
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
