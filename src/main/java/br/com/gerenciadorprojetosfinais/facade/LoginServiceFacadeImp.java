package br.com.gerenciadorprojetosfinais.facade;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciadorprojetosfinais.dao.AlunoDao;
import br.com.gerenciadorprojetosfinais.dao.DocenteDao;
import br.com.gerenciadorprojetosfinais.exception.BusinessException;
import br.com.gerenciadorprojetosfinais.vo.UsuarioVO;

@Service
public class LoginServiceFacadeImp implements LoginServiceFacade {

	@Autowired
	AlunoDao daoAluno;
	
	@Autowired
	DocenteDao daoDocente;
	
	public boolean validarUsuario(UsuarioVO vo) throws SQLException {
		
		boolean resultado = false;
		
		if (vo.getTipoUsuario() == 0){
			resultado = daoAluno.validarAluno(vo);
		}
		else if (vo.getTipoUsuario() == 1){
			resultado = daoDocente.validarDocente(vo);
		}

		return resultado;
		
	}
	
}
