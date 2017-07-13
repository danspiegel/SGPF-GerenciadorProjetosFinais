package br.com.gerenciadorprojetosfinais.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.gerenciadorprojetosfinais.facade.AlunoServiceFacade;
import br.com.gerenciadorprojetosfinais.vo.GraduacaoVO;
import br.com.gerenciadorprojetosfinais.vo.RetornoAjaxVO;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

@Controller
@Scope("request")
public class AlunoAction extends BaseAction {

	private static final long serialVersionUID = 9067501493776262956L;

	private static final Logger LOGGER = LoggerFactory.getLogger(AlunoAction.class);
	
	@Autowired
	private AlunoServiceFacade alunoFacade;
	
	private UsuarioVO usuario;
	
	public String incluir(){
		
		retornoAjax = new RetornoAjaxVO();
		
		try{
			
			alunoFacade.incluir(usuario);
			retornoAjax.setTipoRetornado(SUCCESS);
			
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(getText("msg.aluno.incluir.erro") + e.getMessage());
		}
		
		return RETORNO_AJAX;
		
	}
	
	//--> Getters e Setters
	
	public AlunoServiceFacade getAlunoFacade() {
		return alunoFacade;
	}
	public void setAlunoFacade(AlunoServiceFacade alunoFacade) {
		this.alunoFacade = alunoFacade;
	}

	public UsuarioVO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}

}
