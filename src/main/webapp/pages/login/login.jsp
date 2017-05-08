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
    <link rel="stylesheet" href="../../includes/AdminLTE/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="../../includes/AdminLTE/dist/css/AdminLTE.min.css">
    <!-- iCheck -->
    <link rel="stylesheet" href="../../includes/AdminLTE/plugins/iCheck/square/blue.css">
    
    <!-- jQuery 2.1.4 -->
    <script src="../../includes/AdminLTE/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- Bootstrap 3.3.5 -->
    <script src="../../includes/AdminLTE/bootstrap/js/bootstrap.min.js"></script>
    <!-- iCheck -->
    <script src="../../includes/AdminLTE/plugins/iCheck/icheck.min.js"></script>

</head>
<body class="hold-transition login-page">

	<div class="login-box">
      <div class="login-logo">
        <img src="../../AdminLTE/Imagens/logotipo-uva-completo.png">
      </div><!-- /.login-logo -->
      <div class="login-box-body">
        <p class="login-box-msg">Faça login para começar a sua sessão</p>
        <form id="frmLogin" action="" method="post">
          <div class="form-group has-feedback">
          	<label>Tipo de Usuário</label>
            <select class="form-control" name="tipoUsuario">
            	<option value="-1">Selecione...</option>
            	<option value="0">Aluno</option>
            	<option value="1">Professor</option>
            </select>
          </div>
          <div class="form-group has-feedback">
          	<label>Matrícula</label>
            <input type="text" class="form-control" placeholder="Matrícula">
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
          	<label>Senha</label>
            <input type="password" class="form-control" placeholder="Password">
            <span class="glyphicon glyphicon-lock form-control-feedback"></span>
          </div>
          <div class="row">

            <div class="col-xs-12">
              <a id="btn_entrar" class="btn btn-primary btn-block btn-flat">Entrar</a>
            </div><!-- /.col -->
          </div>
        </form>

        <div class="social-auth-links text-center">
        </div><!-- /.social-auth-links -->

        <a href="#">Esqueci minha senha</a>

      </div><!-- /.login-box-body -->
    </div><!-- /.login-box -->

</body>
</html>