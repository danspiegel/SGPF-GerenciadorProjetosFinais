/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	/**
	 * Função: $(document).ready(function(){});
	 * Tipo: jQuery
	 * Objetivo: Todo o código dentro dessa função será executado quando todos os elementos estiverem carregados.
	 */
	$(document).ready(function(){
	
		$('#btn_primeiraEtapa').click(function(){
			$(this).validarFiltroPrimeiraEtapa();
		});
		
		$('#btn_segundaEtapa').click(function(){
			$(this).validarFiltroSegundaEtapa();
		});
		
		$(this).listarEstados();
	
	});
	
})(jQuery);