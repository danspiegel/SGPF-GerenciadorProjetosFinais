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
	@Autowired
	private UniversidadeServiceFacade universidadeFacade;
	private GraduacaoVO vo;
	
	public String iniciar(){
		
		//listaUniversidades = new ArrayList<ComboVO>();
		
		try{
			
			//universidadeFacade.carregarUniversidades(listaUniversidade);
			return SUCCESS;
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			return ERROR;
		}
		
	}
	
	/**
	 * M�todo respons�vel pela valida��o do usu�rio no sistema.
	 * @return String
	 */
	public String validarUsuario(){
		
		retornoAjax = new RetornoAjaxVO();
		Map<String, Object> sessao = getSession();
		
		try{
			
			if (alunoFacade.validarUsuario(vo)){
				
				sessao.put("alunoMatricula", vo.getMatricula());
				sessao.put("alunoNome", vo.getAluno().getNome());
				sessao.put("alunoSobrenome", vo.getAluno().getSobrenome());
				sessao.put("alunoCursoId", vo.getCurso().getId());
				sessao.put("alunoCursoDescricao", vo.getCurso().getDescricao());
				
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
