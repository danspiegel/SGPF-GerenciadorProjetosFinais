<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	
	<%@ taglib prefix="s" uri="/struts-tags" %>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
	<title>SGPF - Cadastro de Universidade</title>
	
    <script src="../includes/js/jquery-3.1.1.min.js"></script>
	<script src="../includes/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
	<link href="../includes/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
	<link href="../includes/css/cadastro_universidade.css" rel="stylesheet" type="text/css">
	<link href="../font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
	<!-- Google Fonts -->
	<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
	<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
	
</head>
<body>
	<div class="container">
		<div class="row main">
			<div class="main-login main-center">
			
				<div id="mensagens"></div>
			
				<form class="" method="" action="">
					
					<h5>Dados da Universidade</h5>
						
					<div class="form-group">
						<label for="name" class="cols-sm-2 control-label">Razão Social</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
								<input type="text" class="form-control" name="vo.razaoSocial" id="id_razaoSocialUniversidade" placeholder="Razão Social"/>
							</div>
						</div>
					</div>
	
					<div class="form-group">
						<label for="email" class="cols-sm-2 control-label">Nome Fantasia</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-envelope fa" aria-hidden="true"></i></span>
								<input type="text" class="form-control" name="vo.nomeFantasia" id="id_nomeFantasiaUniversidade" placeholder="Nome Fantasia"/>
							</div>
						</div>
					</div>
	
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">CNPJ</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
								<input type="text" class="form-control" name="vo.cnpj" id="id_cnpjUniversidade" placeholder="CNPJ"/>
							</div>
						</div>
					</div>
						
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">Logradouro</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
								<input type="text" class="form-control" name="vo.endereco.logradouro" id="id_logradouroUniversidade" placeholder="Logradouro"/>
							</div>
						</div>
					</div>
						
					<div class="form-group">
							<label for="username" class="cols-sm-2 control-label">CEP</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
									<input type="text" class="form-control" name="vo.endereco.cep" id="id_cepUniversidade" placeholder="CEP"/>
								</div>
							</div>
					</div>
						
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">Bairro</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
								<input type="text" class="form-control" name="vo.endereco.bairro" id="id_bairroUniversidade" placeholder="Bairro"/>
							</div>
						</div>
					</div>
						
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">Cidade</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
								<input type="text" class="form-control" name="vo.endereco.cidade" id="id_cidadeUniversidade" placeholder="Cidade"/>
							</div>
						</div>
					</div>
						
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">UF</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"><i class="fa fa-users fa" aria-hidden="true"></i></span>
	            				<s:select id="id_estadoUniversidade" name="vo.endereco.estado.id"  list="listaEstados" listKey="id" listValue="descricao" headerValue="Selecione..." headerKey="-1"/>
							</div>
						</div>
					</div>
	
						
					<div class="form-group">
								
						<label for="username" class="cols-sm-2 control-label">Telefone</label>
								
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.telefone.numeroDdd" id="id_dddUniversidade"  placeholder="DDD" size="3" maxlength="2"/>
							</div>
								
							<br/>
								
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.telefone.telefone" id="id_telefoneUniversidade"  placeholder="Telefone" size="10" maxlength="8"/>
							</div>
						</div>
							
					</div>
					
					<h5>Dados do Responsável</h5>
					
					<div class="form-group">
						<label for="name" class="cols-sm-2 control-label">Matrícula</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.matricula" id="id_matriculaResponsavel"  placeholder="Matrícula"/>
							</div>
						</div>
					</div>
	
					<div class="form-group">
						<label for="email" class="cols-sm-2 control-label">Nome</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.nome" id="id_nomeResponsavel"  placeholder="Nome"/>
							</div>
						</div>
					</div>
	
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">Sobrenome</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.sobrenome" id="id_sobrenomeResponsavel"  placeholder="Sobrenome"/>
							</div>
						</div>
					</div>
						
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">CPF</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.cpf" id="id_cpfResponsavel"  placeholder="CPF"/>
							</div>
						</div>
					</div>
						
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">Email</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.email" id="id_emailResponsavel"  placeholder="Email"/>
							</div>
						</div>
					</div>
						
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">Cargo</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.cargo" id="id_cargoResponsavel"  placeholder="Cargo"/>
							</div>
						</div>
					</div>
						
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">Logradouro</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.endereco.logradouro" id="id_logradouroResponsavel"  placeholder="Logradouro"/>
							</div>
						</div>
					</div>
						
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">CEP</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.endereco.cep" id="id_cepResponsavel"  placeholder="CEP"/>
							</div>
						</div>
					</div>
						
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">Bairro</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.endereco.bairro" id="id_bairroResponsavel"  placeholder="Bairro"/>
							</div>
						</div>
					</div>
	
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">Cidade</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.endereco.cidade" id="id_cidadeResponsavel"  placeholder="Cidade"/>
							</div>
						</div>
					</div>
	
					<div class="form-group">
						<label for="username" class="cols-sm-2 control-label">UF</label>
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<select id="id_estadoResponsavel" class="form-control" name="vo.responsavel.endereco.estado.id">
	            					<option value="-1">Selecione...</option>
	            				</select>
							</div>
						</div>
					</div>
						
					<div class="form-group">
								
						<label for="username" class="cols-sm-2 control-label">Telefone</label>
								
						<div class="cols-sm-10">
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.telefone.numeroDdd" id="id_dddResponsavel"  placeholder="DDD" size="3" maxlength="2"/>
							</div>
								
							<br/>
								
							<div class="input-group">
								<span class="input-group-addon"></span>
								<input type="text" class="form-control" name="vo.responsavel.telefone.telefone" id="id_telefoneResponsavel"  placeholder="Telefone" size="10" maxlength="8"/>
							</div>
						</div>
							
					</div>	
						
					<div class="form-group ">
						<a href="" type="button" id="bt_confirmar" class="btn btn-primary btn-lg btn-block login-button">Confirmar</a>
					</div>
					
				</form>
			</div>
		</div>
	</div>
</body>
</html>