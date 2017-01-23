package br.com.gerenciadorprojetosfinais.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.facade.AlunoServiceFacade;
import br.com.gerenciadorprojetosfinais.facade.UniversidadeServiceFacade;
import br.com.gerenciadorprojetosfinais.vo.AlunoVO;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.RetornoAjaxVO;

@Controller
@Scope("request")
public class AlunoAction extends BaseAction {

	private static final long serialVersionUID = 9067501493776262956L;


	private static final Logger LOGGER = LoggerFactory.getLogger(AlunoAction.class);
	
	@Autowired
	private AlunoServiceFacade alunoFacade;
	@Autowired
	private UniversidadeServiceFacade universidadeFacade;
	private AlunoVO vo;
	List<ComboVO> listaUniversidades;
	
	public String iniciar(){
		
		listaUniversidades = new ArrayList<ComboVO>();
		
		try{
			
			universidadeFacade.carregarUniversidades(listaUniversidades);
			return SUCCESS;
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			return ERROR;
		}
		
	}
	
	public String validarUsuario(){
		
		retornoAjax = new RetornoAjaxVO();
		Map<String, Object> sessao = getSession();
		
		try{
			
			if (alunoFacade.validarUsuario(vo)){
				
				sessao.put("alunoId", vo.getId());
				sessao.put("alunoMatricula", vo.getMatricula());
				sessao.put("alunoNome", vo.getNome());
				sessao.put("alunoSobrenome", vo.getSobrenome());
				sessao.put("alunoCpf", vo.getCpf());
				
				retornoAjax.setTipoRetornado(SUCCESS);
				retornoAjax.setObjetoRetornado(vo);
			}
			else{
				retornoAjax.setTipoRetornado(ERROR);
				retornoAjax.setObjetoRetornado(getText("msg.aluno.usuario.invalido"));
				
			}
			
		}
		catch(SQLException e){
			LOGGER.error(e.getMessage());
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(getText("msg.aluno.usuario.erro") + e.getMessage());
		}
		catch(BusinessException e){
			LOGGER.error(e.getMessage());
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(e.getMessage());
		}
		
		return RETORNO_AJAX;
		
	}
	
}
