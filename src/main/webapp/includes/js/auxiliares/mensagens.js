/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	/**
	 * Função: exibir_mensagem
	 * Tipo: jQuery
	 * Objetivo: Exibir as mensagens recebidas por parâmetros
	 */
	$.fn.extend({
		
		exibirMensagem: function(options){
			
			var defaults = {
					mensagem : 'Mensagem',
					classe_mensagem : 'classe_mensagem',
					id_mensagem : '#id_mensagem'
			};
			
			var opt = $.extend(defaults, options);
			
			$(opt.id_mensagem).hide();
			
			var content = '<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>';
			var content = '<strong>' + opt.mensagem + '</strong>';
			
			$(opt.id_mensagem).removeClass("alert alert-success alert-danger");
			
			$(opt.id_mensagem).attr("align","center");
			
			$(opt.id_mensagem).addClass(opt.classe_mensagem);
			
			$(opt.id_mensagem).html(content);
			
			$(opt.id_mensagem).show();
			
			/*
			setTimeout(function () {
                $(opt.id_mensagem).fadeOut();
            }, 15000);
            */
		}
		
	});
	
	$.fn.extend({
		
		esconderMensagem: function(id){
			
			$(id).hide();
			
		}
		
	});
	
})(jQuery);