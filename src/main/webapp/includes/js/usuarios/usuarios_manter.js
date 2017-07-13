/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	/**
	 * Função: validarUsuario
	 * Tipo: jQuery
	 * Objetivo: Realizar a validação dos usuários na aplicação.
	 */
	$.fn.extend({
		
		validarUsuario: function(){
		
			$.ajax({
				type: 'post',
				cache: false,
				dataType: 'json',
				data: $('#frmLogin :input').serializeArray(),
				url: 'validarUsuario',
				
				success: function(retornoAjax){
					
					if (retornoAjax.tipoRetornado == "success"){
						
						windows.location.href = retornoAjax.pagina;
						
					}
					else{
						
						$(this).exibirAlertaMensagem({titulo:'Erro',
													  mensagem:retornoAjax.exceptionRetornada,
													  tipoMensagem:'error'});
					
					}
					
				},
				
				timeout: 10000,
				
				error: function(XMLHttpRequest, textStatus, errorThrown){
					
					$(this).exibirMensagem({mensagem:("Ocorreu um erro interno. " + XMLHttpRequest.responseText),
						                    classe_mensagem:'alert alert-danger',
						                    id_mensagem:'#mensagens'});
					
				}
				
			});
		
		}
		
	});
	
})(jQuery)