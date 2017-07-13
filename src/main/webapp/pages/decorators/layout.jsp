<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
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
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
    <link rel="stylesheet" href="../../includes/AdminLTE/dist/css/skins/skin-blue.css">
	<!-- bootstrap datepicker -->
	<link rel="stylesheet" href="../../includes/AdminLTE/plugins/datepicker/datepicker3.css">
	<!-- Sweet Alert 2 -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.6.2/sweetalert2.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
	
	<!-- REQUIRED JS SCRIPTS -->

    <!-- jQuery 2.1.4 -->
	<script src="../../includes/AdminLTE/plugins/jQuery/jQuery-2.1.4.min.js"></script>
	<!-- Bootstrap 3.3.6 -->
    <script src="../../includes/AdminLTE/bootstrap/js/bootstrap.min.js"></script>
    <!-- AdminLTE App -->
    <script src="../../includes/AdminLTE/dist/js/app.min.js"></script>
	<!-- bootstrap datepicker -->
	<script src="../../includes/AdminLTE/plugins/datepicker/bootstrap-datepicker.js"></script>
	<!-- InputMask -->
	<script src="../../includes/AdminLTE/plugins/input-mask/jquery.inputmask.js"></script>
	<script src="../../includes/AdminLTE/plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
	<script src="../../includes/AdminLTE/plugins/input-mask/jquery.inputmask.extensions.js"></script>
	<!-- bootstrap color picker -->
	<script src="../../includes/AdminLTE/plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
	<!-- bootstrap time picker -->
	<script src="../../includes/AdminLTE/plugins/timepicker/bootstrap-timepicker.min.js"></script>
	<!-- SlimScroll 1.3.0 -->
	<script src="../../includes/AdminLTE/plugins/slimScroll/jquery.slimscroll.min.js"></script>
	<!-- iCheck 1.0.1 -->
	<script src="../../includes/AdminLTE/plugins/iCheck/icheck.min.js"></script>
	<!-- FastClick -->
	<script src="../../includes/AdminLTE/plugins/fastclick/fastclick.js"></script>
	<!-- Sweet Alert 2 -->
	<script src="https://cdn.jsdelivr.net/sweetalert2/6.6.2/sweetalert2.min.js"></script>
	
	<!-- JS de Controle -->
	<script src="../../includes/js/auxiliares/comuns_auxiliares.js"></script>
	<script src="../../includes/js/auxiliares/comuns_ready.js"></script>
	
	<decorator:head />

</head>
<body class="hold-transition skin-blue sidebar-mini">

	<div class="wrapper">

	  <!-- Main Header -->
      <header class="main-header">

        <!-- Logo -->
        <a class="logo">
          <!-- mini logo for sidebar mini 50x50 pixels -->
          <span class="logo-mini">
			<img src="../../includes/AdminLTE/Imagens/logotipo-uva-parcial.png" width="40" height="40">
		  </span>
          <!-- logo for regular state and mobile devices -->
		  <span class="logo-lg">
			<img src="../../includes/AdminLTE/Imagens/logotipo-uva-completo.png" width="140" height="40">
		  </span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only"></span>
          </a>
          
		  <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              
              <!-- Notifications: style can be found in dropdown.less -->
              <li class="dropdown notifications-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <i class="fa fa-bell-o"></i>
                  <span class="label label-warning"></span>
                </a>
                <ul class="dropdown-menu">
                  <li class="header">Nenhuma notificação encontrada.</li>
                </ul>
              </li>
             
              <!-- User Account: style can be found in dropdown.less -->
              <li class="dropdown user user-menu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <img src="../../includes/AdminLTE/dist/img/avatar-default.png" class="user-image" alt="User Image">
                  <span class="hidden-xs">Alexander Pierce</span>
                </a>
                <ul class="dropdown-menu">
                  <!-- User image -->
                  <li class="user-header">
                    <img src="../../includes/AdminLTE/dist/img/avatar-default.png" class="img-circle" alt="User Image">
                    <p>
                      Alexander Pierce - Web Developer
                    </p>
                  </li>
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <div class="pull-left">
                      <a href="../pages/docentes/docentes_manter.jsp" class="btn btn-default btn-flat">Meus Dados</a>
                    </div>
                    <div class="pull-right">
                      <a href="#" class="btn btn-default btn-flat">Sair</a>
                    </div>
                  </li>
                </ul>
              </li>
              
            </ul>
          </div>
		  
        </nav>
      </header>
      
      <!-- Left side column. contains the logo and sidebar -->
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">
          <!-- Sidebar Menu -->
          <ul class="sidebar-menu">
			<!-- Início -->
            <li class="treeview">
              <a href="#">
                <i class="fa fa-link"></i> <span>Meus Dados</span></i>
              </a>
            </li>
		  
            <!-- Optionally, you can add icons to the links -->
            <!-- Oportunidades -->
            <li class="treeview active">
              <a href="#">
				<i class="fa fa-link"><a href="#"></a></i> <span>Docentes</span> <i class="fa fa-angle-left pull-right"></i>
			  </a>
              <ul class="treeview-menu">
                <li><a href="../paginas/docentes_consultar.html"><i class="fa fa-circle-o"></i> Consultar</a></li>
              </ul>
            </li>

            <!-- Clientes -->
            <li class="treeview ">
              <a href="#">
                <i class="fa fa-link"></i> <span>Monografias</span> <i class="fa fa-angle-left pull-right"></i>
              </a>
			  <ul class="treeview-menu">
                <li><a href="#"><i class="fa fa-circle-o"></i> Cadastrar</a></li>
              </ul>
			  <ul class="treeview-menu">
                <li><a href="#"><i class="fa fa-circle-o"></i> Consultar</a></li>
              </ul>
            </li>

          </ul><!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
      </aside>
      
      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
      
      	<div id="mensagens" class="" style="display:none;"></div>
      	
      	<decorator:body/>
      	
      </div>
      
      <!-- Main Footer -->
      <footer class="main-footer">
        <!-- To the right -->
        <div class="pull-right hidden-xs">
        </div>
        <!-- Default to the left -->
        <strong>Copyright &copy; 2017</strong>
      </footer>

	</div>

</body>
</html>