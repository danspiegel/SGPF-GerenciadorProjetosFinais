package br.com.projetofinal.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.projetofinal.facade.AlunoServiceFacade;
import br.com.projetofinal.vo.AlunoVO;
import br.com.projetofinal.vo.ComboVO;
import br.com.projetofinal.vo.RetornoAjaxVO;

@Controller
@Scope("request")
public class AlunoAction extends BaseAction {

	private static final long serialVersionUID = 9067501493776262956L;


	private static final Logger LOGGER = LoggerFactory.getLogger(AlunoAction.class);
	
	@Autowired
	private AlunoServiceFacade facade;
	private AlunoVO vo;
	List<ComboVO> listaUniversidades;
	
	public String iniciar(){
		
		listaUniversidades = new ArrayList<ComboVO>();
		
		try{
			
			return SUCCESS;
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			return ERROR;
		}
		
	}
	
	public String validarUsuario(){
		
		retornoAjax = new RetornoAjaxVO();
		
		try{
			
			if (facade.validarUsuario(vo)){
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
			retornoAjax.setExceptionRetornada(getText("msg.aluno.usuario.invalido") + e.getMessage());
		}
		
		return RETORNO_AJAX;
		
	}
	
}
