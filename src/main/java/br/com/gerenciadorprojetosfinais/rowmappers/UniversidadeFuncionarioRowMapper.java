package br.com.gerenciadorprojetosfinais.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.gerenciadorprojetosfinais.dao.DocenteDaoImpl;
import br.com.gerenciadorprojetosfinais.enums.CursoEnum;
import br.com.gerenciadorprojetosfinais.enums.FuncionarioEnum;
import br.com.gerenciadorprojetosfinais.enums.PerfilAcessoEnum;
import br.com.gerenciadorprojetosfinais.enums.UniversidadeFuncionarioEnum;
import br.com.gerenciadorprojetosfinais.vo.UniversidadeFuncionarioVO;

public class UniversidadeFuncionarioRowMapper extends DocenteDaoImpl implements RowMapper<UniversidadeFuncionarioVO> {

	@Override
	public UniversidadeFuncionarioVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		UniversidadeFuncionarioVO vo = new UniversidadeFuncionarioVO();
		
		vo.setDataInicio(rs.getDate(UniversidadeFuncionarioEnum.DT_INICIO.getValor()));
		vo.setDataFim(rs.getDate(UniversidadeFuncionarioEnum.DT_FIM.getValor()));
		vo.getFuncionario().setId(rs.getString(FuncionarioEnum.ID.getValor()));
		vo.getFuncionario().setNome(rs.getString(FuncionarioEnum.NOME.getValor()));
		vo.getFuncionario().setSobrenome(rs.getString(FuncionarioEnum.SOBRENOME.getValor()));
		vo.getFuncionario().setEmail(rs.getString(FuncionarioEnum.EMAIL.getValor()));
		vo.getFuncionario().setCargo(rs.getString(FuncionarioEnum.CARGO.getValor()));
		vo.getFuncionario().getPerfil().setId(rs.getInt(PerfilAcessoEnum.ID.getValor()));
		vo.getCurso().setId(rs.getString(CursoEnum.ID.getValor()));
		vo.getCurso().setCodCurso(rs.getString(CursoEnum.CODIGO_CURSO.getValor()));
		vo.getCurso().setDescricao(rs.getString(CursoEnum.DESCRICAO.getValor()));
		
		return vo;
		
	}

}
