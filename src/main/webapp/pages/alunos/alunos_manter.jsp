<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta name="decorator" content="main" />
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">


</head>
<body class="hold-transition skin-blue sidebar-mini">

        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            Meus Dados
            <small></small>
          </h1>
          <ol class="breadcrumb">
            <li><a href="#"><i class="fa fa-dashboard"></i> Meus Dados</a></li>
            <li class="active"></li>
          </ol>
        </section>
		
		<!-- Main content -->
        <section class="content">
		
			<div id="mensagens" style="display:none;">
			</div>
		
			<div class="row">
				<div class="col-md-3">
		
					<!-- Profile Image -->
					<div class="box box-primary">
						<div class="box-body box-profile">
						  <img class="profile-user-img img-responsive img-circle" src="../../includes/AdminLTE/dist/img/avatar-default.png" alt="User profile picture">

						  <h3 id="prf_nomeAluno" class="profile-username text-center"></h3>

						  <ul class="list-group list-group-unbordered">
							<li class="list-group-item">
							  <b>Curso</b> <a id="prf_cursoAluno" class="pull-right"></a>
							</li>
						  </ul>
						</div>
						<!-- /.box-body -->
					</div>
					<!-- /.box -->
				</div>
				
				<div class="col-md-9">
				
					<div class="box box-default">
						<div class="box-header with-border">
						  <h3 class="box-title">Dados Pessoais</h3>
						  <div class="box-tools pull-right">
							<button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
							<!-- <button class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button> -->
						  </div>
						</div><!-- /.box-header -->
				
						<div class="box-body">
						
							<form role="form">

							  <div class="row">	
								
								  <div class="col-md-6">
									<div class="form-group">
									  <label>Email</label>
									  <div class="input-group">
										  <span class="input-group-addon"><i class="fa fa-envelope"></i></span>
										  <input id="prf_emailAluno" class="form-control" type="text" readonly>
									  </div>
									</div>
								  </div>
						  
							  </div>
							  
							  <div class="row">
						  
								  <div class="col-md-6">
									<label>Data Início</label>
									<div class="input-group">
									  <div class="input-group-addon">
										<i class="fa fa-calendar"></i>
									  </div>
									  <input id="prf_dataInicioAluno" class="form-control pull-right" type="text" readonly>
									</div><!-- /.input group -->
								  </div>
							  
								  <div class="col-md-6">
									<label>Data Fim</label>
									<div class="input-group">
									  <div class="input-group-addon">
										<i class="fa fa-calendar"></i>
									  </div>
									  <input id="prf_dataFimAluno" class="form-control pull-right active" type="text" readonly>
									</div><!-- /.input group -->
								  </div>
							  
							  </div>

							</form>
						
						</div>
						
						<div class="box-footer">
						  <a class="btn btn-app" data-toggle="modal" data-target="#modalEditarDadosPessoais">
							<i class="fa fa-edit"></i> Editar
						  </a>
						</div><!-- /.box-footer-->
						
					</div>
				
				</div>
				
			</div>
		
		</section>
		
        <!-- Main content -->
        <section class="content">
  
		  <div class="box box-default">
            <div class="box-header with-border">
              <h3 class="box-title">Segurança</h3>
              <div class="box-tools pull-right">
                <button class="btn btn-box-tool" data-widget="collapse"><i class="fa fa-minus"></i></button>
                <!-- <button class="btn btn-box-tool" data-widget="remove"><i class="fa fa-remove"></i></button> -->
              </div>
            </div><!-- /.box-header -->

            <div class="box-body">
              <div class="row">

                <form role="form">

				  <div class="col-md-3">
                    <div class="form-group">
                      <label>Matrícula</label>
					  <div class="input-group">
						  <span class="input-group-addon"><i class="fa fa-address-card"></i></span>
						  <input id="prf_matriculaAluno" class="form-control" type="text" readonly>
					  </div>
                    </div>
                  </div>
				
				  <div class="col-md-3">
                    <label>Senha</label>
					<div class="input-group">
						<div class="input-group-addon">
							<i class="glyphicon glyphicon-lock"></i>
						</div>
						<input id="prf_senhaAluno" class="form-control" type="password" readonly>
					</div>
                  </div>
				  
                </form>

              </div><!-- /.row -->
            </div><!-- /.box-body -->
            <div class="box-footer">
              <a class="btn btn-app" data-toggle="modal" data-target="#modalEditarSenha">
                <i class="fa fa-edit"></i> Mudar Senha
              </a>
            </div><!-- /.box-footer-->

          </div> <!-- /.box box-default -->
		  
        </section> <!-- /.content -->

</body>
</html>