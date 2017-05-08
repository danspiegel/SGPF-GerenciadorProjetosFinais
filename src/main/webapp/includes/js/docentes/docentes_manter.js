/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	$.fn.extend({
		
		validarUsuario: function(){
			
			$.ajax({
				type: 'post',
				cache: false,
				dataType: 'json',
				data: $('#frmLogin :input').serializeArray(),
				url: 'usuarioValidar',
				success: function(retornoAjax){
					
					if (retornoAjax.tipoRetornado == "success"){
					
						window.location.href = '../pages/docentes/docentes_manter.jsp';
						
					}
					else{
						
						$(this).exibirMensagem({titulo:'Erro',
												mensagem:retornoAjax.exceptionRetornada,
							 					classe_mensagem:'error',
							 					id_mensagem:'#mensagens'});
						
					}
				},
				
				timeout: 5000,
				
				error: function(XMLHttpRequest, textStatus, errorThrown){
					
					$(this).exibirMensagem({titulo:'Erro',
											mensagem:("Ocorreu um erro interno. " + XMLHttpRequest.responseText),
						 					classe_mensagem:'error',
						 					id_mensagem:'#mensagens'});

					
				}
			});
			
		}
		
	});
	
})(jQuery)