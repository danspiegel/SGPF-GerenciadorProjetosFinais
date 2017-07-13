/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	$.fn.extend({
		
		carregarUsuario: function(){
			
			$.ajax({
				type: 'post',
				cache: false,
				dataType: 'json',
				url: 'carregarUsuario',
				
				success: function(retornoAjax){
					
					if (retornoAjax.tipoRetornado == "success"){
						
						$('#prf_nomeAluno').val(retornoAjax.objetoRetornado.aluno.aluno.nome + " " + retornoAjax.objetoRetornado.aluno.aluno.sobrenome);
						$('#prf_cursoAluno').val(retornoAjax.objetoRetornado.aluno.curso.descricao);
						$('#prf_emailAluno').val(retornoAjax.objetoRetornado.aluno.aluno.email);
						$('#prf_dataInicioAluno').val(retornoAjax.objetoRetornado.aluno.dataInicio);
						$('#prf_dataFimAluno').val(retornoAjax.objetoRetornado.aluno.dataFim);
						$('#prf_matriculaAluno').val(retornoAjax.objetoRetornado.matricula);
						$('#prf_senhaAluno').val(retornoAjax.objetoRetornado.senha);
						
					}
					else{
						
						$(this).exibirMensagem({titulo:'Erro',
												mensagem:retornoAjax.exceptionRetornada,
							                    classe_mensagem:'alert alert-danger alert-dismissible',
							                    id_mensagem:'#mensagens'});
					
					}
					
				},
				
				timeout: 10000,
				
				error: function(XMLHttpRequest, textStatus, errorThrown){
					
					$(this).exibirMensagem({titulo:'Erro',
											mensagem:("Ocorreu um erro interno. " + XMLHttpRequest.responseText),
						                    classe_mensagem:'alert alert-danger alert-dismissible',
						                    id_mensagem:'#mensagens'});
					
				}
				
			});
			
		}
		
	});
	
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