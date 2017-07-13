package br.com.gerenciadorprojetosfinais.action;

import java.sql.SQLException;
import java.util.Date;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.facade.UsuarioServiceFacade;
import br.com.gerenciadorprojetosfinais.vo.RetornoAjaxVO;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

@Controller
@Scope("request")
public class UsuarioAction extends BaseAction {

	private static final long serialVersionUID = -2139948261206767996L;
	private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioAction.class);
	
	@Autowired
	UsuarioServiceFacade usuarioFacade;
	
	private UsuarioVO usuario;
	
	Map<String, Object> sessao;
	
	public String validarUsuario(){
		
		retornoAjax = new RetornoAjaxVO();
		sessao = getSession();
		
		try{
				
			usuarioFacade.validarUsuario(usuario);
			
			retornoAjax.setTipoRetornado(SUCCESS);
			retornoAjax.setObjetoRetornado(usuario);
				
			sessao.put("matricula", usuario.getMatricula());
			sessao.put("senha", usuario.getSenha());
			sessao.put("tipoUsuario", usuario.getTipoUsuario());
				
			if (usuario.getTipoUsuario() == 1){
					
				sessao.put("id", usuario.getDocente().getFuncionario().getId());
				sessao.put("nome", usuario.getDocente().getFuncionario().getNome());
				sessao.put("sobrenome", usuario.getDocente().getFuncionario().getSobrenome());
				sessao.put("email", usuario.getDocente().getFuncionario().getEmail());
				sessao.put("cargo", usuario.getDocente().getFuncionario().getCargo());
				sessao.put("perfil", usuario.getDocente().getFuncionario().getPerfil().getId());
				sessao.put("matricula", usuario.getMatricula());
				sessao.put("senha", usuario.getSenha());
				sessao.put("idCurso", usuario.getDocente().getCurso().getId());
				sessao.put("codigoCurso", usuario.getDocente().getCurso().getCodCurso());
				sessao.put("descricaoCurso", usuario.getDocente().getCurso().getDescricao());
				sessao.put("dataInicio", usuario.getDocente().getDataInicio());
				sessao.put("dataFim", usuario.getDocente().getDataFim());
					
				retornoAjax.setPagina("");
			
			}
			else if (usuario.getTipoUsuario() == 0){
					
				sessao.put("id", usuario.getAluno().getAluno().getId());
				sessao.put("nome", usuario.getAluno().getAluno().getNome());
				sessao.put("sobrenome", usuario.getAluno().getAluno().getSobrenome());
				sessao.put("email", usuario.getAluno().getAluno().getEmail());
				sessao.put("perfil", usuario.getAluno().getAluno().getPerfil().getId());
				sessao.put("matricula", usuario.getMatricula());
				sessao.put("senha", usuario.getSenha());
				sessao.put("idCurso", usuario.getAluno().getCurso().getId());
				sessao.put("codigoCurso", usuario.getAluno().getCurso().getCodCurso());
				sessao.put("descricaoCurso", usuario.getAluno().getCurso().getDescricao());
				sessao.put("dataInicio", usuario.getAluno().getDataInicio());
				sessao.put("dataFim", usuario.getAluno().getDataFim());
					
				retornoAjax.setPagina("");
					
			}
			
		}
		catch(SQLException e){
			LOGGER.error(e.getMessage());
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(getText("msg.generico.erro") + e.getMessage());
		}
		catch(BusinessException e){
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(e.getMessage());
		}
		
		return RETORNO_AJAX;
	}
	
	public String carregarUsuario(){
		
		retornoAjax = new RetornoAjaxVO();
		sessao = getSession();
		
		try{
			
			retornoAjax.setTipoRetornado(SUCCESS);
			
			usuario.setMatricula((Long) sessao.get("matricula"));
			usuario.setSenha(sessao.get("senha").toString());
			usuario.setTipoUsuario((Integer) sessao.get("tipoUsuario"));
			
			if (sessao.get("tipoUsuario") == "1"){
			
				usuario.getDocente().getFuncionario().setId(sessao.get("id").toString());
				usuario.getDocente().getFuncionario().setNome(sessao.get("nome").toString());
				usuario.getDocente().getFuncionario().setSobrenome(sessao.get("sobrenome").toString());
				usuario.getDocente().getFuncionario().setEmail(sessao.get("email").toString());
				usuario.getDocente().getFuncionario().setCargo(sessao.get("cargo").toString());
				usuario.getDocente().getFuncionario().getPerfil().setId((Integer) sessao.get("perfil"));
				usuario.getDocente().getCurso().setId(sessao.get("idCurso").toString());
				usuario.getDocente().getCurso().setCodCurso(sessao.get("codigoCurso").toString());
				usuario.getDocente().getCurso().setDescricao(sessao.get("descricaoCurso").toString());
				usuario.getDocente().setDataInicio((Date) sessao.get("dataInicio"));
				
				if (null != sessao.get("dataFim")){
					usuario.getDocente().setDataFim((Date) sessao.get("dataFim"));
				}
				
			}
			else if (sessao.get("tipoUsuario") == "0"){
				
				usuario.getAluno().getAluno().setId(sessao.get("id").toString());
				usuario.getAluno().getAluno().setNome(sessao.get("nome").toString());
				usuario.getAluno().getAluno().setSobrenome(sessao.get("sobrenome").toString());
				usuario.getAluno().getAluno().setEmail(sessao.get("email").toString());
				usuario.getAluno().getAluno().getPerfil().setId((Integer) sessao.get("perfil"));
				usuario.getAluno().getCurso().setId(sessao.get("idCurso").toString());
				usuario.getAluno().getCurso().setCodCurso(sessao.get("codigoCurso").toString());
				usuario.getAluno().getCurso().setDescricao(sessao.get("descricaoCurso").toString());
				usuario.getAluno().setDataInicio((Date) sessao.get("dataInicio"));
				
				if (null != sessao.get("dataFim")){
					usuario.getAluno().setDataFim((Date) sessao.get("dataFim"));
				}
				
			}
			
			retornoAjax.setObjetoRetornado(usuario);
			
		}
		catch(Exception e){
			LOGGER.error(e.getMessage());
			retornoAjax.setTipoRetornado(ERROR);
			retornoAjax.setExceptionRetornada(getText("msg.usuario.carregar") + e.getMessage());
		}
		
		return RETORNO_AJAX;
		
	}
	
	//--> Getters e Setters

	public UsuarioVO getUsuario() {
		return usuario;
	}

	public void setUsuario(UsuarioVO usuario) {
		this.usuario = usuario;
	}

	public UsuarioServiceFacade getUsuarioFacade() {
		return usuarioFacade;
	}

	public void setUsuarioFacade(UsuarioServiceFacade usuarioFacade) {
		this.usuarioFacade = usuarioFacade;
	}
	
}
