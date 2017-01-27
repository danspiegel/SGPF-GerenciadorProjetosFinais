/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	/**
	 * Função: validarFiltroPrimeitaEtapa
	 * Tipo: jQuery
	 * Objetivo: Validar os campos da primeira etapa do cadastro.
	 */
	$.fn.extend({
		
		validarFiltroPrimeitaEtapa: function(){
			
			var mensagens = new Array();
			var count = 0;
			
			if ($('#id_universidadeAluno').val() == "-1"){
				mensagens[count++] = 'A universidade &eacute; obrigat&oacute;ria.'
			}
			
			if ($('#id_cursoAluno').val() == "-1"){
				mensagens[count++] = 'O curso &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_matriculaAluno').val() == ""){
				mensagens[count++] = 'A matr&iacute;cula &eacute; obrigat&oacute;ria.';
			}
			
			if ($('#id_nomeAluno').val() == ""){
				mensagens[count++] = 'O nome &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_sobrenomeAluno').val() == ""){
				mensagens[count++] = 'O sobrenome &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_cpfAluno').val() == ""){
				mensagens[count++] = 'O CPF &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_emailAluno').val() == ""){
				mensagens[count++] = 'O email &eacute; obrigat&oacute;rio.';
			}

			if ($('#id_senhaAluno').val() == ""){
				mensagens[count++] = 'A senha &eacute; obrigat&oacute;ria.';
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
				
				var $active = $('.wizard .nav-tabs li.active');
		        $active.next().removeClass('disabled');
		        nextTab($active);
				
			}
			
		}
		
	});
	
	/**
	 * Função: validarFiltroSegundaEtapa
	 * Tipo: jQuery
	 * Objetivo: Validar os campos da segunda etapa do cadastro.
	 */
	$.fn.extend({
		
		validarFiltroSegundaEtapa: function(){
			
			var mensagens = new Array();
			var count = 0;
			
			if ($('#id_logradouroAluno').val() == ""){
				mensagens[count++] = 'O logradouro &eacute; obrigat&oacute;rio.'
			}
			
			if ($('#id_cepAluno').val() == ""){
				mensagens[count++] = 'O CEP &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_bairroAluno').val() == ""){
				mensagens[count++] = 'O bairro &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_municipioAluno').val() == ""){
				mensagens[count++] = 'O município &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#id_estadoAluno').val() == ""){
				mensagens[count++] = 'A UF &eacute; obrigat&oacute;ria.';
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