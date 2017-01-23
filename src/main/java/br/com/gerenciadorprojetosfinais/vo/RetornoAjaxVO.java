package br.com.gerenciadorprojetosfinais.vo;

public class RetornoAjaxVO {

	private String tipoRetornado;
	private Object objetoRetornado;
	private String exceptionRetornada;
	private String pagina;
	
	public String getTipoRetornado() {
		return tipoRetornado;
	}
	public void setTipoRetornado(String tipoRetornado) {
		this.tipoRetornado = tipoRetornado;
	}
	public Object getObjetoRetornado() {
		return objetoRetornado;
	}
	public void setObjetoRetornado(Object objetoRetornado) {
		this.objetoRetornado = objetoRetornado;
	}
	public String getExceptionRetornada() {
		return exceptionRetornada;
	}
	public void setExceptionRetornada(String exceptionRetornada) {
		this.exceptionRetornada = exceptionRetornada;
	}
	public String getPagina() {
		return pagina;
	}
	public void setPagina(String pagina) {
		this.pagina = pagina;
	}
	
}
