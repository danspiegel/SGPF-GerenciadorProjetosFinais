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
				mensagens[count++] = 'A razao social e obrigatoria.'
			}
			
			if ($('#id_nomeFantasiaUniversidade').val() == ""){
				mensagens[count++] = 'O nome fantasia e obrigatorio';
			}
			
			if ($('#id_cnpjUniversidade').val() == ""){
				mensagens[count++] = 'O CNPJ e obrigatorio.';
			}
			
			if ($('#id_logradouroUniversidade').val() == ""){
				mensagens[count++] = 'O logradouro da Universidade e obrigatorio.';
			}
			
			if ($('#id_cepUniversidade').val() == ""){
				mensagens[count++] = 'O CEP da Universidade e obrigatorio.';
			}
			
			if ($('#id_bairroUniversidade').val() == ""){
				mensagens[count++] = 'O bairro da Universidade e obrigatorio.';
			}
			
			if ($('#id_cidadeUniversidade').val() == ""){
				mensagens[count++] = 'A cidade da Universidade e obrigatoria.';
			}

			if ($('#id_estadoUniversidade').val() == ""){
				mensagens[count++] = 'A UF da Universidade e obrigatoria.';
			}
			
			if ($('#id_dddUniversidade').val() == ""){
				mensagens[count++] = 'O DDD da Universidade e obrigatorio.';
			}
			
			if ($('#id_telefoneUniversidade').val() == ""){
				mensagens[count++] = 'O telefone da Universidade e obrigatorio.'
			}
			
			if ($('#id_matriculaResponsavel').val() == ""){
				mensagens[count++] = 'O matrícula do responsável e obrigatorio.';
			}
			
			if ($('#id_nomeResponsavel').val() == ""){
				mensagens[count++] = 'O nome do responsável e obrigatorio.';
			}
			
			if ($('#id_sobrenomeResponsavel').val() == ""){
				mensagens[count++] = 'O sobrenome do responsável e obrigatorio.';
			}
			
			if ($('#id_cpfResponsavel').val() == ""){
				mensagens[count++] = 'O CPF do responsável e obrigatorio.';
			}
			
			if ($('#id_emailResponsavel').val() == ""){
				mensagens[count++] = 'O email do responsável e obrigatorio.';
			}
			
			if ($('#id_cargoResponsavel').val() == ""){
				mensagens[count++] = 'O cargo do responsável e obrigatorio.';
			}
			
			if ($('#id_logradouroResponsavel').val() == ""){
				mensagens[count++] = 'O logradouro do responsável e obrigatorio.';
			}
			
			if ($('#id_cepResponsavel').val() == ""){
				mensagens[count++] = 'O CEP do responsável e obrigatorio.';
			}
			
			if ($('#id_bairroResponsavel').val() == ""){
				mensagens[count++] = 'O bairro do responsável e obrigatorio.';
			}
			
			if ($('#id_cidadeResponsavel').val() == ""){
				mensagens[count++] = 'A cidade do responsável e obrigatoria.';
			}
			
			if ($('#id_estadoResponsavel').val() == ""){
				mensagens[count++] = 'A UF do responsável e obrigatoria.';
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
			else{
				$(this).incluirUniversidades();
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