package br.com.gerenciadorprojetosfinais.action;

import java.sql.SQLException;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.gerenciadorprojetosfinais.facade.LoginServiceFacade;
import br.com.gerenciadorprojetosfinais.vo.RetornoAjaxVO;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

@Controller
@Scope("request")
public class LoginAction extends BaseAction {

	private static final long serialVersionUID = -2139948261206767996L;
	
	@Autowired
	LoginServiceFacade loginFacade;
	
	private UsuarioVO usuario;
	
	public String validarUsuario(){
		
		retornoAjax = new RetornoAjaxVO();
		Map<String, Object> sessao = getSession();
		
		try{
			
			if (loginFacade.validarUsuario(usuario)){
				retornoAjax.setTipoRetornado(SUCCESS);
				retornoAjax.setObjetoRetornado(usuario);
				
				sessao.put("matricula", usuario.getMatricula());
				sessao.put("senha", usuario.getSenha());
				
				if (usuario.getTipoUsuario() == 0){
					
					sessao.put("id", usuario.getDocente().getFuncionario().getId());
					sessao.put("nome", usuario.getDocente().getFuncionario().getNome());
					sessao.put("sobrenome", usuario.getDocente().getFuncionario().getSobrenome());
					sessao.put("email", usuario.getDocente().getFuncionario().getEmail());
					sessao.put("cargo", usuario.getDocente().getFuncionario().getCargo());
					sessao.put("perfil", usuario.getDocente().getFuncionario().getPerfil().getId());
					sessao.put("codigoCurso", usuario.getDocente().getCurso().getCodCurso());
					sessao.put("descricaoCurso", usuario.getDocente().getCurso().getDescricao());
					sessao.put("dataInicio", usuario.getDocente().getDataInicio());
					sessao.put("dataFim", usuario.getDocente().getDataFim());
			
				}
				else if (usuario.getTipoUsuario() == 1){
					
					sessao.put("id", usuario.getAluno().getAluno().getId());
					sessao.put("nome", usuario.getAluno().getAluno().getNome());
					sessao.put("sobrenome", usuario.getAluno().getAluno().getSobrenome());
					sessao.put("email", usuario.getAluno().getAluno().getEmail());
					sessao.put("perfil", usuario.getAluno().getAluno().getPerfil().getId());
					sessao.put("codigoCurso", usuario.getAluno().getCurso().getCodCurso());
					sessao.put("descricaoCurso", usuario.getAluno().getCurso().getDescricao());
					sessao.put("dataInicio", usuario.getAluno().getDataInicio());
					sessao.put("dataFim", usuario.getAluno().getDataFim());
					
				}
				
			}
			else{
				retornoAjax.setTipoRetornado(ERROR);
				retornoAjax.setExceptionRetornada(getText("msg.usuario.invalido"));
			}
			
		}
		catch(SQLException e){
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(getText("msg.generico.erro") + e.getMessage());
		}
		
		return RETORNO_AJAX;
	}
	
	//--> Getters e Setters

	public LoginServiceFacade getLoginFacade() {
		return loginFacade;
	}

	public void setLoginFacade(LoginServiceFacade loginFacade) {
		this.loginFacade = loginFacade;
	}

	public UsuarioVO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}
	
}
