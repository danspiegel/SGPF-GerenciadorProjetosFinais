/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	$.fn.extend({
		
		validarFiltro: function(){
			
			var mensagens = new Array();
			var count = 0;
			
			if (count > 0){
				
				var content = "";
				
				for(var i = 0; i < mensagens.length; i++){
					content += mensagens[i];
					content += '<br/>';
				}
				
				$(this).esconder_msg_todas();
				
				$(this).exibir_mensagem({ mensagem: content,
										  tabela_mensagem: '#tbl_msg_erro',
										  td_mensagem: '#td_msg_erro'});
				
			}
			
		}
		
	});
	
	/**
	 * Função: $(document).ready(function(){});
	 * Tipo: jQuery
	 * Objetivo: Todo o código dentro dessa função será executado quando todos os elementos estiverem carregados.
	 */
	$(document).ready(function(){
	
		
	
	});
	
})(jQuery);