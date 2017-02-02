package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.constantes.ConstantesAluno;
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
			params.addValue(ConstantesAluno.MATRICULA, vo.getMatricula());
			params.addValue(ConstantesAluno.SENHA, vo.getSenha());
			
			StringBuilder sql = new StringBuilder();
			
			// SELECT
			sql.append(SELECT + ConstantesAluno.ID + VIRGULA + ConstantesAluno.MATRICULA + VIRGULA);
			sql.append(ConstantesAluno.EMAIL + VIRGULA + ConstantesAluno.NOME + VIRGULA + ConstantesAluno.SOBRENOME + VIRGULA);
			sql.append(ConstantesAluno.CPF);
			// FROM
			sql.append(FROM + ConstantesAluno.ALUNOS);
			// WHERE
			sql.append(WHERE);
			sql.append(ConstantesAluno.MATRICULA + DOIS_PONTOS + IGUAL + ConstantesAluno.MATRICULA + AND);
			sql.append(ConstantesAluno.SENHA + DOIS_PONTOS + IGUAL + ConstantesAluno.SENHA);
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), params);
			Iterator<Map<String, Object>> iterator = resultSet.iterator();
			
			if (iterator.hasNext()){
				
				for (Map<String, Object> resultado: resultSet){
					
					vo.setId(resultado.get(ConstantesAluno.ID).toString());
					vo.setEmail(resultado.get(ConstantesAluno.EMAIL).toString());
					vo.setNome(resultado.get(ConstantesAluno.NOME).toString());
					vo.setSobrenome(resultado.get(ConstantesAluno.SOBRENOME).toString());
					vo.setCpf(resultado.get(ConstantesAluno.CPF).toString());
					
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
			params.addValue(ConstantesAluno.MATRICULA, vo.getMatricula());
			params.addValue(ConstantesAluno.NOME, vo.getNome());
			params.addValue(ConstantesAluno.SOBRENOME, vo.getSobrenome());
			params.addValue(ConstantesAluno.CPF, vo.getCpf());
			params.addValue(ConstantesAluno.EMAIL, vo.getEmail());
			params.addValue(ConstantesAluno.SENHA, vo.getSenha());
			params.addValue(ConstantesAluno.ID_CURSO, vo.getCurso().getId());
			params.addValue(ConstantesAluno.ID_ENDERECO, idEndereco.toString());
			
			StringBuilder sql = new StringBuilder();
			sql.append(INSERT + ConstantesAluno.ALUNOS);
			sql.append(PARENTESE_ESQ);
			sql.append(ConstantesAluno.MATRICULA + VIRGULA + ConstantesAluno.NOME + VIRGULA + ConstantesAluno.SOBRENOME + VIRGULA);
			sql.append(ConstantesAluno.CPF + VIRGULA + ConstantesAluno.EMAIL);
			sql.append(ConstantesAluno.SENHA + VIRGULA + ConstantesAluno.ID_CURSO);
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + ConstantesAluno.MATRICULA + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesAluno.NOME + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesAluno.SOBRENOME + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesAluno.CPF + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesAluno.EMAIL + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesAluno.ID_CURSO + VIRGULA);
			sql.append(DOIS_PONTOS + ConstantesAluno.ID_ENDERECO);
			sql.append(PARENTESE_DIR);
			
			enderecoDao.incluir(vo.getEndereco());
			
			jdbcTemplate.update(sql.toString(), params);
			
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
			
			sql.append(SELECT_COUNT + FROM + ConstantesAluno.ALUNOS);
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
