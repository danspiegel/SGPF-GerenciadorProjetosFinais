/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	/**
	 * Função: listarEstados
	 * Tipo: jQuery
	 * Objetivo: Retornar a lista de estados.
	 */
	$.fn.extend({
		
		listarEstados: function(){
			
			$.ajax({
				type: 'post',
				cache: false,
				dataType: 'json',
				url: 'listarEstados',
				
				success: function(retornoAjax){
					
					if (retornoAjax.tipoRetornado == "success"){
						$(this).construirListaEstados(retornoAjax.objetoRetornado);
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
	
	/**
	 * Função: construirListaEstados
	 * Tipo: jQuery
	 * Objetivo: Construir o combobox de estados.
	 */
	$.fn.extend({
		
		construirListaEstados: function(obj){
			
			var content = '';
			
			content += '<option value="-1" selected>Selecione...</option>';
				
			if (obj.length != 0){
				
				for (var i=0; obj.length > i; i++){
					content += '<option value="' + obj[i].id + '">' + obj[i].descricao + '</option>';
				}
				
			}
			
			$('#id_estadoUniversidade').html(content);
			
			$('#id_estadoResponsavel').html(content);
			
		}
		
	});
	
	/**
	 * Função: incluirAluno
	 * Tipo: jQuery
	 * Objetivo: Realizar a inclusão do aluno.
	 */
	$.fn.extend({
		
		incluirAluno: function(){
		
			$.ajax({
				type: 'post',
				cache: false,
				dataType: 'json',
				data: $('#frm_inclAluno').serializeArray(),
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