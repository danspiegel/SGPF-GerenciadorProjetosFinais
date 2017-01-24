/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	$.fn.extend({
		
		incluirAluno: function(){
		
			$.ajax({
				type: 'post',
				cache: false,
				dataType: 'json',
				data: $('#frm_cadastrarAluno').serializeArray(),
				url: 'cadastrarAluno',
				
				success: function(retornoAjax){
					
					if (retornoAjax.tipoRetornado == "success"){
						$(this).exibirMensagem({mensagem:retornoAjax.objetoRetornado,
                                                classe_mensagem:'alert alert-success',
                                                id_mensagem:'#mensagens'});
					}
					else{
						$(this).exibirMensagem({mensagem:retornoAjax.exceptionRetornada,
		                                        classe_mensagem:'alert alert-danger',
		                                        id_mensagem:'#mensagens'});
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