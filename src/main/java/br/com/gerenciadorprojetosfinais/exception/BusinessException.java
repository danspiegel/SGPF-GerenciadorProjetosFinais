package br.com.gerenciadorprojetosfinais.exception;

public class BusinessException extends Exception {

	private static final long serialVersionUID = -6287158268581189589L;

	public BusinessException(String mensagem){
		super(mensagem);
	}
	
}
