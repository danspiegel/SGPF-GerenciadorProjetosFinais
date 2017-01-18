package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

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
	
	protected static final String ID              = "id";
	protected static final String MATRICULA       = "matricula";
	protected static final String SENHA           = "senha";
	protected static final String NOME            = "nome";
	protected static final String SOBRENOME       = "sobrenome";
	protected static final String CPF             = "cpf";
	protected static final String EMAIL           = "email";
	protected static final String ID_CURSO        = "id_curso";
	protected static final String ID_ENDERECO     = "id_endereco";
	
	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;
	
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
	
}
