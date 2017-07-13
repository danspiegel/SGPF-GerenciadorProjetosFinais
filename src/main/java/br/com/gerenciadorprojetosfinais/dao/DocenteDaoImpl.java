package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.CursoEnum;
import br.com.gerenciadorprojetosfinais.enums.FuncionarioEnum;
import br.com.gerenciadorprojetosfinais.enums.PerfilAcessoEnum;
import br.com.gerenciadorprojetosfinais.enums.UniversidadeFuncionarioEnum;
import br.com.gerenciadorprojetosfinais.rowmappers.UniversidadeFuncionarioRowMapper;
import br.com.gerenciadorprojetosfinais.vo.UniversidadeFuncionarioVO;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

@Repository
public class DocenteDaoImpl extends BaseDaoImpl implements DocenteDao {

	//--> Campos de apelido SQL
	private static final String A        = " A";
	private static final String B        = " B";
	private static final String C        = " C";
	private static final String D        = " D";
	
	/**
	 * {@inheritDoc}
	 */
	public UsuarioVO validarDocente(UsuarioVO vo) throws SQLException, EmptyResultDataAccessException {
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(UniversidadeFuncionarioEnum.MATRICULA.getValor(), vo.getMatricula());
			params.addValue(UniversidadeFuncionarioEnum.SENHA.getValor(), vo.getSenha());
			
			StringBuilder sql = new StringBuilder();
			// SELECT
			sql.append(SELECT + A + PONTO + UniversidadeFuncionarioEnum.MATRICULA.getValor() + VIRGULA);
			sql.append(A + PONTO + UniversidadeFuncionarioEnum.SENHA.getValor() + VIRGULA);
			sql.append(A + PONTO + UniversidadeFuncionarioEnum.DT_INICIO.getValor() + VIRGULA);
			sql.append(A + PONTO + UniversidadeFuncionarioEnum.DT_FIM.getValor() + VIRGULA);
			sql.append(B + PONTO + FuncionarioEnum.ID.getValor() + VIRGULA);
			sql.append(B + PONTO + FuncionarioEnum.NOME.getValor() + VIRGULA);
			sql.append(B + PONTO + FuncionarioEnum.SOBRENOME.getValor() + VIRGULA);
			sql.append(B + PONTO + FuncionarioEnum.EMAIL.getValor() + VIRGULA);
			sql.append(B + PONTO + FuncionarioEnum.CARGO.getValor() + VIRGULA);
			sql.append(C + PONTO + PerfilAcessoEnum.ID.getValor() + VIRGULA);
			sql.append(D + PONTO + CursoEnum.ID.getValor() + VIRGULA);
			sql.append(D + PONTO + CursoEnum.CODIGO_CURSO.getValor() + VIRGULA);
			sql.append(D + PONTO + CursoEnum.DESCRICAO.getValor() + VIRGULA);
			// FROM
			sql.append(FROM + UniversidadeFuncionarioEnum.UNIVERSIDADE_FUNCIONARIO.getValor() + A);
			// INNER JOIN
			sql.append(INNER_JOIN + FuncionarioEnum.FUNCIONARIOS.getValor() + B);
			sql.append(ON + PARENTESE_ESQ);
			sql.append(A + PONTO + UniversidadeFuncionarioEnum.ID_FUNCIONARIO.getValor() + IGUAL + B + PONTO + FuncionarioEnum.ID.getValor());
			sql.append(PARENTESE_DIR);
			// INNER JOIN
			sql.append(INNER_JOIN + CursoEnum.CURSOS.getValor() + C);
			sql.append(ON + PARENTESE_ESQ);
			sql.append(A + PONTO + UniversidadeFuncionarioEnum.ID_CURSO.getValor() + IGUAL + C + PONTO + CursoEnum.ID.getValor());
			sql.append(PARENTESE_DIR);
			// INNER JOIN
			sql.append(INNER_JOIN + PerfilAcessoEnum.PERFIS_ACESSO.getValor() + D);
			sql.append(ON + PARENTESE_ESQ);
			sql.append(B + PONTO + FuncionarioEnum.PERFIL.getValor() + IGUAL + D + PONTO + PerfilAcessoEnum.ID.getValor());
			sql.append(PARENTESE_DIR);
			// WHERE
			sql.append(WHERE);
			sql.append(UniversidadeFuncionarioEnum.MATRICULA.getValor() + IGUAL + DOIS_PONTOS + UniversidadeFuncionarioEnum.MATRICULA.getValor() + AND);
			sql.append(UniversidadeFuncionarioEnum.SENHA.getValor() + IGUAL + DOIS_PONTOS + UniversidadeFuncionarioEnum.SENHA.getValor());
			
			UniversidadeFuncionarioVO universidadeFuncionario = getNamedParameterJdbcTemplate().queryForObject(sql.toString(), params, new UniversidadeFuncionarioRowMapper());
			
			vo.setDocente(universidadeFuncionario);
			
			/*
			List<Map<String, Object>> resultSet = getNamedParameterJdbcTemplate().queryForList(sql.toString(), params);
			Iterator<Map<String, Object>> iterator = resultSet.iterator();
			
			if (iterator.hasNext()){
				
				for (Map<String, Object> resultado: resultSet){
					
					vo.getDocente().setDataInicio((Date) resultado.get(UniversidadeFuncionarioEnum.DT_INICIO.getValor()));
					vo.getDocente().setDataFim((Date) resultado.get(UniversidadeFuncionarioEnum.DT_FIM.getValor()));
					vo.getDocente().getFuncionario().setId(resultado.get(FuncionarioEnum.ID.getValor()).toString());
					vo.getDocente().getFuncionario().setNome(resultado.get(FuncionarioEnum.NOME.getValor()).toString());
					vo.getDocente().getFuncionario().setSobrenome(resultado.get(FuncionarioEnum.SOBRENOME.getValor()).toString());
					vo.getDocente().getFuncionario().setEmail(resultado.get(FuncionarioEnum.EMAIL.getValor()).toString());
					vo.getDocente().getFuncionario().setCargo(resultado.get(FuncionarioEnum.CARGO.getValor()).toString());
					vo.getDocente().getFuncionario().getPerfil().setId((Integer) resultado.get(PerfilAcessoEnum.ID.getValor()));
					vo.getDocente().getCurso().setId(resultado.get(CursoEnum.ID.getValor()).toString());
					vo.getDocente().getCurso().setCodCurso(resultado.get(CursoEnum.CODIGO_CURSO.getValor()).toString());
					vo.getDocente().getCurso().setDescricao(resultado.get(CursoEnum.DESCRICAO.getValor()).toString());
					
				}
				
				return true;
			}
			*/
			
			return vo;

		}
		catch(EmptyResultDataAccessException e){
			return null;
		}
		
		//return false;
		
	}
	
}
