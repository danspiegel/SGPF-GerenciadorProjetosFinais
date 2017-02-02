package br.com.gerenciadorprojetosfinais.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.gerenciadorprojetosfinais.facade.UniversidadeServiceFacade;
import br.com.gerenciadorprojetosfinais.vo.FilialVO;
import br.com.gerenciadorprojetosfinais.vo.RetornoAjaxVO;

@Controller
@Scope("request")
public class UniversidadeAction extends BaseAction {

	private static final long serialVersionUID = -2106494978906296871L;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UniversidadeAction.class);
	
	@Autowired
	private UniversidadeServiceFacade universidadeFacade;
	private FilialVO vo;
	
	/**
	 * Método responsável por incluir as universidades.
	 * @return String
	 */
	public String incluir(){
		
		retornoAjax = new RetornoAjaxVO();
		
		try{
			
			universidadeFacade.incluirUniversidade(vo);
			retornoAjax.setTipoRetornado(SUCCESS);
			retornoAjax.setObjetoRetornado(getText("msg.universidade.incluir.sucesso"));
			
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(getText("msg.universidade.incluir.erro") + e.getMessage());
		}
		
		return RETORNO_AJAX;
		
	}

	//--> Getters e Setters
	
	public UniversidadeServiceFacade getUniversidadeFacade() {
		return universidadeFacade;
	}

	public void setUniversidadeFacade(UniversidadeServiceFacade universidadeFacade) {
		this.universidadeFacade = universidadeFacade;
	}

	public FilialVO getVo() {
		return vo;
	}

	public void setVo(FilialVO vo) {
		this.vo = vo;
	}
	
}
