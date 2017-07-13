/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	$.fn.extend({
		
		exibirCarregando: function(){
			
			swal({
				title: 'Conectando...',
				text: 'Isso pode demorar algum tempo.',
				imageUrl: 'includes/img/ring.gif',
				imageWidth: 150,
				imageHeight: 100,
				animation: false,
				showConfirmButton: false,
				allowOutsideClick: false
			})
			
		}
		
	});
	
	$.fn.extend({
		
		fecharCarregando: function(){
			
			swal.close();
			
		}
		
	});
	
	$.fn.extend({
		
		validarFiltro: function(){
			
			var mensagens = new Array();
			var count = 0;
			
			if ($('#tipoUsuario').val() == "-1"){
				mensagens[count++] = 'O tipo de usu&aacute;rio &eacute; obrigat&oacute;rio.';
			}
			
			if ($('#matricula').val() == ""){
				mensagens[count++] = 'A matr&iacute;cula &eacute; obrigat&oacute;ria.';
			}
			
			if ($('#senha').val() == ""){
				mensagens[count++] = 'A senha &eacute; obrigat&oacute;ria.';
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
				
				$(this).validarUsuario();
				
			}
			
		}
		
	});
	
})(jQuery);
	