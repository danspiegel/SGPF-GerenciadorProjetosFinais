<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	
	<%@ taglib prefix="s" uri="/struts-tags" %>

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>SGPF - Cadastro de Aluno</title>
	
		<link rel="stylesheet" href="../includes/font-awesome-4.7.0/css/font-awesome.min.css">
	    <link href="../includes/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	    <link href="../includes/css/style.css" rel="stylesheet" type="text/css">
	    <script src="../includes/js/jquery-3.1.1.min.js"></script>
	    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
		<script src="../includes/js/jquery.js" type="text/javascript"></script>
		
		<!-- Imports de JS de controle -->
		<script type="text/javascript" src="../includes/js/alunos/alunos_auxiliares.js"></script>
		<script type="text/javascript" src="../includes/js/alunos/alunos_manter.js"></script>
		<script type="text/javascript" src="../includes/js/alunos/alunos_ready.js"></script>
		
	</head>
	<body>
	    <div class="container">
	        <div class="card card-container">
	        
	        	<div id="mensagens"></div>
	        	
	            <form id="frm_cadastrarAluno">
	            	<div class="input-group">
	            		<div class="input-group-addon">
	            			<span class="fa fa-user"></span>
	            		</div>
	            		<s:select id="id_universidade" name="vo.universidade.id"  list="listaUniversidades" listKey="id" listValue="descricao" headerValue="Selecione..." headerKey="-1"/>	
	                </div>
	                
	                <br/>
	                
	            	<div class="input-group">
	            		<div class="input-group-addon">
	            			<span class="fa fa-address-card"></span>
	            		</div>
	                	<input id="id_matricula" class="form-control" name="vo.matricula" type="text" placeholder="Matrícula" required autofocus>
	                </div>
	                
	                <br/>
	                
	                <div class="input-group">
	            		<div class="input-group-addon">
	            			<span class="fa fa-user"></span>
	            		</div>
	                	<input id="id_cpf" class="form-control" name="vo.cpf" type="text" placeholder="CPF" required autofocus>
	                </div>
	                
	                <br/>
	                
	                <div class="input-group">
	            		<div class="input-group-addon">
	            			<span class="fa fa-envelope"></span>
	            		</div>
	                	<input id="id_email" class="form-control" name="vo.email" type="text" placeholder="Email" required autofocus>
	                </div>
	                
	                <br/>
	                
	                <div class="input-group">
	                	<div class="input-group-addon">
	            			<span class="fa fa-lock"></span>
	            		</div>
	                	<input id="id_senha" class="form-control" name="vo.senha" type="password" placeholder="Senha" required>
	                </div>
	                
	                <br/>
	                
	                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Confirmar</button>
	                
	            </form>
	        </div>
	    </div>
	</body>
</html>