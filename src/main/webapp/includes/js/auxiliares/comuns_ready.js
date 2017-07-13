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
		
		var loader = $('<div id="loader" class="modal-backdrop fade in" style="display: block;"><img style="position:absolute; top:25%; left:50%; margin-top:-50px;  margin-left:-50px;" src="includes/img/loading.gif" alt="loading..."></div>');
        
		
        if($('#loader').length == 0) {
            $(loader).appendTo("body");
        }
        
		
        $('#loader').hide();
        
        $(document).on("ajaxSend", loader, function(){
            $(loader).show();
        });
        
        $(document).on("ajaxComplete", loader, function(){
            $(loader).hide();
        });

        $(document).on('ajaxStop', function(){
        	$(loader).hide();
        });
		
	});
	
})(jQuery);