package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.AlunoEnum;
import br.com.gerenciadorprojetosfinais.vo.AlunoVO;

@Repository
public class AlunoDaoImpl extends BaseDao implements AlunoDao {
	
	//--> Campo genérico
	private static final String VALOR             = "valor";
	
	@Autowired
	EnderecoDao enderecoDao;
	
	/**
	 * {@inheritDoc}
	 */
	public boolean validarUsuario(AlunoVO vo) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(AlunoEnum.MATRICULA.getValor(), vo.getMatricula());
			params.addValue(AlunoEnum.SENHA.getValor(), vo.getSenha());
			
			StringBuilder sql = new StringBuilder();
			
			// SELECT
			sql.append(SELECT + AlunoEnum.ID.getValor() + VIRGULA + AlunoEnum.MATRICULA.getValor() + VIRGULA);
			sql.append(AlunoEnum.EMAIL.getValor() + VIRGULA + AlunoEnum.NOME.getValor() + VIRGULA + AlunoEnum.SOBRENOME.getValor() + VIRGULA);
			sql.append(AlunoEnum.CPF.getValor());
			// FROM
			sql.append(FROM + AlunoEnum.ALUNOS.getValor());
			// WHERE
			sql.append(WHERE);
			sql.append(AlunoEnum.MATRICULA.getValor() + DOIS_PONTOS + IGUAL + AlunoEnum.MATRICULA.getValor() + AND);
			sql.append(AlunoEnum.SENHA.getValor() + DOIS_PONTOS + IGUAL + AlunoEnum.SENHA.getValor());
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), params);
			Iterator<Map<String, Object>> iterator = resultSet.iterator();
			
			if (iterator.hasNext()){
				
				for (Map<String, Object> resultado: resultSet){
					
					vo.setId(resultado.get(AlunoEnum.ID.getValor()).toString());
					vo.setEmail(resultado.get(AlunoEnum.EMAIL.getValor()).toString());
					vo.setNome(resultado.get(AlunoEnum.NOME.getValor()).toString());
					vo.setSobrenome(resultado.get(AlunoEnum.SOBRENOME.getValor()).toString());
					vo.setCpf(resultado.get(AlunoEnum.CPF.getValor()).toString());
					
				}
				
				return true;
			}

		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
		return false;
	
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void incluir(AlunoVO vo) throws SQLException {
		
		try{
			
			UUID idEndereco = UUID.randomUUID();
			vo.getEndereco().setId(idEndereco.toString());
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(AlunoEnum.MATRICULA.getValor(), vo.getMatricula());
			params.addValue(AlunoEnum.NOME.getValor(), vo.getNome());
			params.addValue(AlunoEnum.SOBRENOME.getValor(), vo.getSobrenome());
			params.addValue(AlunoEnum.CPF.getValor(), vo.getCpf());
			params.addValue(AlunoEnum.EMAIL.getValor(), vo.getEmail());
			params.addValue(AlunoEnum.SENHA.getValor(), vo.getSenha());
			params.addValue(AlunoEnum.ID_CURSO.getValor(), vo.getCurso().getId());
			
			StringBuilder sql = new StringBuilder();
			sql.append(INSERT + AlunoEnum.ALUNOS.getValor());
			sql.append(PARENTESE_ESQ);
			sql.append(AlunoEnum.MATRICULA.getValor() + VIRGULA + AlunoEnum.NOME.getValor() + VIRGULA + AlunoEnum.SOBRENOME.getValor() + VIRGULA);
			sql.append(AlunoEnum.CPF.getValor() + VIRGULA + AlunoEnum.EMAIL.getValor());
			sql.append(AlunoEnum.SENHA.getValor() + VIRGULA + AlunoEnum.ID_CURSO.getValor());
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + AlunoEnum.MATRICULA.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + AlunoEnum.NOME.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + AlunoEnum.SOBRENOME.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + AlunoEnum.CPF.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + AlunoEnum.EMAIL.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + AlunoEnum.SENHA.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + AlunoEnum.ID_CURSO.getValor());
			sql.append(PARENTESE_DIR);
			sql.append(RETURNING + AlunoEnum.ID.getValor());
			
			String id = jdbcTemplate.queryForObject(sql.toString(), params, String.class);
			
			enderecoDao.incluir(id, AlunoEnum.ALUNOS.getValor(), vo.getEndereco());
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
	/**
	 * {@inheritDoc}
	 */
	public Integer contar(String valor, String campo) throws SQLException{
		
		try{
		
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(VALOR, valor);
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(SELECT_COUNT + FROM + AlunoEnum.ALUNOS.getValor());
			sql.append(WHERE);
			sql.append(campo);
			sql.append(IGUAL + DOIS_PONTOS + VALOR);
			
			return jdbcTemplate.queryForObject(sql.toString(), params, Integer.class);
		
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
