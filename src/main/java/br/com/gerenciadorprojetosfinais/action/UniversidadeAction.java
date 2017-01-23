package br.com.gerenciadorprojetosfinais.action;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.gerenciadorprojetosfinais.facade.EstadoServiceFacade;
import br.com.gerenciadorprojetosfinais.facade.UniversidadeServiceFacade;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.EstadoVO;
import br.com.gerenciadorprojetosfinais.vo.UniversidadeVO;

@Controller
@Scope("request")
public class UniversidadeAction extends BaseAction {

	private static final long serialVersionUID = -2106494978906296871L;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UniversidadeAction.class);
	
	@Autowired
	private UniversidadeServiceFacade universidadeFacade;
	@Autowired
	private EstadoServiceFacade estadoFacade;
	private UniversidadeVO vo;
	List<ComboVO> listaEstados;
	
	public String iniciar(){
		
		listaEstados = new ArrayList<ComboVO>();
		
		try{
			
			listaEstados = estadoFacade.carregarEstados();
			return SUCCESS;
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			return ERROR;
			
		}
		
	}
}
