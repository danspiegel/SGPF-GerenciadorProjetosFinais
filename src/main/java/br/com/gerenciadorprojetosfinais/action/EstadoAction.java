package br.com.gerenciadorprojetosfinais.action;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.gerenciadorprojetosfinais.facade.EstadoServiceFacade;
import br.com.gerenciadorprojetosfinais.vo.ComboVO;
import br.com.gerenciadorprojetosfinais.vo.RetornoAjaxVO;

@Controller
@Scope("request")
public class EstadoAction extends BaseAction {

	private static final long serialVersionUID = 1993796178690564802L;

	private static final Logger LOGGER = LoggerFactory.getLogger(AlunoAction.class);
	
	@Autowired
	private EstadoServiceFacade estadoFacade;
	private List<ComboVO> listaEstados;
	
	/**
	 * Método responsável por retornar a lista de estados.
	 * @return String
	 */
	public String listarEstados(){
		
		retornoAjax = new RetornoAjaxVO();
		
		try{
			
			listaEstados = estadoFacade.carregarEstados();
			retornoAjax.setTipoRetornado(SUCCESS);
			retornoAjax.setObjetoRetornado(listaEstados);
			
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(getText("msg.estado.listar.erro") + e.getMessage());
		}
		
		return RETORNO_AJAX;
		
	}

	//--> Getters e Setters
	
	public EstadoServiceFacade getEstadoFacade() {
		return estadoFacade;
	}

	public void setEstadoFacade(EstadoServiceFacade estadoFacade) {
		this.estadoFacade = estadoFacade;
	}

	public List<ComboVO> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<ComboVO> listaEstados) {
		this.listaEstados = listaEstados;
	}
	
}
