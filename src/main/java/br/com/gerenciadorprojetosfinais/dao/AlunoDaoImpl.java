package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.AlunoEnum;
import br.com.gerenciadorprojetosfinais.enums.CursoEnum;
import br.com.gerenciadorprojetosfinais.enums.GraduacaoEnum;
import br.com.gerenciadorprojetosfinais.enums.PerfilAcessoEnum;
import br.com.gerenciadorprojetosfinais.rowmappers.GraduacaoRowMapper;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

@Repository
public class AlunoDaoImpl extends BaseDaoImpl implements AlunoDao {
	
	//--> Campos de ALIAS SQL
	private static final String A        = " A";
	private static final String B        = " B";
	private static final String C        = " C";
	private static final String D        = " D";
	
	/**
	 * {@inheritDoc}
	 */
	public UsuarioVO validarAluno(UsuarioVO vo) throws SQLException, EmptyResultDataAccessException {
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(GraduacaoEnum.MATRICULA.getValor(), vo.getMatricula());
			params.addValue(GraduacaoEnum.SENHA.getValor(), vo.getSenha());
			
			StringBuilder sql = new StringBuilder();
			// SELECT
			sql.append(SELECT + A + PONTO + GraduacaoEnum.MATRICULA.getValor() + VIRGULA);
			sql.append(A + PONTO + GraduacaoEnum.SENHA.getValor() + VIRGULA);
			sql.append(A + PONTO + GraduacaoEnum.DT_INICIO.getValor() + VIRGULA);
			sql.append(A + PONTO + GraduacaoEnum.DT_FIM.getValor() + VIRGULA);
			sql.append(B + PONTO + AlunoEnum.ID.getValor() + VIRGULA);
			sql.append(B + PONTO + AlunoEnum.NOME.getValor() + VIRGULA);
			sql.append(B + PONTO + AlunoEnum.SOBRENOME.getValor() + VIRGULA);
			sql.append(B + PONTO + AlunoEnum.EMAIL.getValor() + VIRGULA);
			sql.append(D + PONTO + PerfilAcessoEnum.ID.getValor() + VIRGULA);
			sql.append(D + PONTO + CursoEnum.ID.getValor() + VIRGULA);
			sql.append(C + PONTO + CursoEnum.CODIGO_CURSO.getValor() + VIRGULA);
			sql.append(C + PONTO + CursoEnum.DESCRICAO.getValor());
			// FROM
			sql.append(FROM + GraduacaoEnum.GRADUACAO.getValor() + A);
			// INNER JOIN
			sql.append(INNER_JOIN + AlunoEnum.ALUNOS.getValor() + B);
			sql.append(ON + PARENTESE_ESQ);
			sql.append(A + PONTO + GraduacaoEnum.ID_ALUNO.getValor() + IGUAL + B + PONTO + AlunoEnum.ID.getValor());
			sql.append(PARENTESE_DIR);
			// INNER JOIN
			sql.append(INNER_JOIN + CursoEnum.CURSOS.getValor() + C);
			sql.append(ON + PARENTESE_ESQ);
			sql.append(A + PONTO + GraduacaoEnum.ID_CURSO.getValor() + IGUAL + C + PONTO + CursoEnum.ID.getValor());
			sql.append(PARENTESE_DIR);
			// INNER JOIN
			sql.append(INNER_JOIN + PerfilAcessoEnum.PERFIS_ACESSO.getValor() + D);
			sql.append(ON + PARENTESE_ESQ);
			sql.append(B + PONTO + AlunoEnum.PERFIL.getValor() + IGUAL + D + PONTO + PerfilAcessoEnum.ID.getValor());
			sql.append(PARENTESE_DIR);
			// WHERE
			sql.append(WHERE);
			sql.append(GraduacaoEnum.MATRICULA.getValor() + IGUAL + DOIS_PONTOS + GraduacaoEnum.MATRICULA.getValor() + AND);
			sql.append(GraduacaoEnum.SENHA.getValor() + IGUAL + DOIS_PONTOS + GraduacaoEnum.SENHA.getValor());
			
			GraduacaoVO graduacao = getNamedParameterJdbcTemplate().queryForObject(sql.toString(), params, new GraduacaoRowMapper());
			
			vo.setAluno(graduacao);
			
			return vo;
			
			/*
			List<Map<String, Object>> resultSet = getNamedParameterJdbcTemplate().queryForList(sql.toString(), params);
			Iterator<Map<String, Object>> iterator = resultSet.iterator();
			
			if (iterator.hasNext()){
				
				for (Map<String, Object> resultado: resultSet){
					
					vo.getAluno().setDataInicio((Date) resultado.get(GraduacaoEnum.DT_INICIO.getValor()));
					vo.getAluno().setDataFim((Date) resultado.get(GraduacaoEnum.DT_FIM.getValor()));
					vo.getAluno().getAluno().setId(resultado.get(AlunoEnum.ID.getValor()).toString());
					vo.getAluno().getAluno().setNome(resultado.get(AlunoEnum.NOME.getValor()).toString());
					vo.getAluno().getAluno().setSobrenome(resultado.get(AlunoEnum.SOBRENOME.getValor()).toString());
					vo.getAluno().getAluno().setEmail(resultado.get(AlunoEnum.EMAIL.getValor()).toString());
					vo.getAluno().getAluno().getPerfil().setId((Integer) resultado.get(AlunoEnum.PERFIL.getValor()));
					vo.getAluno().getCurso().setId(resultado.get(CursoEnum.ID.getValor()).toString());
					vo.getAluno().getCurso().setCodCurso(resultado.get(CursoEnum.CODIGO_CURSO.getValor()).toString());
					vo.getAluno().getCurso().setDescricao(resultado.get(CursoEnum.DESCRICAO.getValor()).toString());
				}
				
				return true;
				
			}
			*/

		}
		catch(EmptyResultDataAccessException e){
			return null;
		}
		
		//return false;
	
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void incluir(UsuarioVO vo) throws SQLException {
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			
			
			StringBuilder sql = new StringBuilder();

			
			getNamedParameterJdbcTemplate().update(sql.toString(), params);
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
