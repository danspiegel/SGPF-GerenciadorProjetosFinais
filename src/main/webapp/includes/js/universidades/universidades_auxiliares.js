/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	$.fn.extend({
		
		validarFiltro: function(){
			
			var mensagens = new Array();
			var count = 0;
			
			if ($('#id_razaoSocialUniversidade').val() == ""){
				mensagens[count++] = 'A razão social é obrigatório.'
			}
			
			if ($('#id_nomeFantasiaUniversidade').val() == ""){
				mensagens[count++] = 'O nome fantasia é obrigatório';
			}
			
			if ($('#id_cnpjUniversidade').val() == ""){
				mensagens[count++] = 'O CNPJ é obrigatório.';
			}
			
			if ($('#id_logradouroUniversidade').val() == ""){
				mensagens[count++] = 'O logradouro da Universidade é obrigatório.';
			}
			
			if ($('#id_cepUniversidade').val() == ""){
				mensagens[count++] = 'O CEP da Universidade é obrigatório.';
			}
			
			if ($('#id_bairroUniversidade').val() == ""){
				mensagens[count++] = 'O bairro da Universidade é obrigatório.';
			}
			
			if ($('#id_cidadeUniversidade').val() == ""){
				mensagens[count++] = 'A cidade da Universidade é obrigatória.';
			}

			if ($('#id_estadoUniversidade').val() == ""){
				mensagens[count++] = 'A UF da Universidade é obrigatória.';
			}
			
			if ($('#id_dddUniversidade').val() == ""){
				mensagens[count++] = 'O DDD da Universidade é obrigatório.';
			}
			
			if ($('#id_telefoneUniversidade').val() == ""){
				mensagens[count++] = 'O telefone da Universidade é obrigatório.'
			}
			
			if ($('#id_matriculaResponsavel').val() == ""){
				mensagens[count++] = 'O matrícula do responsável é obrigatório.';
			}
			
			if ($('#id_nomeResponsavel').val() == ""){
				mensagens[count++] = 'O nome do responsável é obrigatório.';
			}
			
			if ($('#id_sobrenomeResponsavel').val() == ""){
				mensagens[count++] = 'O sobrenome do responsável é obrigatório.';
			}
			
			if ($('#id_cpfResponsavel').val() == ""){
				mensagens[count++] = 'O CPF do responsável é obrigatório.';
			}
			
			if ($('#id_emailResponsavel').val() == ""){
				mensagens[count++] = 'O email do responsável é obrigatório.';
			}
			
			if ($('#id_cargoResponsavel').val() == ""){
				mensagens[count++] = 'O cargo do responsável é obrigatório.';
			}
			
			if ($('#id_logradouroResponsavel').val() == ""){
				mensagens[count++] = 'O logradouro do responsável é obrigatório.';
			}
			
			if ($('#id_cepResponsavel').val() == ""){
				mensagens[count++] = 'O CEP do responsável é obrigatório.';
			}
			
			if ($('#id_bairroResponsavel').val() == ""){
				mensagens[count++] = 'O bairro do responsável é obrigatório.';
			}
			
			if ($('#id_cidadeResponsavel').val() == ""){
				mensagens[count++] = 'A cidade do responsável é obrigatória.';
			}
			
			if ($('#id_estadoResponsavel').val() == ""){
				mensagens[count++] = 'A UF do responsável é obrigatória.';
			}
			
			if (count > 0){
				
				var content = "";
				
				for (var i = 0; i < mensagens.length; i++){
					content += mensagens[i];
					content += '<br/>';
				}
				
				$(this).esconderMensagem('#mensagens ');
				
				$(this).exibirMensagem({ mensagem: content,
					                     classe_mensagem: 'alert alert-danger',
					                     id_mensagem: '#mensagens'});
				
			}
			
		}
		
	});
	
	/**
	 * Função: $(document).ready(function()
	 * Tipo: jQuery
	 * Objetivo: Os codigos dentro desta funcao serao executados quando todos os elementos da pagina tiverem sido carregados.
	 */
	$(document).ready(function(){
		
		$('#id_cnpjUniversidade').mask("99.999.999/9999-99");
		
	});
	
})(jQuery);