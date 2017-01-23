package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.vo.AlunoVO;

@Repository
public class AlunoDaoImpl extends BaseDao implements AlunoDao {

	//--> Campo com nome da tabela de Alunos
	private static final String ALUNOS          = "alunos";
	
	//--> Campos da tabela de Alunos
	
	private static final String ID              = "id";
	private static final String MATRICULA       = "matricula";
	private static final String SENHA           = "senha";
	private static final String NOME            = "nome";
	private static final String SOBRENOME       = "sobrenome";
	private static final String CPF             = "cpf";
	private static final String EMAIL           = "email";
	private static final String ID_CURSO        = "id_curso";
	private static final String ID_ENDERECO     = "id_endereco";
	
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
			params.addValue(MATRICULA, vo.getMatricula());
			params.addValue(SENHA, vo.getSenha());
			
			StringBuilder sql = new StringBuilder();
			
			// SELECT
			sql.append(SELECT + ID + VIRGULA + MATRICULA + VIRGULA + EMAIL + VIRGULA + NOME + VIRGULA + SOBRENOME + VIRGULA + CPF);
			// FROM
			sql.append(FROM + ALUNOS);
			// WHERE
			sql.append(WHERE);
			sql.append(MATRICULA + DOIS_PONTOS + IGUAL + MATRICULA + AND);
			sql.append(SENHA + DOIS_PONTOS + IGUAL + SENHA);
			
			List<Map<String, Object>> resultSet = getJdbcTemplate().queryForList(sql.toString(), params);
			Iterator<Map<String, Object>> iterator = resultSet.iterator();
			
			if (iterator.hasNext()){
				
				for (Map<String, Object> resultado: resultSet){
					
					vo.setId(resultado.get(ID).toString());
					vo.setEmail(resultado.get(EMAIL).toString());
					vo.setNome(resultado.get(NOME).toString());
					vo.setSobrenome(resultado.get(SOBRENOME).toString());
					vo.setCpf(resultado.get(CPF).toString());
					
				}
				
				return true;
			}

		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
		return false;
	
	}
	
	public void incluir(AlunoVO vo) throws SQLException {
		
		try{
			
			UUID idEndereco = UUID.randomUUID();
			
			vo.getEndereco().setId(idEndereco.toString());
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(MATRICULA, vo.getMatricula());
			params.addValue(NOME, vo.getNome());
			params.addValue(SOBRENOME, vo.getSobrenome());
			params.addValue(CPF, vo.getCpf());
			params.addValue(EMAIL, vo.getEmail());
			params.addValue(SENHA, vo.getSenha());
			params.addValue(ID_CURSO, vo.getCurso().getId());
			params.addValue(ID_ENDERECO, idEndereco.toString());
			
			StringBuilder sql = new StringBuilder();
			sql.append(INSERT + ALUNOS);
			sql.append(PARENTESE_ESQ);
			sql.append(MATRICULA + VIRGULA + NOME + VIRGULA + SOBRENOME + VIRGULA + CPF + VIRGULA + EMAIL + VIRGULA);
			sql.append(SENHA + VIRGULA + ID_CURSO);
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + MATRICULA + VIRGULA);
			sql.append(DOIS_PONTOS + NOME + VIRGULA);
			sql.append(DOIS_PONTOS + SOBRENOME + VIRGULA);
			sql.append(DOIS_PONTOS + CPF + VIRGULA);
			sql.append(DOIS_PONTOS + EMAIL + VIRGULA);
			sql.append(DOIS_PONTOS + ID_CURSO + VIRGULA);
			sql.append(DOIS_PONTOS + ID_ENDERECO);
			sql.append(PARENTESE_DIR);
			
			enderecoDao.incluir(vo.getEndereco());
			
			getJdbcTemplate().update(sql.toString(), params);
			
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
			
			sql.append(SELECT_COUNT + FROM + ALUNOS);
			sql.append(WHERE);
			sql.append(campo);
			sql.append(IGUAL + DOIS_PONTOS + VALOR);
			
			return getJdbcTemplate().queryForInt(sql.toString(), params);
		
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
