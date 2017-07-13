package br.com.gerenciadorprojetosfinais.action;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.gerenciadorprojetosfinais.vo.RetornoAjaxVO;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

@Controller
@Scope("request")
public class BaseAction extends ActionSupport {
	
	private static final long serialVersionUID = -2595153460149736237L;
	private static final Logger LOGGER = LoggerFactory.getLogger(BaseAction.class);
	
	protected static final String RETORNO_AJAX = "retornoAjax";
	protected RetornoAjaxVO retornoAjax;
	
	//--> Construtor
	
	public BaseAction(){
		super();
	}
	
	/**
	 * Método responsável por recuperar o contexto da sessão
	 * 
	 * @return Map<String, Object>
	 */
	protected Map<String, Object> getSession(){
		return ActionContext.getContext().getSession();
	}

	//--> Getters e Setters
	
	public RetornoAjaxVO getRetornoAjax() {
		return retornoAjax;
	}

	public void setRetornoAjax(RetornoAjaxVO retornoAjax) {
		this.retornoAjax = retornoAjax;
	}
	
}
