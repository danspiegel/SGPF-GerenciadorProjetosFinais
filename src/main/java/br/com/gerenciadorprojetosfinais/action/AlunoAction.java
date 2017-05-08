package br.com.gerenciadorprojetosfinais.action;

import java.sql.SQLException;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.facade.AlunoServiceFacade;
import br.com.gerenciadorprojetosfinais.facade.UniversidadeServiceFacade;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;
import br.com.gerenciadorprojetosfinais.vo.RetornoAjaxVO;

@Controller
@Scope("request")
public class AlunoAction extends BaseAction {

	private static final long serialVersionUID = 9067501493776262956L;

	private static final Logger LOGGER = LoggerFactory.getLogger(AlunoAction.class);
	
	@Autowired
	private AlunoServiceFacade alunoFacade;
	
	private GraduacaoVO vo;
	
	
	
	//--> Getters e Setters
	
	public AlunoServiceFacade getAlunoFacade() {
		return alunoFacade;
	}
	public void setAlunoFacade(AlunoServiceFacade alunoFacade) {
		this.alunoFacade = alunoFacade;
	}
	public GraduacaoVO getVo() {
		return vo;
	}
	public void setVo(GraduacaoVO vo) {
		this.vo = vo;
	}

}
