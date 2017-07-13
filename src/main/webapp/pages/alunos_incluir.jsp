<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>SGPF - Sistema Gerenciador de Projetos Finais</title>
	<!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<!-- Bootstrap 3.3.5 -->
    <link rel="stylesheet" href="includes/AdminLTE/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="includes/AdminLTE/dist/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="includes/AdminLTE/plugins/iCheck/square/blue.css">
    <!-- Sweet Alert 2 -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.6.2/sweetalert2.css">
    
    <!-- jQuery 2.1.4 -->
    <script src="includes/AdminLTE/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- Bootstrap 3.3.5 -->
    <script src="includes/AdminLTE/bootstrap/js/bootstrap.min.js"></script>
    <!-- iCheck -->
    <script src="includes/AdminLTE/plugins/iCheck/icheck.min.js"></script>
    <!-- Sweet Alert 2 -->
	<script src="https://cdn.jsdelivr.net/sweetalert2/6.6.2/sweetalert2.min.js"></script>
	
	<!-- JS de Controle -->
	<script src="includes/js/auxiliares/mensagens.js"></script>
	<script src="includes/js/auxiliares/comuns_auxiliares.js"></script>
	<script src="includes/js/auxiliares/comuns_ready.js"></script>
	<script src="includes/js/usuarios/usuarios_auxiliares.js"></script>
	<script src="includes/js/usuarios/usuarios_manter.js"></script>
	<script src="includes/js/usuarios/usuarios_ready.js"></script>

</head>
<body class="hold-transition login-page">

	<div class="login-box">
      <div class="login-logo">
        <img src="includes/AdminLTE/Imagens/logotipo-uva-completo.png" width="200" height="80">
      </div><!-- /.login-logo -->
      <div class="login-box-body">
      	<div id="mensagens" class="" role="alert"></div>
        <form id="frmLogin" action="" method="post">
          <div class="form-group has-feedback">
          	<label>Nome</label>
            <input id="nome" name="usuario.aluno.aluno.nome" type="text" class="form-control" placeholder="Nome">
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
          	<label>Sobrenome</label>
            <input id="sobrenome" name="usuario.aluno.aluno.sobrenome" type="text" class="form-control" placeholder="Sobrenome">
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
          	<label>Email</label>
            <input id="email" name="usuario.aluno.aluno.email" type="text" class="form-control" placeholder="Email">
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
          	<label>Curso</label>
            <select id="idCurso" class="form-control" name="usuario.aluno.curso.id"> </select>
          </div>
          <div class="form-group has-feedback">
          	<label>Matrícula</label>
            <input id="matricula" name="usuario.matricula" type="text" class="form-control" placeholder="Matrícula">
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
          	<label>Senha</label>
            <input id="senha" name="usuario.senha" type="password" class="form-control" placeholder="Password">
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
          </div>
          <div class="row">

            <div class="col-xs-12">
              <a id="btn_enviar" class="btn btn-primary btn-block btn-flat">Enviar</a>
            </div><!-- /.col -->
          </div>
        </form>

        <div class="social-auth-links text-center">
        </div><!-- /.social-auth-links -->

      </div><!-- /.login-box-body -->
    </div><!-- /.login-box -->

</body>
</html>