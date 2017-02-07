package br.com.gerenciadorprojetosfinais.dao;

import java.sql.SQLException;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import br.com.gerenciadorprojetosfinais.enums.AlunoEnum;
import br.com.gerenciadorprojetosfinais.enums.EnderecoEnum;
import br.com.gerenciadorprojetosfinais.enums.FuncionarioEnum;
import br.com.gerenciadorprojetosfinais.enums.UniversidadeEnum;
import br.com.gerenciadorprojetosfinais.vo.EnderecoVO;

@Repository
public class EnderecoDaoImpl extends BaseDao implements EnderecoDao {
	
	/**
	 * {@inheritDoc}
	 */
	public void incluir(String id, String tabela, EnderecoVO vo) throws SQLException{
		
		try{
			
			MapSqlParameterSource params = new MapSqlParameterSource();
			params.addValue(EnderecoEnum.LOGRADOURO.getValor(), vo.getLogradouro());
			params.addValue(EnderecoEnum.CEP.getValor(), vo.getCep().replace("-", ""));
			params.addValue(EnderecoEnum.BAIRRO.getValor(), vo.getBairro());
			params.addValue(EnderecoEnum.MUNICIPIO.getValor(), vo.getMunicipio());
			params.addValue(EnderecoEnum.ID_ESTADO.getValor(), vo.getEstado().getId());
			
			if ((AlunoEnum.ALUNOS.getValor()).equals(tabela)){
				params.addValue(EnderecoEnum.ID_ALUNO.getValor(), id);
			}
			
			if ((UniversidadeEnum.UNIVERSIDADES.getValor()).equals(tabela)){
				params.addValue(EnderecoEnum.CNPJ_FILIAL.getValor(), id);
			}
			
			if ((FuncionarioEnum.FUNCIONARIOS.getValor()).equals(tabela)){
				params.addValue(EnderecoEnum.ID_FUNCIONARIO.getValor(), id);
			}
			
			StringBuilder sql = new StringBuilder();
			sql.append(INSERT + EnderecoEnum.ENDERECOS.getValor());
			sql.append(PARENTESE_ESQ);
			sql.append(EnderecoEnum.LOGRADOURO.getValor() + VIRGULA + EnderecoEnum.CEP.getValor() + VIRGULA);
			sql.append(EnderecoEnum.BAIRRO.getValor() + VIRGULA + EnderecoEnum.MUNICIPIO.getValor() + VIRGULA + EnderecoEnum.ID_ESTADO.getValor() + VIRGULA);
			
			if ((AlunoEnum.ALUNOS.getValor()).equals(tabela)){
				sql.append(EnderecoEnum.ID_ALUNO.getValor());
			}
			
			if ((UniversidadeEnum.UNIVERSIDADES.getValor()).equals(tabela)){
				sql.append(EnderecoEnum.CNPJ_FILIAL.getValor());
			}
			
			if ((FuncionarioEnum.FUNCIONARIOS.getValor()).equals(tabela)){
				sql.append(EnderecoEnum.ID_FUNCIONARIO.getValor());
			}
			
			sql.append(PARENTESE_DIR);
			sql.append(VALUES);
			sql.append(PARENTESE_ESQ);
			sql.append(DOIS_PONTOS + EnderecoEnum.LOGRADOURO.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + EnderecoEnum.CEP.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + EnderecoEnum.BAIRRO.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + EnderecoEnum.MUNICIPIO.getValor() + VIRGULA);
			sql.append(DOIS_PONTOS + EnderecoEnum.ID_ESTADO.getValor() + VIRGULA);
			
			if ((AlunoEnum.ALUNOS.getValor()).equals(tabela)){
				sql.append(DOIS_PONTOS + EnderecoEnum.ID_ALUNO.getValor());
			}
			
			if ((UniversidadeEnum.UNIVERSIDADES.getValor()).equals(tabela)){
				sql.append(DOIS_PONTOS + EnderecoEnum.CNPJ_FILIAL.getValor());
			}
			
			if ((FuncionarioEnum.FUNCIONARIOS.getValor()).equals(tabela)){
				sql.append(DOIS_PONTOS + EnderecoEnum.ID_FUNCIONARIO.getValor());
			}
			
			sql.append(PARENTESE_DIR);
			
			jdbcTemplate.update(sql.toString(), params);
			
		}
		catch(Exception e){
			throw new SQLException(e);
		}
		
	}
	
}
