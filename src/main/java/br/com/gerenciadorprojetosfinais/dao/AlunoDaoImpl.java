package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.AlunoEnum;
import br.com.gerenciadorprojetosfinais.enums.CursoEnum;
import br.com.gerenciadorprojetosfinais.enums.GraduacaoEnum;
import br.com.gerenciadorprojetosfinais.enums.UniversidadeEnum;
import br.com.gerenciadorprojetosfinais.vo.AlunoVO;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;

@Repository
public class AlunoDaoImpl extends BaseDao implements AlunoDao {
	
	//--> Campo genÃ©rico
	private static final String VALOR    = "valor";
	
	//--> Campos de apelido SQL
	private static final String A        = " A";
	private static final String G        = " G";
	private static final String C        = " C";
	private static final String U        = " U";
	
	/**
	 * {@inheritDoc}
	 */
	public boolean validarUsuario(GraduacaoVO vo) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(UniversidadeEnum.UNIVERSIDADES.getValor(), vo.getUniversidade());
			params.addValue(GraduacaoEnum.MATRICULA.getValor(), vo.getMatricula());
			params.addValue(GraduacaoEnum.SENHA.getValor(), vo.getSenha());
			
			StringBuilder sql = new StringBuilder();
			
			sql.append(SELECT + A + PONTO + AlunoEnum.CPF.getValor() + VIRGULA + A + PONTO + AlunoEnum.NOME.getValor() + VIRGULA);
			sql.append(A + PONTO + AlunoEnum.SOBRENOME.getValor() + VIRGULA + C + PONTO + CursoEnum.ID.getValor() + VIRGULA);
			sql.append(C + PONTO + CursoEnum.DESCRICAO.getValor() + VIRGULA + U + PONTO + UniversidadeEnum.CNPJ.getValor() + VIRGULA);
			sql.append(U + PONTO + UniversidadeEnum.DESCRICAO.getValor());
			sql.append(FROM);
			sql.append(AlunoEnum.ALUNOS.getValor() + A);
			// JOIN com a tabela de Graduação
			sql.append(INNER_JOIN);
			sql.append(GraduacaoEnum.GRADUACAO.getValor() + G);
			sql.append(ON);
			sql.append(PARENTESE_ESQ);
			sql.append(A + PONTO + AlunoEnum.CPF.getValor() + IGUAL + G + PONTO + GraduacaoEnum.CPF.getValor());
			sql.append(PARENTESE_DIR);
			// JOIN com a tabela de Cursos
			sql.append(INNER_JOIN);
			sql.append(CursoEnum.CURSOS.getValor() + C);
			sql.append(ON);
			sql.append(PARENTESE_ESQ);
			sql.append(C + PONTO + CursoEnum.ID.getValor() + IGUAL + C + PONTO + GraduacaoEnum.ID_CURSO.getValor());
			sql.append(PARENTESE_DIR);
			// JOIN com a tabela de Universidades
			sql.append(INNER_JOIN);
			sql.append(UniversidadeEnum.UNIVERSIDADES.getValor() + U);
			sql.append(PARENTESE_ESQ);
			sql.append(U + UniversidadeEnum.CNPJ.getValor() + IGUAL + G + PONTO + GraduacaoEnum.CNPJ.getValor());
			sql.append(PARENTESE_DIR);
			
			List<Map<String, Object>> resultSet = jdbcTemplate.queryForList(sql.toString(), params);
			Iterator<Map<String, Object>> iterator = resultSet.iterator();
			
			if (iterator.hasNext()){
				
				for (Map<String, Object> resultado: resultSet){
					
					vo.getAluno().setCpf(resultado.get(A + PONTO + AlunoEnum.CPF.getValor()).toString());
					vo.getAluno().setNome(resultado.get(A + PONTO + AlunoEnum.NOME.getValor()).toString());
					vo.getAluno().setSobrenome(resultado.get(A + PONTO + AlunoEnum.SOBRENOME.getValor()).toString());
					vo.getCurso().setId(resultado.get(C + PONTO + CursoEnum.ID.getValor()).toString());
					vo.getCurso().setDescricao(resultado.get(C + PONTO + CursoEnum.DESCRICAO.getValor()).toString());
					vo.getUniversidade().setCnpj(resultado.get(U + PONTO + UniversidadeEnum.CNPJ.getValor()).toString());
					vo.getUniversidade().setDescricao(resultado.get(U + PONTO + UniversidadeEnum.DESCRICAO.getValor()).toString());					
					
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
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(AlunoEnum.CPF.getValor(), vo.getCpf());
			params.addValue(AlunoEnum.NOME.getValor(), vo.getNome());
			params.addValue(AlunoEnum.SOBRENOME.getValor(), vo.getSobrenome());
			params.addValue(AlunoEnum.NOMEPAI.getValor(), vo.getNomePai());
			params.addValue(AlunoEnum.NOMEMAE.getValor(), vo.getNomeMae());
			params.addValue(AlunoEnum.LOGRADOURO.getValor(), vo.getLogradouro());
			params.addValue(AlunoEnum.CEP.getValor(), vo.getCep());
			params.addValue(AlunoEnum.BAIRRO.getValor(), vo.getBairro());
			params.addValue(AlunoEnum.MUNICIPIO.getValor(), vo.getMunicipio());
			params.addValue(AlunoEnum.ID_ESTADO.getValor(), vo.getEstado().getId());
			params.addValue(AlunoEnum.DDD_TELEFONE.getValor(), vo.getTelefone().replaceAll("[()-]", "").substring(0, 2));
			params.addValue(AlunoEnum.TELEFONE.getValor(), vo.getTelefone().replaceAll("[()-]", "").substring(2, 10));
			params.addValue(AlunoEnum.DDD_CELULAR.getValor(), vo.getCelular().replaceAll("[()-]", "").substring(0, 2));
			params.addValue(AlunoEnum.CELULAR.getValor(), vo.getCelular().replaceAll("[()-]", "").substring(2, 10));
			
			StringBuilder sql = new StringBuilder();

			
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
