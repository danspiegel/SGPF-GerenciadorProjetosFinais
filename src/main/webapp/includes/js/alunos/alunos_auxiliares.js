/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	$.fn.extend({
		
		validarFiltro: function(){
			
			var mensagens = new Array();
			var count = 0;
			
			if ($('#nome').val() == ""){
				mensagens[count++] = 'O nome é obrigatório.';
			}
			
			if ($('#sobrenome').val() == ""){
				mensagens[count++] = 'O sobrenome é obrigatório.';
			}
			
			if ($('#email').val() == ""){
				mensagens[count++] = 'O email é obrigatório.';
			}
			
			if ($('#curso').val() == "-1"){
				mensagens[count++] = 'O curso é obrigatório.';
			}
			
			if ($('#matricula').val() == ""){
				mensagens[count++] = 'A matrícula é obrigatória.';
			}
			
			if ($('#senha').val() == ""){
				mensagens[count++] = 'A senha é obrigatória.';
			}
			
			if (count > 0){
				
				var content = "";
				
				for (var i = 0; i < mensagens.length; i++){
					content += mensagens[i];
					content += '<br/>';
				}
				
				$(this).esconderMensagem('#mensagens');
				
				$(this).exibirMensagem({titulo:'',
										mensagem:content,
					 					classe_mensagem:'alert alert-danger',
					 					id_mensagem:'#mensagens'});
				
			}
			else{
				
				$(this).esconderMensagem('#mensagens');
				
				$(this).incluirAluno();
				
			}
			
		}
		
	});
	
	/**
	 * Função: $(document).ready(function(){});
	 * Tipo: jQuery
	 * Objetivo: Todo o código dentro dessa função será executado quando todos os elementos estiverem carregados.
	 */
	$(document).ready(function(){
	
		$('#id_cpfAluno').mask("999.999.999-99");
		
		$('#id_numeroAluno').mask("(99)9999-9999");
	
	});
	
})(jQuery)