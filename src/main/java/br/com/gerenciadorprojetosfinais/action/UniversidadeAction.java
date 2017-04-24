package br.com.gerenciadorprojetosfinais.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.gerenciadorprojetosfinais.facade.UniversidadeServiceFacade;
import br.com.gerenciadorprojetosfinais.vo.FuncionarioVO;
import br.com.gerenciadorprojetosfinais.vo.RetornoAjaxVO;
import br.com.gerenciadorprojetosfinais.vo.UniversidadeVO;

@Controller
@Scope("request")
public class UniversidadeAction extends BaseAction {

	private static final long serialVersionUID = -2106494978906296871L;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(UniversidadeAction.class);
	
	@Autowired
	private UniversidadeServiceFacade universidadeFacade;
	private UniversidadeVO universidade;
	private FuncionarioVO funcionario;
	
	/**
	 * Método responsável por incluir as universidades.
	 * @return String
	 */
	public String incluir(){
		
		retornoAjax = new RetornoAjaxVO();
		
		try{
		
			universidadeFacade.incluirUniversidade(universidade);
			retornoAjax.setTipoRetornado(SUCCESS);
			retornoAjax.setObjetoRetornado(getText("msg.universidade.incluir.sucesso"));
			retornoAjax.setPagina("../pages/login.jsp");
			
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(getText("msg.universidade.incluir.erro") + e.getMessage());
		}
		
		return RETORNO_AJAX;
		
	}
	
	public String listar(){
		
		retornoAjax = new RetornoAjaxVO();
		
		try{
			
			///listaUniversidades = universidadeFacade.carregarUniversidades();
			retornoAjax.setTipoRetornado(SUCCESS);
			//retornoAjax.setObjetoRetornado(listaUniversidades);
			
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(getText("msg.universidade.listar.erro") + e.getMessage());
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

	public UniversidadeVO getUniversidade() {
		return universidade;
	}

	public void setUniversidade(UniversidadeVO universidade) {
		this.universidade = universidade;
	}

	public FuncionarioVO getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(FuncionarioVO funcionario) {
		this.funcionario = funcionario;
	}
	
}
