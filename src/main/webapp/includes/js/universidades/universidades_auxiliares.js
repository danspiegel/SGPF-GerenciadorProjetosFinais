/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	/**
	 * Função: validarFiltroPrimeiraEtapa
	 * Tipo: jQuery
	 * Objetivo: Validar os campos da primeira parte do cadastro de universidades.
	 */
	$.fn.extend({
		
		validarFiltroPrimeiraEtapa: function(){
			
			var mensagens = new Array();
			var count = 0;
			
			if ($('#id_razaoSocialUniversidade').val() == ""){
				mensagens[count++] = 'A raz&atilde;o social &eacute; obrigat&oacute;ria.'
			}
			
			if ($('#id_nomeFantasiaUniversidade').val() == ""){
				mensagens[count++] = 'O nome fantasia &eacute; obrigat&oacute;rio';
			}
			
			if ($('#id_cnpjUniversidade').val() == ""){
				mensagens[count++] = 'O CNPJ &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_logradouroUniversidade').val() == ""){
				mensagens[count++] = 'O logradouro da Universidade &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_cepUniversidade').val() == ""){
				mensagens[count++] = 'O CEP da Universidade &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_bairroUniversidade').val() == ""){
				mensagens[count++] = 'O bairro da Universidade &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_cidadeUniversidade').val() == ""){
				mensagens[count++] = 'A cidade da Universidade &eacute; obrigat&oacute;ria.';
			}

			if ($('#id_estadoUniversidade').val() == "-1"){
				mensagens[count++] = 'A UF da Universidade &eacute; obrigat&oacute;ria.';
			}
			
			if ($('#id_dddUniversidade').val() == ""){
				mensagens[count++] = 'O DDD da Universidade &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_numeroUniversidade').val() == ""){
				mensagens[count++] = 'O telefone da Universidade &eacute; obrigat&oacute;rio.'
			}
			
			if (count > 0){
				
				var content = "";
				
				for (var i = 0; i < mensagens.length; i++){
					content += mensagens[i];
					content += '<br/>';
				}
				
				$(this).esconderMensagem('#mensagens');
				
				$(this).exibirMensagem({ mensagem: content,
					                     classe_mensagem: 'alert alert-danger',
					                     id_mensagem: '#mensagens'});
				
			}
			else{
				
				$(this).esconderMensagem('#mensagens');
				
				/*
				var $active = $('.wizard .nav-tabs li.active');
		        $active.next().removeClass('disabled');
		        nextTab($active);
		        */
				
				$(this).incluirUniversidades();
			}
			
		}
		
	});
	
	
	/**
	 * Função: validarFiltroSegundaEtapa
	 * Tipo: jQuery
	 * Objetivo: Validar os campos da segunda parte do cadastro de universidades.
	 */
	$.fn.extend({
		
		validarFiltroSegundaEtapa: function(){
			
			var mensagens = new Array();
			var count = 0;
			
			if ($('#id_matriculaResponsavel').val() == ""){
				mensagens[count++] = 'O matr&iacute;cula do respons&aacute;vel &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_nomeResponsavel').val() == ""){
				mensagens[count++] = 'O nome do respons&aacute;vel &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_sobrenomeResponsavel').val() == ""){
				mensagens[count++] = 'O sobrenome do respons&aacute;vel &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_cpfResponsavel').val() == ""){
				mensagens[count++] = 'O CPF do respons&aacute;vel &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_emailResponsavel').val() == ""){
				mensagens[count++] = 'O email do respons&aacute;vel &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_cargoResponsavel').val() == ""){
				mensagens[count++] = 'O cargo do respons&aacute;vel &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_logradouroResponsavel').val() == ""){
				mensagens[count++] = 'O logradouro do respons&aacute;vel &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_cepResponsavel').val() == ""){
				mensagens[count++] = 'O CEP do respons&aacute;vel &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_bairroResponsavel').val() == ""){
				mensagens[count++] = 'O bairro do respons&aacute;vel &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_cidadeResponsavel').val() == ""){
				mensagens[count++] = 'A cidade do respons&aacute;vel &eacute; obrigat&oacute;ria.';
			}
			
			if ($('#id_estadoResponsavel').val() == "-1"){
				mensagens[count++] = 'A UF do respons&aacute;vel &eacute; obrigat&oacute;ria.';
			}
			
			if ($('#id_dddResponsavel').val() == ""){
				mensagens[count++] = 'O DDD do respons&aacute;vel &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_numeroResponsavel').val() == ""){
				mensagens[count++] = 'O telefone do respons&aacute;vel &eacute; obrigat&oacute;rio.'
			}
			
			if (count > 0){
				
				var content = "";
				
				for (var i = 0; i < mensagens.length; i++){
					content += mensagens[i];
					content += '<br/>';
				}
				
				$(this).esconderMensagem('#mensagens');
				
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
		
		$('#id_cpfResponsavel').mask("999.999.999-99");
		
		$('#id_numeroUniversidade').mask("(99)9999-9999");
		
		$('#id_numeroResponsavel').mask("(99)9999-9999");
		
	});
	
})(jQuery);