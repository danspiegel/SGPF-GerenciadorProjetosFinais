/**
 * Função: (function($){})(jQuery);
 * Objetivo: É utilizada para estender as funções do jQuery.
 */
(function($){
	
	/**
	 * Função: $(document).ready(function(){});
	 * Tipo: jQuery
	 * Objetivo: Todo o código dentro dessa função será executado quando todos os elementos estiverem carregados.
	 */
	$(document).ready(function(){
		
		var loader = $('<div id="loader" class="modal-backdrop fade in" style="display: block;"></div>');
        
		
        if($('#loader').length == 0) {
            $(loader).appendTo("body");
        }
		
        $('#loader').hide();
        
        $(document).on("ajaxSend", loader, function(){
        	$(this).exibirCarregando();
            $(loader).show();
        });
        
        $(document).on("ajaxComplete", loader, function(){
        	//$(this).fecharCarregando();
            $(loader).hide();
        });

        $(document).on('ajaxStop', function(){
        	//$(this).fecharCarregando();
        	$(loader).hide();
        });
        
        $('#btn_entrar').on("click", function(){
        	$(this).validarFiltro();
        });
	
	});
	
})(jQuery)