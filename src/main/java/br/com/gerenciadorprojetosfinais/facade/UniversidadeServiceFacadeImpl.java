package br.com.gerenciadorprojetosfinais.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gerenciadorprojetosfinais.dao.UniversidadeDao;

@Service
public class UniversidadeServiceFacadeImpl implements UniversidadeServiceFacade {

	@Autowired
	UniversidadeDao dao;
	
	
	
}
