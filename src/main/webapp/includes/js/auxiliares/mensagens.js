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
			
			if (opt.classe_mensagem == "alert alert-danger"){
				$(opt.id_mensagem).addClass(opt.classe_mensagem);
			}
			else{
			
				content += '<h4>';
		
				if (opt.classe_mensagem == "alert alert-success alert-dismissible"){
					$(opt.id_mensagem).addClass(opt.classe_mensagem);
					content += '<i class="icon fa fa-check"></i>';
					content += opt.titulo;
				}
				else if (opt.classe_mensagem == "alert alert-info alert-dismissible"){
					$(opt.id_mensagem).addClass(opt.classe_mensagem);
					content += '<i class="icon fa fa-info"></i>';
					content += opt.titulo;
				}
				else if (opt.classe_mensagem == "alert alert-warning alert-dismissible"){
					$(opt.id_mensagem).addClass(opt.classe_mensagem);
					content += '<i class="icon fa fa-warning"></i>';
					content += opt.titulo;
				}
				else if (opt.classe_mensagem == "alert alert-danger alert-dismissible"){
					$(opt.id_mensagem).addClass(opt.classe_mensagem);
					content += '<i class="icon fa fa-ban"></i>';
					content += opt.titulo;
				}
			
			}
			
			content += '</h4>';
			content += '<p>' + opt.mensagem + '</p>';
			
			$(opt.id_mensagem).html(content);
			
			$(opt.id_mensagem).show();
			
			if (opt.classe_mensagem != "alert alert-danger"){
				setTimeout(function () {
	                $(opt.id_mensagem).fadeOut();
	            }, 15000);
			}
            
		}
		
	});
	
	$.fn.extend({
		
		esconderMensagem: function(id){
			
			$(id).removeClass("alert alert-danger alert-dismissible");
			$(id).removeClass("alert alert-info alert-dismissible");
			$(id).removeClass("alert alert-warning alert-dismissible");
			$(id).removeClass("alert alert-success alert-dismissible");
			$(id).removeClass("alert alert-danger");
			
			$(id).empty();
			
			$(id).hide();
			
		}
		
	});
	
	$.fn.extend({
		
		exibirAlertaMensagem: function(options){
			
			var defaults = {
					titulo: 'Titulo',
					mensagem : 'Mensagem',
					tipoMensagem: 'Erro'
			};
			
			var opt = $.extend(defaults, options);
			
			var tipo = '';
			
			if (opt.tipoMensagem == "error"){
				tipo = "error";
			}
			else if (opt.tipoMensagem == "info"){
				tipo = "info";
			}
			else if (opt.tipoMensagem == "warning"){
				tipo = "warning";
			}
			else if (opt.tipoMensagem == "success"){
				tipo = "success";
			}
			
			swal(opt.titulo, opt.mensagem, tipo)
			
		}
		
	});
	
})(jQuery);