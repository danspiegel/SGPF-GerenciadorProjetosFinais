package br.com.gerenciadorprojetosfinais.rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import br.com.gerenciadorprojetosfinais.dao.AlunoDaoImpl;
import br.com.gerenciadorprojetosfinais.enums.AlunoEnum;
import br.com.gerenciadorprojetosfinais.enums.CursoEnum;
import br.com.gerenciadorprojetosfinais.enums.GraduacaoEnum;
import br.com.gerenciadorprojetosfinais.vo.AlunoVO;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;

public class GraduacaoRowMapper extends AlunoDaoImpl implements RowMapper<GraduacaoVO> {

	@Override
	public GraduacaoVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		GraduacaoVO vo = new GraduacaoVO();
		
		vo.setDataInicio(rs.getDate(GraduacaoEnum.DT_INICIO.getValor()));
		vo.setDataFim(rs.getDate(GraduacaoEnum.DT_FIM.getValor()));
		vo.getAluno().setId(rs.getString(AlunoEnum.ID.getValor()));
		vo.getAluno().setNome(rs.getString(AlunoEnum.NOME.getValor()));
		vo.getAluno().setSobrenome(rs.getString(AlunoEnum.SOBRENOME.getValor()));
		vo.getAluno().setEmail(rs.getString(AlunoEnum.EMAIL.getValor()));
		vo.getAluno().getPerfil().setId(rs.getInt(AlunoEnum.PERFIL.getValor()));
		vo.getCurso().setId(rs.getString(CursoEnum.ID.getValor()));
		vo.getCurso().setCodCurso(rs.getString(CursoEnum.CODIGO_CURSO.getValor()));
		vo.getCurso().setDescricao(rs.getString(CursoEnum.DESCRICAO.getValor()));
		
		return vo;
		
	}

}
