<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	
	<%@ taglib prefix="s" uri="/struts-tags" %>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	<title>SGPF - Cadastro de Universidade</title>
	
	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="../includes/css/bootstrap.css">
	<link rel="stylesheet" href="../includes/css/style.css">
	<link href="../font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
	<script src="../includes/js/auxiliares/jquery.maskedinput.js"></script>
	
	<!-- Imports JS para controle de página -->
	<script src="../includes/js/auxiliares/mensagens.js"></script>
	<script src="../includes/js/universidades/universidades_manter.js"></script>
	<script src="../includes/js/universidades/universidades_auxiliares.js"></script>
	<script src="../includes/js/universidades/universidades_ready.js"></script>
	
</head>
<body>

	<div class="container" id="container-login">
	
		<form id="frm_inclUniversidade" class="form-signin" width="60%">
        
        	<!-- ***** MENSAGEM INÍCIO ***** -->
  			<div id="mensagens" style="display:none;"></div>
  			<!-- ***** MENSAGEM FIM ***** -->
  			
  			<h5>Dados da Universidade</h5>
						
			<div class="form-group">
				<label for="name" class="cols-sm-2 control-label">Razão Social</label>
				<input type="text" class="form-control" name="vo.razaoSocial" id="id_razaoSocialUniversidade" placeholder="Razão Social"/>
			</div>
	
			<div class="form-group">
				<label for="email" class="cols-sm-2 control-label">Nome Fantasia</label>
				<input type="text" class="form-control" name="vo.nomeFantasia" id="id_nomeFantasiaUniversidade" placeholder="Nome Fantasia"/>
			</div>
	
			<div class="form-group">
				<label for="username" class="cols-sm-2 control-label">CNPJ</label>
				<input type="text" class="form-control" name="vo.cnpj" id="id_cnpjUniversidade" placeholder="CNPJ"/>
			</div>
						
            <div class="form-group has-feedback">
            	<input id="bt_confirmar" class="btn btn-primary btn-lg btn-block login-button" type="button" value="Confirmar"/>
            </div>
            
        </form>
        
    </div>

</body>
</html>