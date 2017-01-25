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
import br.com.gerenciadorprojetosfinais.vo.RetornoAjaxVO;
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
	
	/**
	 * Método que carrega as combos ao entrar na página.
	 * @return String
	 */
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
	
	/**
	 * Método responsável por retornar a lista de estados.
	 * @return String
	 */
	public String listarEstados(){
		
		retornoAjax = new RetornoAjaxVO();
		listaEstados = new ArrayList<ComboVO>();
		
		try{
			
			listaEstados = estadoFacade.carregarEstados();
			retornoAjax.setTipoRetornado(SUCCESS);
			retornoAjax.setObjetoRetornado(listaEstados);
			
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(getText("msg.estado.carregar.erro") + e.getMessage());
		}
		
		return RETORNO_AJAX;
		
	}
	
	/**
	 * Método responsável por incluir as universidades.
	 * @return String
	 */
	public String incluir(){
		
		retornoAjax = new RetornoAjaxVO();
		
		try{
			
			universidadeFacade.incluir(vo);
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

	public EstadoServiceFacade getEstadoFacade() {
		return estadoFacade;
	}

	public void setEstadoFacade(EstadoServiceFacade estadoFacade) {
		this.estadoFacade = estadoFacade;
	}

	public UniversidadeVO getVo() {
		return vo;
	}

	public void setVo(UniversidadeVO vo) {
		this.vo = vo;
	}

	public List<ComboVO> getListaEstados() {
		return listaEstados;
	}

	public void setListaEstados(List<ComboVO> listaEstados) {
		this.listaEstados = listaEstados;
	}

}
