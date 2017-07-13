package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciadorprojetosfinais.dao.AlunoDao;
import br.com.gerenciadorprojetosfinais.dao.DocenteDao;
import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

@Service
public class UsuarioServiceFacadeImpl implements UsuarioServiceFacade {

	@Autowired
	AlunoDao daoAluno;
	
	@Autowired
	DocenteDao daoDocente;
	
	public UsuarioVO validarUsuario(UsuarioVO vo) throws SQLException, BusinessException {
		
		UsuarioVO usuario = new UsuarioVO();
		
		if (vo.getTipoUsuario() == 0){
			usuario = daoAluno.validarAluno(vo);
		}
		else if (vo.getTipoUsuario() == 1){
			usuario = daoDocente.validarDocente(vo);
		}
		
		if (usuario == null){
			throw new BusinessException("Usuário ou senha inválido.");
		}
		
		return usuario;
		
	}
	
}
