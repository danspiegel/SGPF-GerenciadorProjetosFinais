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
					titulo: 'Titulo',
					mensagem : 'Mensagem',
					classe_mensagem : 'classe_mensagem',
					id_mensagem : '#id_mensagem'
			};
			
			var opt = $.extend(defaults, options);
			
			var content = '';
			
			$(opt.id_mensagem).hide();
			
			$(opt.id_mensagem).removeClass("alert alert-danger alert-dismissible");
			$(opt.id_mensagem).removeClass("alert alert-info alert-dismissible");
			$(opt.id_mensagem).removeClass("alert alert-warning alert-dismissible");
			$(opt.id_mensagem).removeClass("alert alert-success alert-dismissible");
			
			content += '<h4>';
	
			if (opt.classe_mensagem == "success"){
				$(opt.id_mensagem).addClass("alert alert-success alert-dismissible");
				content += '<i class="icon fa fa-check"></i>';
			}
			else if (opt.classe_mensagem == "info"){
				$(opt.id_mensagem).addClass("alert alert-info alert-dismissible");
				content += '<i class="icon fa fa-info"></i>';
			}
			else if (opt.classe_mensagem == "warning"){
				$(opt.id_mensagem).addClass("alert alert-warning alert-dismissible");
				content += '<i class="icon fa fa-warning"></i>';
			}
			else if (opt.classe_mensagem == "error"){
				$(opt.id_mensagem).addClass("alert alert-danger alert-dismissible");
				content += '<i class="icon fa fa-ban"></i>';
			}
			
			content += opt.titulo;
			content += '</h4>';
			content += '<p>' + opt.mensagem + '</p>';
			
			$(opt.id_mensagem).html(content);
			
			$(opt.id_mensagem).show();
			
			setTimeout(function () {
                $(opt.id_mensagem).fadeOut();
            }, 15000);
            
		}
		
	});
	
	$.fn.extend({
		
		esconderMensagem: function(id){
			
			$(id).hide();
			
		}
		
	});
	
})(jQuery);